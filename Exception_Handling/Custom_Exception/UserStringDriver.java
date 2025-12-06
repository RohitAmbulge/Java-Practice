class UserNullPointerException extends RuntimeException {
    UserNullPointerException(String msg) {
        super(msg);
    }
}

class UserStringIndexOutOfBoundsException extends RuntimeException {
    UserStringIndexOutOfBoundsException(String msg) {
        super(msg);
    }
}

class UserString {
    char[] arr;

    UserString(String str) {
        arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
    }

    @Override
    public String toString() {
        return new String(arr);
    }

    public char userCharAt(int index) {
        if (arr == null) {
            throw new UserNullPointerException("ref is null");
        }

        if (index < 0 || index >= arr.length) {
            throw new UserStringIndexOutOfBoundsException(
                    " Index " + index + " out of bounds for length " + arr.length);
        }

        return arr[index];
    }

}

public class UserStringDriver {

    public static void main(String[] args) {
        String obj = new String("Hi");
        UserString str = new UserString(obj);
        System.out.println(str);
        System.out.println(str.userCharAt(1));

        // str = null;
        if (str == null) {
            throw new UserNullPointerException("ref is null");
        }

        System.out.println(str.userCharAt(0));
    }
}