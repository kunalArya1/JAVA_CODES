package ARRAYS.Questions;

import java.lang.*;
public class binarySearch {
    public static int binarySearch(int arr[],int key) {
        int start=0;
        int end =arr.length-1;
        while (start<=end) {
            int mid =(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if (arr[mid]< key) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,10,90};
        int key=90;
        int index=binarySearch(arr, key);
        if(index==-1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number found at index : "+ index);
        }
    }

}


