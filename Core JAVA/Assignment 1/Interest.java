import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double p,r,t,n,simpleInterest;
        System.out.print("Enter value  p: ");
        p=input.nextInt();
        System.out.print("Enter value  r: ");
        r=input.nextInt();
        System.out.print("Enter value  t: ");
        t=input.nextInt();


        simpleInterest=(p*r*t)/100;
        System.out.println("simple interest: "+simpleInterest);
        System.out.print("Enter number of times interest is compounded: ");
         n = input.nextInt();

        double compoundInterest = p * (Math.pow((1 + r/100), (t * n))) - p;

        //int compoundInterest=p*((1+(r/100))^t-p);
        System.out.println("Compound interest : "+compoundInterest);




    }
}
