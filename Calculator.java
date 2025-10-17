public class Calculator {

    long x;
    long y;
    char operation;

    public Calculator()
    {
        this.x=2;
        this.y=3;
        this.operation='+';
    }

    public Calculator(long x, long y, char operation)
    {
        this.x=x;
        this.y=y;
        this.operation=operation;
    }

     long Addition ()
    {
        return this.x+this.y;
    }
    long Subtraction()
    {
        return this.x-this.y;
    }
    long Multiplication()
    {
        return this.x*this.y;
    }
    double Division()
    {
        if(this.y==0)
        {
            throw new ArithmeticException("Division by zero is undefined !");
        }
        return (double) this.x/this.y;
    }

}
