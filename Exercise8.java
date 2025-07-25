import java.util.Scanner;

public class Exercise8 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("RCB (win or loose) : ");
        String RCB = scan.nextLine().toLowerCase();

        if(RCB.equals("win")){
            System.out.println("Ee Sala Cup Namdhey");
        }
        else if(RCB.equals("loose")){
            System.out.println("Cup Illa");
        }
        scan.close();

    }
}
