package data.algo.chap3;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_1 {
    static int seqSearch_useWhile(int[] a, int n, int key){
        int i = 0;

        while(true){
            if(i == n)
                return -1;
            if(a[i]== key)
                return i;
            i++;
        }
    }

    static int seqSearch_useFor(int[] a, int n, int key){
        for(int i = 0; i< n; i++){
            if(a[i] == key)
                return i;
        }
        return -1;
    }

    public static void ex31(){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i<num;i++){
            System.out.println("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearch_useWhile(x, num, ky);
//      int idx = seqSearch_useFor(x, num, ky); // 예제 3-2
        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
            //추가
    }

    static int seqSearchSen(int [] a, int n, int key){
        int i = 0;

        a[n] = key;             // 보초를 추가

        while(true){
            if(a[i] == key)     // 검색 성공!
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void ex33() {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for(int i = 0; i< num; i++){
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }
        System.out.println("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }

    public static int binSearch(int[] a, int n, int key){
        int pl = 9;
        int pr = n - 1;

        do{
            int pc = (pl + pr)/ 2;
            if(a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        }while(pl <= pr);
        return -1;
    }

    public static void ex3_4(){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int [] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.println("x[0] : ");
        x[0] = stdIn.nextInt();

        for(int i = 1; i< num ; i++){
            do{
                System.out.println("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            }while (x[i] < x[i-1]);
        }

        System.out.println("검색할 값:");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");

    }

    public static void ex3_5(){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        
        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : ");
        x[0] = stdIn.nextInt();

        for(int i = 1; i< num; i++){
            do{
                System.out.println("x[" + i + "] :");
                x[i] = stdIn.nextInt();
            } while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x,ky);

        if(idx < 0){
            System.out.println("그 값의 요소가 없습니다.");
            //연습문제 8
            System.out.println("삽입한 포인트의 값은" + ky + " 입니다.");
        }else{
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }

    }

}
