import java.util.Scanner;
public class Exercise14 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Football?\n(Yes / No) : ");
        boolean football = (scan.nextLine().toLowerCase().equals("yes")) ? true : false;

        System.out.print("Cricket?\n(Yes / No) : ");
        boolean cricket = (scan.nextLine().toLowerCase().equals("yes")) ? true : false;

        if(football || cricket){
            System.out.println("I'm coming to play!!!");
        }else{
            System.out.println("I'm not coming to play.");
        }

        scan.close();
    }
}
