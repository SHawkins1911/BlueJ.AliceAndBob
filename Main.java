/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = in.nextLine();
        if(name.toLowerCase().equals("alice") || name.toLowerCase().equals("bob")){
        System.out.println("Hello");
        
        };
         
    }
}
