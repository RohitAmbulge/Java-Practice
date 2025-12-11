public class SumOfElements {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 7, 9 };

        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        System.out.println(sum);
    }
}