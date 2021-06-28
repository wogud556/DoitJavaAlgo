package threadEx;

public class ThreadWithRunnableMulti implements Runnable{
    @Override
    public void run() {
      try{
        Thread.sleep(10);
      }catch(InterruptedException e){
          e.printStackTrace();
      }
    }
}
