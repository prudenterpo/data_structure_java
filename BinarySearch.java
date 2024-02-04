
public class BinarySearch {
	
	public static int search(int[] sortedArray, int target) {
		int low = 0;
		int high = sortedArray.length -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
		
			if (sortedArray[mid] == target) {
				return mid;
			} else if (sortedArray[mid] < target) {
					low = mid + 1;
			} else {
					high = mid -1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] sortedArray = {1, 3, 5, 7, 9, 11};
		int target = 7;

		int resultIndex = search(sortedArray, target);

		if (resultIndex != -1) {
			System.out.println("Target found index: " + resultIndex);

		} else {
			System.out.println("Elemento não encontrado!");
		}
	}
}

