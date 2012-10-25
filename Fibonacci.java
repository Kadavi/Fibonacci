public class Fibonacci {

    public static int fib(int num) {
        // Exit at 2 because anything before it equals 1
        if (num < 2)
            return 1;
        else
            return fib(num-1) + fib(num-2); // Avoiding fib(num) because it will infinite loop
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(fib(5)); //8
        
    }
}
