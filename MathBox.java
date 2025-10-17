import java.util.Scanner;

public class MathBox {
    public static void main(String[] args) {
        long x, y;
        char z='a';
        Scanner sc = new Scanner(System.in);

        System.out.println("************ MathBox *************");
       do {
            System.out.print("\nEnter a number: ");
            x = sc.nextLong();
            System.out.print("\nEnter another number: ");
            y = sc.nextLong();
            System.out.println("Choose your operation:");
            System.out.println("\tA - Addition");
            System.out.println("\tB - Subtraction");
            System.out.println("\tC - Multiplication");
            System.out.println("\tD - Division");
            System.out.println("\tE - Stop");
            z = sc.next().charAt(0);

            Calculator c = new Calculator(x, y, z);
            try {
                switch (z) {
                    case 'A','a':
                        System.out.println(x + " + " + y + " = " + c.Addition());
                        break;
                    case 'B','b':
                        System.out.println(x + " - " + y + " = " + c.Subtraction());
                        break;
                    case 'C','c':
                        System.out.println(x + " * " + y + " = " + c.Multiplication());
                        break;
                    case 'D','d':
                        System.out.println(x + " / " + y + " = " + c.Division());
                        break;
                    case 'E','e':
                        System.out.println("See you next time !");
                }
            } catch (ArithmeticException a) {
                System.out.println(a.getMessage());
            }
        } while(z!='E' && z!='e');


        sc.close();
    }

    long Addition (long x,long y)
    {
        return x+y;
    }
    long Subtraction(long x,long y)
    {
        return x-y;
    }
    long Multiplication(long x,long y)
    {
        return x*y;
    }
    double Division(long x,long y)
    {
        if(y==0)
        {
            throw new ArithmeticException("Division by zero is undefined !");
        }
        return (double) x/y;
    }
}
