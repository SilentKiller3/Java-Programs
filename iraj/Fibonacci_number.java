package iraj;

public class Fibonacci_number {
    static int fibonacci(int n){
        if (n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int n=6;
        for(int i=0; i<=n; i++){
            System.out.println(fibonacci(i));
        }
    }
}
