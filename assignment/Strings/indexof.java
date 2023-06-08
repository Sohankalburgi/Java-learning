import java.util.Scanner;

public class indexof {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String p = sc.next();
        System.out.println("enter the character");
        char z = sc.next().charAt(0);
        System.out.println("the index :"+ p.indexOf(z));

    }
}
