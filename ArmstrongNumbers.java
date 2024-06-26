public class ArmstrongNumbers{
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp != 0) {
            last = temp % 10;
            sum = (int) (sum + Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }
}