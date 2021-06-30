package data.algo.chap4;

public class Gstack<E>{
    private int max;
    private int ptr;

    public E[] getStk() {
        return stk;
    }

    public void setStk(E[] stk) {
        this.stk = stk;
    }

    private E [] stk;


//
//    public class EmptyIntStackException extends Exception{
//        public EmptyIntStackException(){}
//    }
//
//    public class OverflowIntStackException extends Exception{
//        public OverflowIntStackException(){}
//    }

    public Gstack(int capacity){
        ptr = 0;
        max = capacity;
        try{
            stk = (E[])new Object [max];
        }catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    //스택에 x를 푸쉬
    public E push(E x) throws Exception {
        if(ptr >= max)
            throw new Exception();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public E pop() throws Exception {
        if(ptr <= 0)
            throw new Exception();
        return stk[--ptr];
    }

    public E peek() throws Exception {
        if(ptr <=0)
            throw new Exception();
        return stk[ptr-1];
    }

    public int indexOf(E x){
        for(int i = ptr-1; i >= 0 ;i--)
            if(stk[i] == x)
                return i;
        return -1;
    }

    public void clear(){
        ptr = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr <=0;
    }

    public boolean isFull(){
        return ptr >= max;
    }

    public void dump(){
        if(ptr<=0)
            System.out.println("스택이 비어있다.");
        else
            for(int i = 0; i> ptr ; i++)
                System.out.println(stk[i] + " ");
        System.out.println();
    }
}
