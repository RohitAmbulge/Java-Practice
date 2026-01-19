import java.util.*;

public class AlreadyOverrided{
    public static void main(String[] args){
        String str = new String("Rohit");
        System.out.println(str.toString());

        StringBuffer s = new StringBuffer("StringBuffer ");
        System.out.println(s.toString());

        List<Integer> list = Arrays.asList(123,3,4,5);
        System.out.println(list.toString());

        Double d = new Double(1.3);
        System.out.println(d);
    }
}