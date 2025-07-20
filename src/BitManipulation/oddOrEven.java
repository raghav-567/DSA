package BitManipulation ;
public class oddOrEven {
    public static void main(String[] args) {
        int a = 21;
        System.out.println(oddoreven(a));
    }
    public static boolean oddoreven(int a) {
        if ((a & 1) == 0) {
            return true;
        }
        return false;
    }
}