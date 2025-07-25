import java.util.Scanner;

public class Exercise9 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Is Meghana Alive or Dead? \n1. Alive\n2. Dead\nChoose an Answer : ");
        String meghana = scan.nextLine().toLowerCase();

        if(meghana.equals("dead")){
            System.out.println("Surya meets Ramya!");
        }
        else if (meghana.equals("alive")){
            System.out.println("Surya Weds Meghana!");
        }

        scan.close();


    }
}
