public class Ex2{

    void getSqRoot_throw(double num){
        if(num < 0)
            throw new ArithmeticException("\n Square Root can't be calculated for Negative Number");
        else
            System.out.println(Math.sqrt(num));
    }

    double div_throws(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String args[]){
        Ex2 obj1 = new Ex2();
        obj1.getSqRoot_throw(-2);

        System.out.println();

        Ex2 obj = new Ex2();
        try{
            System.out.println(obj.div_throws(4,0));
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }
    }
}