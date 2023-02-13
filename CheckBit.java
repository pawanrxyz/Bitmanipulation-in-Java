public class CheckBit {
    public static void main(String args[]) {
        int n = 4;
        int pos = 1;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero ");
        } else {
            System.out.println("Bit was one ");
        }

    }
}
