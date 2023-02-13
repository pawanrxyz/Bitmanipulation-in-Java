public class SetBit { 
    public static void main(String args[]) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int ans = (bitMask |  n);
        System.out.println(ans);
    }
    
}
