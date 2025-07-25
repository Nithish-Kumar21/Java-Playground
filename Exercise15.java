import java.util.Scanner;
public class Exercise15 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number  : ");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("The given number " + num + " is an even number.");
        }
        else{
            System.out.println("The given number " + num + " is an odd number.");
        }
        scan.close();
    }
}
