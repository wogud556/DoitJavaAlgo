package threadEx;

public class Thread02 {
    public static void main(String[] args){
        Thread thread = new Thread(new ThreadWithRunnable());
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread2.setPriority(10);

        thread.start();
        thread2.start();

        System.out.println(thread.getPriority());
        System.out.println(thread2.getPriority());
    }
}
