package data.algo.chap1;

import java.util.Scanner;

public class ex1_2 {
    public static void ex1_4(){
        Scanner stdIn = new Scanner(System.in);
        ///실습 1-4
        System.out.println("1부터 n 까지 합을 구한다.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("1부터" +  n + "까지 합은" + sum +"이다.");
    }

    public static void ex1_5(){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n 까지 합을 구한다.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;

        for(int i = 1; i<= n ; i++) {
            sum += i;
        }
        System.out.println("1부터" +  n + "까지 합은" + sum +"이다.");

    }

    public static void ex1_6(){
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구한다.");

        do{
            System.out.println("n의 값 : ");
            n = stdIn.nextInt();
        }while(n <= 0);

        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum +=i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }

    public static void ex1c_2(){
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("2자리 정수를 입력하세요");

        do{
            System.out.println("n의 값 : ");
            n = stdIn.nextInt();
        }while(n < 10 || n > 99);

        System.out.println("변수 no의 값은");
    }

    public static void ex1_7(){
        System.out.println("----- 곱셈표 -----");

        for(int i =0; i<= 9; i++){
            for(int j = 1; j<= 9; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.println();

        }
    }

    public static void main(String args[]){
        ex1_7();
    }
}
