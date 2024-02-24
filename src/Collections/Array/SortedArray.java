package Collections.Array;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
//        int[] arr = getIntegers(5);
//        System.out.println(Arrays.toString(arr));
//        sortIntegers(arr);
//        System.out.println(Arrays.toString(arr))
    int[] arr = {5, 4, 3, 2, 1};
    printArray(arr);
    }

    public static int[] getIntegers(int len){
        int [] array = new int[len];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< (len ) ;i++){
            System.out.println("Enter no.");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] sortArray){
        for (int i = 0; i<  sortArray.length ; i++){
            System.out.println ("Element "+i+" contents "+sortArray[i]);
        }
    }
    public static int[] sortIntegers(int[] sortArray){

        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < (sortArray.length - 1) ; i++){
                if(sortArray[i] < sortArray[i+1]){
                    int temp = sortArray[i];
                    sortArray[i] = sortArray[i+1];
                    sortArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortArray;
    }
}
