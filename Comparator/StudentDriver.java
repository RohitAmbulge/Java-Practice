class Student{
    String name;
    int age;
    long phone;
    double per;
    String deg;

    public Student(){

    }

    public Student(String name, int age, long phone, double per, String deg){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.per = per;
        this.deg = deg;
    }

    public String toString(){
        return "[name : "+name+" , age : "+age+", phone : "+phone+", per : "+per+", deg : "+deg+"]";
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        
    }
}