package ie.atu.arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, Arrays!");
    }   

    public void sampleMethod() {
        // Sample method to demonstrate additional functionality
        int[] sampleArray = new int[5];
        for (int i = 0; i < sampleArray.length; i++) {
            sampleArray[i] = i * 2;
        }
        System.out.println("Sample array values:");
        for (int value : sampleArray) {
            System.out.print(value + " ");
        }
    }
}
