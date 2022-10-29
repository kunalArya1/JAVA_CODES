package ARRAYS.Questions;

public class smallestNumber{
    public static int smallestNo(int arr[]) {
        int sum=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<sum) {
                sum=arr[i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,8,9,10,30,40,70};
        System.out.println("Smallest  no is : "+smallestNo(arr));

    }

}

