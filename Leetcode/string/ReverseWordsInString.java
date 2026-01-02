public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = " a good   example ";
        System.out.println(s.length());
        String str = s.trim();
        System.out.println(str.length());
        System.out.println(str);

        // String [] st =
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(arr[i].length());
        }
    }
}