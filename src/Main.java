public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 54;
        int c = 11;
        int d = 44;

        int sum1 = a + b;
        int sum2 = c + d;

        boolean isFirstSumGreater = sum1 > sum2;
        System.out.println("First sum greater - " + isFirstSumGreater);

        sum1 += 1;
        sum2 -= 2;

        boolean isUpdatedFirstSumGreater = sum1 > sum2;
        System.out.println("Updated first sum greater - " + isUpdatedFirstSumGreater);

        boolean isAnySumEven = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Sum1 or sum2 even - " + isAnySumEven);
    }
}
