public class RearrangeBinaryString {

    public static int secondsToRemoveOccurrences(String s) {
        int zeroCount = 0;
        int time = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '0') {
                zeroCount++;
            } else { // ch == '1'

                if (zeroCount > 0) {

                    // replace Math.max(time + 1, zeroCount)
                    if (time + 1 > zeroCount) {
                        time = time + 1;
                    } else {
                        time = zeroCount;
                    }
                }
            }
        }

        return time;
    }

    public static void main(String[] args) {
        String s = "0110101";
        System.out.println(secondsToRemoveOccurrences(s)); // 4
    }
}