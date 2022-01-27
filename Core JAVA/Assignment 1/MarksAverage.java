import java.lang.*;
import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int A1,A2,A3,B1,B2,B3,C1,C2,C3;

        System.out.println("For First Student ");
        System.out.println("Enter marks of Subject A: ");
         A1=input.nextInt();

        System.out.println("Enter marks of Subject B: ");
         B1=input.nextInt();
        System.out.println("Enter marks of Subject C: ");
         C1=input.nextInt();

        if(A1<=100&&B1<=100&&C1<=100) {
            int Student1Total = (A1 + B1 + C1);
            int Student1Average = (A1 + B1 + C1) / 3;


            System.out.println("Total marks of Student1: " + (Student1Total));
            System.out.println("Average of Student1: " + (Student1Average));

        System.out.println("For Second Student ");
        System.out.println("Enter marks of Subject A: ");
          A2=input.nextInt();
        System.out.println("Enter marks of Subject B: ");
         B2=input.nextInt();
        System.out.println("Enter marks of Subject C: ");
         C2=input.nextInt();
        int Student2Total=(A2+B2+C2);
        int Student2Average=(A2+B2+C2)/3;
        System.out.println("Total marks of Student2: "+(Student2Total));
        System.out.println("Average of Student2: "+(Student2Average));



        System.out.println("For Third Student ");
        System.out.println("Enter marks of Subject A: ");
         A3=input.nextInt();
        System.out.println("Enter marks of Subject B: ");
         B3=input.nextInt();
        System.out.println("Enter marks of Subject C: ");
         C3=input.nextInt();
        int Student3Total=(A3+B3+C3);
        int Student3Average=(A3+B3+C3)/3;
        System.out.println("Total marks of Student3: "+(Student3Total));
        System.out.println("Average of Student3: "+(Student3Average));

        System.out.println("Total sum of Subject A: " + (A1+A2+A3));
        System.out.println("Total Average of Subject A: " + (A1+A2+A3)/3);
        System.out.println("Total sum of Subject B: " + (B1+B2+B3));
        System.out.println("Total Average of Subject B: " + (B1+B2+B3)/3);
        System.out.println("Total sum of Subject C: " + (C1+C2+C3));
        System.out.println("Total Average of Subject C: " + (C1+C2+C3)/3);




    }
}}
