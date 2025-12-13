public class Average {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9 };
        int sum = 0;

        for (int ele : arr)
            sum += ele;

        System.out.println(sum / arr.length);
    }
}