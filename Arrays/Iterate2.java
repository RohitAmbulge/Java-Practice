public class Iterate2 {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 9 };

        System.out.println(arr.length);
        // length = 5;

        int len = 0;

        for (int ele : arr)
            len++;

        System.out.println("Length : " + len);
    }
}