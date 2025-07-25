import java.util.Scanner;
public class Exercise13 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Am I Hungry?\n(Yes / No) : ");
        boolean hungry = (scan.nextLine().toLowerCase().equals("yes")) ? true : false;

        System.out.print("Is there any Ice cream?\n(Yes / No) : ");
        boolean icecream = (scan.nextLine().toLowerCase().equals("yes")) ? true : false;

        if(hungry && icecream){
            System.out.println("I will eat.");
        }else{
            System.out.println("I will not eat.");
        }




        scan.close();
    }
}
