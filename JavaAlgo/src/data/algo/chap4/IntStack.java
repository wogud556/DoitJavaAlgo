package data.algo.chap4;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    public IntStack(int capacity){
        ptr = 0;
        max = capacity;
        try{
            stk = new int[max];
        }catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    //스택에 x를 푸쉬
    public int push(int x) throws OverflowIntStackException{
        if(ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException{
        if(ptr <=0)
            throw new EmptyIntStackException();
        return stk[ptr-1];
    }

    public int indexOf(int x){
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
