package data.algo.chap5;

import java.util.Scanner;

public class ex5 {
    static int factorial(int n){
        if(n > 0)
            return n * factorial(n-1);
        else
            return 1;
    }

    public static void ex5_1(String[]args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "이다.");
    }
}
