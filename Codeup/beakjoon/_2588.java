package beakjoon;

import java.util.Scanner;

public class _2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        int B1 = (B%100)%10;
        int B10 = (B%100)/10;
        int B100 = B/100;

        System.out.println(A*B1);
        System.out.println(A*B10);
        System.out.println(A*B100);
        System.out.println(A*B);
        
        sc.close();
    }
}
