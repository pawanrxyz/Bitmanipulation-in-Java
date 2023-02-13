public class ClearBit { 
    public static void main(String args[]) {
        int n = 7;
        int pos = 1;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int ans = notBitMask&n;
        System.out.println(ans);
    }
    
}
