package iraj;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class    Practice_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Practice 01
        //Create an array of 5 floats and calculate their sum.
//        float [] num = new float[5];
//        float sum = 0;
//        System.out.println("Enter 5 numbers:");
//        //Taking input from user in array.
//        for (int i=0; i<5; i++){
//            num[i] = sc.nextFloat();
//            sum += num[i];
//        }
//        System.out.println("Sum = " + sum);

        //Practice 2
        //WAP to find out whether a given integer is present in an array or not.
//        int [] num = new int[5];
//        System.out.println("Enter 5 numbers:");
//        //Taking input from user in array.
//        for (int i=0; i<5; i++){
//            num[i] = sc.nextInt();
//        }
//        System.out.println("Enter a number to check the number in array.");
//        int given = sc.nextInt();
//        boolean check = false;
//        for(int j=0; j<num.length; j++){
//            if (given == num[j]){
//                check = true;
//                break;
//            }
//        }
//        if (check){
//            System.out.println("Yes, it is in array.");
//        }
//        else{
//            System.out.println("No, it is not in the array.");
//        }

//        //Problem 3
//        int [] num = new int[5];
//        int sum = 0;
//        System.out.println("Enter marks of physics:");
//        //Taking input from user in array.
//        for (int i=0; i<5; i++){
//            num[i] = sc.nextInt();
//        }
//        for (int element: num){
//            sum += element;
//        }
//        System.out.println("Average marks = " + sum/num.length);

        //Problem 4
        //Create a java program to add two matrices of size 2*3
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

        // Practice Problem 5
//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//
//        for(int element: arr){
//            System.out.print(element + " ");
//        }
//
//        // Practice Problem 6
//        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
//        int max = Integer.MIN_VALUE;
//        for(int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is: "+ max);
//
//        // Practice Problem 6
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        */
//        // Practice Problem 7
//        boolean isSorted = true;
//        int [] arr = {1, 12, 3, 4, 5, 34, 67};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The Array is sorted");
//        }
//        else{
//            System.out.println("The Array is not sorted");
//        }


    }
}
