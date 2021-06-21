package java.algo.chap1;

import java.util.Scanner;

public class pl1_2 {
    static int max4(int a, int b, int c, int d){ //Q1
        int max = 0;
        if(a >= max){
            max = a;
        }
        if(b >= max){
            max = b;
        }
        if(c >= max){
            max = c;
        }
        if(d>=max){
            max = d;
        }

        return max;
    }

    static int min3(int a, int b, int c){ //Q2
        int min = 0;
        if(a <= min){
            min = a;
        }
        if(b <= min){
            min = b;
        }
        if(c <= min){
            min = c;
        }
        return min;
    }

    static int min4(int a, int b, int c, int d){ //Q2
        int min = 0;
        if(a <= min){
            min = a;
        }
        if(b <= min){
            min = b;
        }
        if(c <= min){
            min = c;
        }
        if(d <= min){
            min = d;
        }
        return min;
    }

    static int pl1_7(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    static int pl1_8(int n){
        int sum = 0;
        sum = (1 + n) * n/2;
        return sum;
    }

    static int pl1_9(int a, int b){
        int start = 0;
        int end = 0;
        int sum = 0;
        if(a<b){
            start = a;
            end = b;
        }else{
            start = b;
            end = a;
        }

        for(int i = start; i<=end; i++){
            sum += i;
        }

        return sum;
    }

    static int pl1_10(){
        Scanner std = new Scanner(System.in);
        int a = 0, b = 0;


        while(true){
            System.out.println("a의 값 : ");
            a = std.nextInt();
            System.out.println("b의 값 : ");
            b = std.nextInt();
            if(a >= b){
                System.out.println("a보다 큰값을 입력하세요");
            }else{
                System.out.println("b-a의 값은 " + (b-a) + "입니다.");
            }

        }
    }

    static int pl1_11(){
        Scanner std = new Scanner(System.in);
        Integer a = 0;


        while(true){
            System.out.println("a의 값 : ");
            a = std.nextInt();

            if(a <= 0){
                System.out.println("a보다 큰값을 입력하세요");
            }else{
                System.out.println("그 수는 " + a.toString().length() + "자리 입니다.");
            }

        }
    }

    public static void main(String args[]){
    }
}
