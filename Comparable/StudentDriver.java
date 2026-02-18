import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
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


    public int compareTo(Student ref){
        return (this.per > ref.per)?-1:(this.per < ref.per)?1:0;
        return this.name.compareTo(ref.name);
    }

}

public class StudentDriver{
    public static void main(String[] args){

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Vaibhav", 22,7058114426l, 80, "Bcom"));
       list.add( new Student("Rohan", 25,7057114426l, 45, "B.tech"));
        list.add(new Student("Abhay", 23,7058214426l, 69, "Bsc"));
        list.add(new Student("Rutik", 24,7058164426l, 67, "Bca"));
       list.add( new Student("Babar", 21,7058114486l, 53, "Ba"));

    //    for(Student s : list){
    //      System.out.println(s);
    //    }
        
        Collections.sort(list);
        // System.out.println(list);

        for(Student st : list){
            System.out.println(st);
        }

    }

}