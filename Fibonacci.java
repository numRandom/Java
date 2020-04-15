package sin_04_14;

public class Fibonacci {
    // 输入一个 n 输出斐波那契数列的第 n 项
    public static void main(String[] args) {
        int n = Fibonacci1(0);
        System.out.println(n);
    }

    // 循环
    public static int Fibonacci1(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    // 递归
    public static int Fibonacci2(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = Fibonacci2(n - 1) + Fibonacci2(n - 2);
        }
        return arr[n];
    }

    // 累加求和 —— 其实和第一种是一个思路
    public static int Fibonacci3(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int pre = 1;
        int last = 0;
        int res = 0;
        for(int i = 2; i <= n; i++){
            res = pre + last;
            pre = res;
            last = pre;
        }
        return res;
    }

    static int[] fib = new int[40];

    public static void getArr(int[] fib){
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < fib.length; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }

    public static int Fibonacci4(int n){
        return fib[n];
    }

    public static int Fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
