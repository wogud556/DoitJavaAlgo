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

    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }else{
            return gcd(y, x%y);
        }
    }

    public static void ex5_2(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.println("정수를 입력하세요"); int x = stdIn.nextInt();
        System.out.println("정수를 입력하세요"); int y = stdIn.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");

    }
}
