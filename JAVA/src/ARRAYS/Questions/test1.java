package ARRAYS.Questions;
import java.util.Scanner;

public class test1 {
    public static void TwoDarray() {
        int arr[][]=new int[3][4];

    }
    public static void secondGreatest(int arr[]) {
        int gre=0;
        int sgre=0;
        if(arr[0]>arr[1]){
            arr[0]=gre;
            arr[1]=sgre;
        }else{
            arr[1]=gre;
            arr[0]=sgre;
        }
        for (int i = 0; i < arr.length; i++) {
            if(gre>arr[i]){
                sgre=gre;
                gre=arr[i];
            }
        }
        System.out.println(gre +"and "+ sgre);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] ={1,2,3,4,5,6,10,11};
        secondGreatest(arr);

    }

}

