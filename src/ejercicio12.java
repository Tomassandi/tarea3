public class ejercicio12 {

    public static void main(String[] args) {

        int n = 10, t1 = 0, t2 = 1;
System.out.println("Fibonacci sequence");
        for (int i = 1; i <= n; ++i) {

            int sum = t1 + t2;
            System.out.print(t1+" ");
            t1 = t2;
            t2 = sum;

        }
    }
}
