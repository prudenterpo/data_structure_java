import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArrayInverter  {

	public static int[] invertArray(int[] inputArray) {
		int[] invertedArray = new int[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {;
				invertedArray[i] = inputArray[inputArray.length - 1 - i];
		}
		return invertedArray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the array integer values separated by space");

		String input = scanner.nextLine();

		String[] stringInput = input.split(" ");

		List<Integer> intList = new ArrayList<>();

		for (String stringValue : stringInput) {
			try {
				intList.add(Integer.parseInt(stringValue));

			} catch (NumberFormatException e) {
				System.out.println(stringInput + "is not a valid integer!");
			}
		}

		int[] originalArray = intList.stream().mapToInt(i -> i).toArray();

		int[] invertedArray = invertArray(originalArray);

		for (int value : invertedArray) {
			System.out.print(value + " ");
		}

	}	
}
