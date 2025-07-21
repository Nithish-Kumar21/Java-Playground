import java.util.Scanner;

public class Playground1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = scan.nextLine();

        System.out.println(" Index" + " - " + "Character" + " - " + " Position");
        for(int i =0; i < str.length(); i++){
            char c = str.charAt(i);
            System.out.println(str.indexOf(c) + " - " + c + " - " + ((str.indexOf(c)) + 1));
        }

        scan.close();

    }
    
}
