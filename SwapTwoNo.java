public class SwapTwoNo {
    public static void main(String args[]) {
        int a = 5;
        int b = 4;
        a = a^b;
        b = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}