import java.util.Scanner;
public class UpdateBit { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice ");
        int opera = sc.nextInt();

        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        if(opera == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
    
}
