import java.util.Scanner;
public class Exercise10 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter mark out of 100 : ");
        int mark = scan.nextInt();

        if(mark > 34){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        scan.close(); 
    }
}
