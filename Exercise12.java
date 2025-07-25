import java.util.Scanner;

public class Exercise12{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("The given number " + num + " is divisible by both 3 and 5.");
        }else{
            System.out.println("Sorry, The given number " + num + " is not divisible by both 3 and 5.");
        }
        scan.close();

    }
}
