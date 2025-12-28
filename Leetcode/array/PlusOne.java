import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        String str = "";
        int size = digits.length; // 3

        System.out.println(size);
        for (int digit : digits) {

            str += digit;
        }

        double num = Double.parseDouble(str);
        num += 1;
        System.out.println(num);

        if (str.length() != (num + "").length() - 2) {
            // System.out.println(num);
            size += 1;
        }

        System.out.println(size);

        int[] res = new int[size];

        System.out.println(Arrays.toString(res));

        int ind = size - 1;
        while (ind >= 0) {
            res[ind] = (int) (num % 10);
            System.out.println(ind + ":" + res[ind]);
            num /= 10;
            ind--;
        }

        System.out.println(Arrays.toString(res));
    }
}