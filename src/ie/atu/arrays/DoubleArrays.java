// ...existing code...
package ie.atu.arrays;

public class DoubleArrays {

    public static void main(String[] args) {
        // Declaration and initialization of a 2D array
        double[][] array1;
        array1 = new double[3][4]; // Now initialized with default values (0.0)

        double [][] array2 = new double[2][3]; // 2 rows, 3 columns, default values (0.0)

        double [][] array3 = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6}
        };

        double [][] array4 = new double[][] {
            {7.7, 8.8, 9.9},
            {10.1, 11.11, 12.12}    
        };

        // Inline initialization of a 1D double array
        double[] array5 = {1.5, 2.5, 3.5, 4.5};

        // Displaying elements of array3
        for (double num : array3[0]) {
            System.out.print(num + " ");
        }
    }

}