package ie.atu.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        System.out.println("Array in reverse:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}