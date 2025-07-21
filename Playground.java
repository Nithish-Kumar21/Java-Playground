import java.util.Scanner;
public class Playground{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = scan.nextInt();

        System.out.print("Enter number 2 : ");
        int num2 = scan.nextInt();
        
        if(num1 != num2){
            String result = (num1 > num2) ? (num1 + " is greater than " + num2 ) : (num2 + " is greater than " + num1);
            System.out.println(result);
        }
        else{
            System.out.println(num1 + " is equal to " + num2);
        }

        scan.close();
        

        
    }
}