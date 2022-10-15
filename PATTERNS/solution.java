package PATTERN;

public class solution {
    public static void pattern1(int n) {
        for (var row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    public static void pattern2(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pattern1(7);
        // pattern2(7);
    }
    
}
