import java.util.Scanner;

public class removechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String z = sc.next();
        System.out.println("enter the character to remove");
        char p = sc.next().charAt(0);

        int res =-1 ;

        for(int i=0;i<z.length();i++)
        {
            if(z.charAt(i)==p){
                res = i;
            }
        }
        System.out.println(z.substring(0, res)+z.substring(res+1));
    }
}
