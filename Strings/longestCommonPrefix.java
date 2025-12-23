import java.util.Arrays;

public class longestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = { "dog", "racecar", "car" };

        // System.out.println(longestCommon(strs));
        longestCommon2(strs);

    }

    public static String longestCommon(String[] strs) {
        int min = Integer.MAX_VALUE;

        String temp = "";
        String res = "";

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
                temp = strs[i];
            }
        }

        // System.out.println(temp);
        for (int j = 0; j < temp.length(); j++) {

            char ch = temp.charAt(j);

            for (String ele : strs) {
                if (ch != ele.charAt(j)) {
                    return res;
                }
                res += ch;
            }

        }
        // return temp;

        return res;
    }

    public static void longestCommon2(String[] strs) {
        StringBuilder str = new StringBuilder();
        Arrays.toString(strs);

        System.out.println(Arrays.toString(strs));
    }
}