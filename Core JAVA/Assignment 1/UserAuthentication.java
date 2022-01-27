import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        String userName="jeetu";
        String userPassword="123";
        Scanner input=new Scanner(System.in);
        for(int i=3;i>=1;i--) {
            System.out.println("Enter username: ");
            String name = input.next();
            System.out.println("Enter password: ");
            String password = input.next();

            if (name.equals(userName) && password.equals(userPassword)) {
                System.out.println("Welcome " + name);
                break;
            } else {
                System.out.println("login failed attempt remaining "+(i-1));
                if(i==1){
                    System.out.println("contact admin");
                }

            }
        }



    }
}
