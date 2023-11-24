import java.util.*;
public class sumevenfib {
    static int FibEvenSum(int N)	
    {
        if (N <= 0)
            return 0;
        int fib[] = new int[2 * N + 1];
        fib[0] = 0;
        fib[1] = 1;
        int s = 0;
        for (int i = 2; i <= 2 * N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (i % 2 == 0)
                s += fib[i];
        }
        return s;
    }
    public static void main(String[] args)
    {
        int N = 4;
        System.out.println(
            "Even sum of fibonacci series till number " + N
            + " is: " + +FibEvenSum(N));
     }
}
