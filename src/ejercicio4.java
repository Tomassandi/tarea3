import java.util.Scanner;
public class ejercicio4 {

    public static void main(String[] args)
    {
Scanner s=new Scanner(System.in);
System.out.print("ingrese un numero");
        int n=s.nextInt();

        for(int i=1; i <= 10; i++) {
            System.out.println(n*i);
        }
    }
}
