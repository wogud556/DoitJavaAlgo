package data.algo.chap4;

import java.util.Scanner;

public class ex4_1 {

    public static void ex4_2(){
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true){
            System.out.println("현재 데이터 수: " + s.size() + "/"
                                               + s.capacity());
            System.out.println("(1)푸시 (2)팝 (3)피크 " + "(4)덤프 (0)종료 : ");
            int menu = stdIn.nextInt();
            if(menu == 0) break;

            int x;
            switch(menu){
                case 1:
                    System.out.println("데이터 : ");
                    x = stdIn.nextInt();
                    try{
                        s.push(x);
                    }catch(IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                break;

                case 2:
                    try{
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있다.");
                    }
                break;

                case 3:
                    try{
                        x = s.peek();
                        System.out.println("스택이 비어 있다.");
                    } catch(IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있다.");
                    }
                break;

                case 4:
                    s.dump();
                    break;
            }
        }
    }
}

