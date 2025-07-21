import java.util.Scanner;

public class Exercise3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value a : ");
        int a = scan.nextInt();

        System.out.print("Enter value b : ");
        int b = scan.nextInt();

        System.out.print("Enter value c : ");
        int c = scan.nextInt();

        int d = a * b * c;
        int e = a + b + c;

        int result = d / e;

        System.out.println(result);
        scan.close();

    }
}
