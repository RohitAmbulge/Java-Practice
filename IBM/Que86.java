import java.util.ArrayList;

class Student{
    public String name ;
    public int enRoll;
    public static int count = 1;
    
    Student(String name){
        this.name = name;
        this.enRoll = count++;
    }

    public String toString(){
        return enRoll+" : "+name;
    }
}

public class Que86{
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        int n = 3;

        for(int i=0;i<n;i++){
            String name = new java.util.Scanner(System.in).next();
            list.add(new Student(name));
        }

        for(Student s : list){
            System.out.println(s);
        }
    }
}