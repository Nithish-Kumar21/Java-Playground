import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter month : ");
        String month = scan.nextLine();

        System.out.print("Enter date : ");
        int date = scan.nextInt();

        if(month.equals("february") && date == 21){
            System.out.println("Happy Birthday Nithish!!");
        }
        else if(date != 21 || ! month.equals("february")){
            System.out.println("Can't wait for your Birthday!");
        }
        scan.close();
    }
}
