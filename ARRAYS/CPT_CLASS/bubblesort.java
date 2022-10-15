package CPT_CLASS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        //first of we select a bubble

        Scanner sc = new Scanner(System.in);
        int arr[]={3,5,6,7,9,1,2,10,12};
        for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length-1-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
    
}
