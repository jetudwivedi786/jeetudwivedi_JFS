
import java.util.Scanner;
public class ArmStrongWithLimit {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a no. to find it is ArmStrongNumber or not:- ");
        int n=input.nextInt();
        //int n=153;
        if(n>99&&n<1000) {
            int t1 = n;
            int len = 0;
            while (t1 != 0) {
                len = len + 1;
                t1 = t1 / 10;

            }
            int t2 = n;
            int remainder;

            int arm = 0;

            while (t2 != 0) {
                int multiply = 1;

                remainder = t2 % 10;
                for (int i = 1; i <= len; i++) {
                    multiply = multiply * remainder;

                }
                arm = arm + multiply;
                t2 = t2 / 10;
            }
            if (arm == n) {
                System.out.print(n + " is ArmStrong");
            } else {
                System.out.print(n + " is not a ArmStrong Number");
            }
        }
        else{
            System.out.printf("Number you have entered is not between 99 and 1000");
        }


    }
}

