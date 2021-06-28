package threadEx;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class Thread03 {


    public static void main(String[] args){
       Thread thread0 = new Thread(new ThreadWithRunnableMulti());
       thread0.start();

       System.out.println(thread0.getThreadGroup());

       ThreadGroup group = new ThreadGroup("MyThread");
       group.setMaxPriority(7);

       Thread thread1 = new Thread(group, new ThreadWithRunnableMulti());
       thread1.start();
       System.out.println(thread1.getThreadGroup());

       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("전통적인 방식의 일회용 스레드 생성");
           }
       }).start();

       new Thread(() -> {
           System.out.println("람다 표현식을 사용한 일회용 스레드 생성");
       }).start();
    }

    @FunctionalInterface
    interface Calc{
        public int min(int x, int y);
    }

    public class Lambda02{
        public void main(String[] args){
            Calc minNum = (x,y) -> x < y ? x : y; //추상 메소드의 구현
            System.out.println(minNum.min(3,4)); // 함수형 인터페이스의 사용
        }

    }

    int methodRef(){
        DoubleUnaryOperator oper;

        oper = (n) -> Math.abs(n);
        System.out.println(oper.applyAsDouble(-5));

        oper = Math::abs;
        System.out.println(oper.applyAsDouble(-5));

        Function<Integer, double[]>func1 = a-> new double[a];
        Function<Integer, double[]> func2 = double[] :: new;

        return 0;
    }
}
