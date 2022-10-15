import java.util.Scanner;

public class linears {
    public static int linearSearch(int arr[],int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={7,8,9,3,4,6,10};
        System.out.println("Enter Number that you want to search : ");
        int key=sc.nextInt();
        int index = linearSearch(arr, key);
        //complexity of the linear search = O(n);
        if(index==-1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number found at index : "+index);
        }

        
    }
    
}
