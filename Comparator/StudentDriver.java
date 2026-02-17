import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

class PercetComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return (int)(s1.per - s2.per); 
    } 
}

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("Rahul", 20, 9876543210L, 85.5, "BSc");
        Student s2 = new Student("Amit", 21, 9123456780L, 68.2, "BCom");
        Student s3 = new Student("Sneha", 22, 9988776655L, 91.0, "BCA");
        Student s4 = new Student("Priya", 19, 9090909090L, 48.7, "BA");
        Student s5 = new Student("Karan", 23, 9345678123L, 73.4, "BTech");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //Using Anonymous Inner Class
        // Collections.sort(list, new Comparator<Student>(){
        //     public int compare(Student s1 , Student s2){
        //         // return (int)(s1.age - s2.age);
        //         return Double.compare(s1.age, s2.age);
        //     }
        // });

        //!Using Separate Comparator class
        // Collections.sort(list, new PercetComparator());


        //Using Lambda -> name
        // Collections.sort(list, (a, b)-> a.name.compareTo(b.name));

        Collections.sort(list, (a,b)->a.age-b.age); 
        for(Student s : list){
            System.out.println(s);
        }
    }
}