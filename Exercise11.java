import java.util.Scanner;

public class Exercise11 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your income : ");
        int income = scan.nextInt();

        if(income > 6999){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("Scholarship is not available");
        }
    }
    
}
