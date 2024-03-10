package iraj;

public class Practice_Ch7 {
    static void mul(int m) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d * %d = %d\n", m, i, m * i);
        }
    }

    static void star(int n){
        for (int i=1; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum(int n){
        if (n==1){
            return 1;
        }
        else {
            return  n + sum(n - 1);
        }
    }

    static void pattern(int n){
        for (int i=0; i<=n; i++){
            for (int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fibonacci(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    static float avg(float ...numbers){
        float average = 0;
        float sum = 0;
        for (float element: numbers){
            sum += element;
        }
        average = sum/numbers.length;
        return average;
    }


    public static void main(String[] args) {
//        mul(5);
//        star(5);
//        System.out.println(sum(3));
//        pattern(3);
//        System.out.println(fibonacci(8));
//        System.out.println(avg(2, 2, 6, 10));
    }
}
