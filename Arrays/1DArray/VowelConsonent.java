import java.util.Arrays;

public class VowelConsonent {

    public static void main(String[] args) {
        char[] arr = new char[20];

        int count = 0;
        int ind = 0;
        int vowel = 0;
        int cons = 0;

        for (int i = 0;; i++) {
            char c = (char) (Math.random() * 100);

            if (c >= 65 && c <= 90) {
                count++;
                arr[ind++] = c;

                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowel++;
                } else {
                    cons++;
                }
            }

            if (count == 20)
                break;
        }

        System.out.println(Arrays.toString(arr));

        char[] vArray = new char[vowel];
        char[] cArray = new char[cons];

        int vind = 0;
        int cind = 0;
        for (char c : arr) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vArray[vind++] = c;
            } else {
                cArray[cind++] = c;
            }
        }

        System.out.println(Arrays.toString(vArray));
        System.out.println(Arrays.toString(cArray));
    }
}