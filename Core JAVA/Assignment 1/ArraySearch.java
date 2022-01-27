import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args){
        int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

        Scanner input=new Scanner(System.in);
        System.out.print("Enter value to search in array: ");
        int n=input.nextInt();
        int flag=0;
        int i=0;

        for( i=0;i<arr.length;i++) {
            if (n == arr[i]) {
                System.out.println(arr[i]+" number exist at position "+i);
                flag=1;
                break;

            }



            }
        if(flag==0){
            System.out.println("number not exist in Array");


        }




    }
}
