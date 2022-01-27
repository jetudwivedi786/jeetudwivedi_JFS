import java.util.Scanner;

public class MarksSubject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value for subject 1: ");
        int n=input.nextInt();
        System.out.println("Enter the value for subject 2: ");
        int p=input.nextInt();
        System.out.println("Enter the value for subject 3: ");
        int m=input.nextInt();
        if (n<100&&p<100&&m<100) {

            if (n > 60 && p > 60 && m > 60) {
                System.out.println("Passed");

            }
            else if((n>60&&p>60)||(p>60&&m>60)||(m>60&&n>60)){
                System.out.println("Promoted");

            }
            else if((n>60||p>60||m>60)||(n<60&&p<60&&m<60)){
                System.out.println("Fail");

            }
            else{
                System.out.println("enter again");
            }


        }
        else {
            System.out.println("Enter a valid no");
        }


    }
}
