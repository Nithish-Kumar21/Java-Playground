import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();

        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your City : ");
        String city = scan.nextLine();

        System.out.println("\nName : " + name );
        System.out.println("Age : " + age + " years Old");
        System.out.println("City : " + city );

        scan.close();
    }
}

