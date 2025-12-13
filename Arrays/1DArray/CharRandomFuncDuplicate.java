import java.util.Arrays;

public class CharRandomFuncDuplicate {

    public static void main(String[] args) {
        char[] arr = new char[26];

        System.out.println(Arrays.toString(arr));

        for (int i = 1, cnt = 0;; i++) {
            char ch = (char) (Math.random() * 100);
            if (ch >= 65 && ch <= 90) {
                if (!(checkCharacter(arr, ch))) {
                    arr[cnt++] = ch;
                }
            }

            if (cnt == 26)
                break;
        }

        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static boolean checkCharacter(char[] arr, char ch) {
        for (char ele : arr) {
            if (ele == ch)
                return true;
        }
        return false;
    }
}