import java.util.Scanner;

public class Exercise6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Is it raining?(Yes/No) : ");
        String str = scan.nextLine().toLowerCase();


        if(str.equals("yes")){
            System.out.println("Take an Umbrella and take care, ...");
        }else if(str.equals("no")){
            System.out.println("Enjoy the sunlight ...");
        }


        scan.close();
    }
    
}
