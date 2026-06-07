import java.util.Arrays;

public class ArraysConcept {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // simple iteration
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //enhanced for loop
        System.out.println();
        for (int item : arr1) {
            System.out.print(item + " ");
        }
        System.out.println();
        //using inbuilt method
        System.out.println(Arrays.toString(arr));

        //2d array, 2 rows 3 columns
        int[][] matrix = new int[2][3];
        matrix[0][0] = 10;
        matrix[0][1] = 11;
        matrix[0][2] = 12;
        matrix[1][0] = 13;
        matrix[1][1] = 14;
        matrix[1][2] = 15;
        for (int i = 0; i < matrix.length; i++) { //rows
            for (int j = 0; j < matrix[i].length; j++) { //columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
