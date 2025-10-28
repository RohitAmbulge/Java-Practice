class MyString {
    String str;

    public MyString(String str) {
        this.str = str;
    }

    public String displayMyString() {
        return str;
    }

    public MyString concat(int data) {
        str = str + data;
        return this;
    }

    public MyString concat(double data) {
        str = str + data;
        return this;
    }

    public MyString concat(boolean data) {
        str = str + data;
        return this;
    }
}

public class MyStringDriver {

    public static void main(String[] args) {
        MyString obj = new MyString("Hello");
        System.out.println(obj.displayMyString());

        obj = obj.concat(123);
        System.out.println(obj.displayMyString());

        obj = obj.concat(589.56);
        System.out.println(obj.displayMyString());

        obj = obj.concat(false);
        System.out.println(obj.displayMyString());
    }
}