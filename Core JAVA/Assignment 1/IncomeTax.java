import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        int salary=input.nextInt();
        int tax;

        if(salary>0&&salary<180000){
            tax=salary;
            System.out.println("Tax is nill the original salary will be : "+tax);

        }
        else if(salary>181001&&salary<300000){
            tax=(salary/100)*10;


            System.out.println("after 10% of Tax: "+tax);

        }
        else if(salary>300001&&salary<500000){
            tax=(salary/100)*20;


            System.out.println("after 20% of Tax: "+tax);

        }
        else if(salary>500001&&salary<1000000){
            tax=(salary/100)*30;


            System.out.println("after 30% of Tax: "+tax);

        }

    }
}
