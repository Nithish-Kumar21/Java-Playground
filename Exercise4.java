import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your marks out of 100 : ");
        double marks = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your Department : ");
        String dept = scan.nextLine();

        double score = marks/10;
        System.out.println("Name : " + name);
        System.out.println("Score : " + score + "/10 " );
        System.out.println("Department : " + dept);




        scan.close();
    }
}
