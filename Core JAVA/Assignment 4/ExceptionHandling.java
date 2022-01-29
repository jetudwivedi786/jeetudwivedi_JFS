
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1

        System.out.print(" first number: ");
        int a = sc.nextInt();
        System.out.print(" second number: ");
        int b = sc.nextInt();
        try {
            int div = (a / b);
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException \n" + e);
        }
        System.out.println("End !!!");
    }
}



// 2

        System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                int result = (a / b);
                System.out.print("The value after divide " + a + "/" + b + " is: " + result);
                if(result == 0) {
                try {
                throw new UnsupportedOperationException();
                } catch (UnsupportedOperationException e) {
                System.out.println("\n ArithmeticException" + e);
                }
                }
                System.out.println("\n Done !!! ");
                }
                }
class UnsupportedOperationException extends Exception{
    @Override
    public String getMessage() {
        return "Unsupported Operation !!";
    }
}




//  3

        System.out.println("Welcome to the saving bank account !!");
                System.out.println("Your current balance is : 20000");
                System.out.print("Enter the withdrawn amount you want to withdraw: ");
                double WD = sc.nextDouble();

                if (WD > 20000) {
                try {
                throw new InsufficientBalanceException();
                } catch (InsufficientBalanceException e) {
                System.out.println("Your account balance is low to perform transaction " + e);
                }
                }
                if (WD < 0) {
        try {
        throw new IllegalBankTransactionException();
        } catch (IllegalBankTransactionException e) {
        System.out.println("You shouldn't enter the negative value " + e);
        }
        }
        System.out.println("Transaction is done !!!");
        }
        }
class InsufficientBalanceException extends Exception{
    @Override
    public String getMessage() {
        return "Insufficient Balance !!!";
    }
}

class IllegalBankTransactionException extends Exception{
    @Override
    public String getMessage() {
        return "Negative Amount !!!";
    }
}
