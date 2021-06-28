### Ref www.tcpschool.com
## 스레드의 개념
---
### 프로세스란?
- 프로세스란 단순히 실행중인 프로그램이라고 할 수 있다.
- 사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행중인 것을 말함
- 이러한 프로세스는 프로그램에 사용되는 데이터와 메모리 등의 자원 그리고 스레드로 구성된다.


### 스레드란?
- 스레드란 프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다.
- 모든 프로세스에는 한 개 이상의 스레드가 존재하며 작업을 수행한다.
- 또한 두개 이상의 스레드를 가지는 프로세스를 멀티 스레드 프로세스라고 한다.

### 스레드의 생성과 실행
- 자바에서 스레드를 생성하는 방법에는 다음과 같이 두가지 방법이 존재한다.
  1. Runnable인터페이스를 구현하는 방법
  2. Thread 클래스를 상속받는 방법

- 두 방법 모두 스레드를 통해 작업하고 싶은 내용을 run()메소드에 작성하면 된다

- 다음 예제는 위의 두가지 방법을 이용하여 스레드를 생성하고 실행하는 예제
```
class ThreadWithClass extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println(getName());
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printstackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnlable{
    public void run(){
        for(int i = 0; i<5; i++>){
            System.out.println(Thread.currentTHread().getName());
            try{
                Thread.sleep();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
```
- Thread 클래스를 상속받으면 다른 클래스를 상속받을 수 없으므로, 일반적인 Runnable 인터페이스를 구현하는 방법으로 스레드를 생성한다.
- Runnable 인터페이스는 몸체가 없는 메소드인 run() 메소드 단 하나만을 가지는 간단한 인터페이스이다.
---
## 스레드의 우선순위

- 자바에서 각 스레드는 우선순위에 관한 자시만의 필드를 가지고 있다.
- 이러한 우선순위에 따라 특정 스레다기 더 많은 시간 동안 작업을 할 수 있도록 설정할 수 있다.

|필드|설명|
|---|------|
|static int MAX_PRIORITY| 스레드가 가질 수 있는 최대 우선순위를 명시
|static int MIN_PRIORITY| 스레드가 가질 수 있는 최소 우선순위를 명시|
|static int NORM_PRIORITY| 스레드가 생성될 때 까지는 기본 우선순위를 명시|
- getPriority()와 setPriority() 메소드를 통해 스레드의 우선순위를 반환하거나 변경할 수 있다.
- 스레드의 우선순위가 가질 수 있는 범위는 1부터 10까지이며, 숫자가 높을수록 우선순위 또한 높아진다.
- 하지만 스레드의 우선순위는 비례적인 절댓값이 아닌 어디까지나 상대적인 값일 뿐이다.
- 우선순위가 10인 스레드가 우선순위가 1인 스레드보다 10배 더 빨리 수행되는 것이 아니다.
- 단지 우선순위가 10인 스레드는 우선순위가 1인 스레드보다 좀 더 많이 실행 큐에 포함되어, 좀 더 많은 작업 시간을 할당받을 뿐
- 그리고 스레드의 우선순위는 해당 스레드의 생성한 스레드의 우선순위를 상속받게 된다.
```
//ThreadWithRunnable.java
public class ThreadWithRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

//Thread02.java
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

```
