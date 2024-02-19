import java.util.EmptyStackException;

public class Stack {
     private int size;
     private int[] stackArray;
     private int top;

     public Stack(int size) {
         this.size = size;
         this.stackArray = new int[size];
         this.top = -1;
     }

     public void push(int value) {
         if (top < (size -1)) {
             stackArray[++top] = value;
         } else {
             System.out.println("stack is full.");
         }
     }

     public int pop() {
         if (top >= 0) {
             return stackArray[top--];
         } else {
             throw new EmptyStackException();
         }
     }

     public int peek() {
         if (top >= 0) {
             return stackArray[top];
         } else {
             throw new EmptyStackException();
         }
     }

     public boolean isEmpty() {
         return (top == -1);
     }

     public static void main(String[] args) {
         Stack stack = new Stack(10);

         stack.push(1);
         stack.push(3);
         stack.push(4);

         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack.isEmpty());
     }
}
