import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter 1 to increment and 0 to decrement");
        while(!sc.hasNext("exit")) {
            byte input = sc.nextByte();
            if (input == 1) {
                count = increaseclass.increase(count);
                System.out.println(count);
            } else if(input==0) {
                count = decreaseclass.decrease(count);
                System.out.println(count);
            }
        }
    }
}