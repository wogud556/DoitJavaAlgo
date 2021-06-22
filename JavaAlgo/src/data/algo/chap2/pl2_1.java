package data.algo.chap2;

public class pl2_1 {
    static void reverse(){ //Q1

        int[] a = new int[] {5,10,73,2,-5,42};
        System.out.println(a.length);
        for(int i = 0; i<a.length/2; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
            System.out.println("a[" + i + "]과(와) a[" + (a.length- i - 1) + "]를 교환합니다.");
            int t = a[i]; a[i] = a[a.length-i-1]; a[a.length-i-1] = t;
        }
        for(int j = 0; j<a.length; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println("");

        System.out.println("역순 정렬을 마쳤습니다.");
    }

    static int sumOf(int[] a){
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }


    public static void main(String args[]){
        reverse();
    }
}
