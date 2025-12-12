public class SumEvenOdd {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
        int evenSum = 0;
        int oddSum = 0;

        for (int ele : arr) {
            if (ele % 2 == 0)
                evenSum += ele;
            else
                oddSum += ele;
        }

        System.out.println("even sum : " + evenSum);
        System.out.println("Odd Sum : " + oddSum);
    }
}