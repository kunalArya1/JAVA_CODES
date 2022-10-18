package CPT_CLASS;

import java.util.Arrays;
import java.util.Scanner;

public class one {
    public static int searchInsert(int[] nums, int target) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
            }else if(nums[i]<target && nums[i+1]>target){
                index=i;
            }
        }return index;
    }
    //left rotation by k element (tc-O(n))
    public static void rotatebyKleftNEW(int arr[],int k) {
        if (k<=arr.length) {
            k=k%arr.length;
        }
        int temp[]=new int[k];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];       
         }
         for (int i = k; i< arr.length; i++) {
             arr[i-k]=arr[i];
         }
         for (int i = 0; i < temp.length; i++) {
             arr[arr.length-k+i]=temp[i];
         }
         System.out.println(Arrays.toString(arr));
    }

    //Right rotation by k element(tc-O(n))











    //Right rotation by k element(tc-O(n*n))
    public static void rotateRightByK(int arr[],int k) {
        for (int j = 0; j < k; j++) {
            int temp=arr[arr.length-1];
            for (int i = arr.length-2; i <=0; i--) {
                arr[i+1]=arr[i];
                
            }
            arr[0]=temp;
            System.out.println(Arrays.toString(arr));
            
        }        
    }



    //Right rotation by k element(tc-O(n*n))
    public static void rotateLeftByK(int arr[],int k) {
        if (k>=arr.length) {
            k=k%arr.length;
        }
        for (int j = 0; j < k; j++) {
            int temp=arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i-1]=arr[i];
            }
            temp=arr[arr.length-1];
            }
        System.out.println(Arrays.toString(arr));
    }



    //Rotate left Array by 1 element 
    public static void rotateRight1(int arr[]) {
        int temp=arr[arr.length-1];
        for (int i = arr.length-2; i <=0; i--) {
            arr[i+1]=arr[i];
            
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
        
    }

    public static void rotateleft1(int arr[]) {
        int temp=arr[0];
        temp=arr[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        
        System.out.println(Arrays.toString(arr));
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int k=sc.nextInt();
        int k=2;
        int arr[]={1,3,4,5,6};
        // rotateleft1(arr);
        // rotateRight1(arr);
        // rotateLeftByK(arr, k);
        // rotateRightByK(arr, k);
        // rotatebyKleftNEW(arr, k);
       System.out.println(searchInsert(arr, k)); 
        
    }
    
}
