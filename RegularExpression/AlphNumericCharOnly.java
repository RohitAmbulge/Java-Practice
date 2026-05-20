public class AlphNumericCharOnly {
    public static void main(String[] args) {

        String s = "87sh2iFb3tiuU94u";
        System.out.println(s.matches("^[a-zA-Z0-9]*$"));
    }
}