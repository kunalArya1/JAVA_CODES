package ARRAYS.Questions;

public class largestNumber{
    public static int largestNo(int arr[]) {
        int num=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>num) {
                num=arr[i];
            }
        }
        return num;

    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,8,9,10,30,40,70};
        System.out.println("Largest no is : "+largestNo(arr));

    }

}
