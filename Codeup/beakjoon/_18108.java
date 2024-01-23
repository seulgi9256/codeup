package beakjoon;

import java.util.Scanner;

public class _18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int result = y-543; // 불교 서기 전 545년
        System.out.println(result);

        sc.close();
    }
}
