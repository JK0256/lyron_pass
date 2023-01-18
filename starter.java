import java.util.*;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "t";
        while(true) {
            System.out.print("Please enter the password: ");
            String attempt = sc.nextLine();
            if (attempt.equals(pass)) {
                System.out.println("login correct");
                break;
            }
            else if(!(attempt.equals(pass))) {
                System.out.print("login incorrect\n");
            }
        }  
    }
}