package data.algo.chap2;

import java.util.Scanner;

public class ex2_1 {
    public static void ex2_11(){
        int[] a = new int[5]; //선언과 참조를 동시에

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for(int i = 0; i< a.length; i++){
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }

    //ex2-2 패스
    //ex2-3 패스
    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 0; i< a.length; i++){
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    static void ex2_4(){//배열의 최댔값 구하기.
        Scanner stdInt = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.println("사람 수 : ");
        int num = stdInt.nextInt();

        int[] height = new int[num];

        for(int i = 0; i<num; i++){
            System.out.println("height[" + i + "]:");
            height[i] = stdInt.nextInt();
        }
        System.out.println("최댓값은 " +  maxOf(height) + "입니다.");

    }

    //배열 요소의 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a){
        for(int i = 0; i<a.length; i++){
            swap(a, i, a.length-i-1);
        }
    }

    public static void ex2_6(){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        System.out.println("요소를 역순으로 정렬했습니다.");
        for(int i = 0; i < num; i++){
            System.out.println("x[" + i + "]= " + x[i]);
        }
    }

    static boolean equals(int[] a, int[] b){
        if(a.length != b.length)
            return false;

        for(int i = 0; i< a.length; i++){
            if(a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void ex2_7(){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("베열 a의 요솟 수");

        int na = stdIn.nextInt();

        int [] a = new int[na];

        for(int i = 0; i<na; i++){
            System.out.println("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("베열의 b의 요솟수: ");
        int nb = stdIn.nextInt();

        int[] b = new int[nb];

        for(int i = 0; i<nb; i++){
            System.out.println("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }

        System.out.println("배열 a와 b는 " + (equals(a,b) ? " 같습니다." :"같지 않습니다."));
    }

}
