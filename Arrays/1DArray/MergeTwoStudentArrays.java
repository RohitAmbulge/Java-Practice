class Student {
    String name;
    int id;
    int age;
    String coll;
    double per;

    Student(String name, int id, int age, String coll, double per) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.coll = coll;
        this.per = per;
    }

    public void displayStudent() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Age : " + age);
        System.out.println("COllege Name : " + coll);
        System.out.println("Percentage : " + per);

    }

    public String toString() {
        return "Name : " + name + " ID : " + id + " Age : " + age + " Col Name : " + coll + " Per : " + per;
    }
}

public class MergeTwoStudentArrays {

    public static void main(String[] args) {

        Student[] db1 = new Student[4];
        Student[] db2 = new Student[3];

        db1[0] = new Student("Rohit", 1, 22, "SGGS Nanded", 90);
        db1[1] = new Student("Rutik", 2, 22, "Gramin Nanded", 93);
        db1[2] = new Student("Rohan", 3, 22, "FC PUNE", 94);
        db1[3] = new Student("Ankit", 4, 22, "SP PUNE", 92);

        db2[0] = new Student("Anvesh", 5, 21, "SGGS Nanded", 90);
        db2[1] = new Student("Vaibhav", 6, 25, "Gramin Nanded", 93);
        db2[2] = new Student("Sagar", 7, 23, "FC PUNE", 94);

        Student[] newDB = merge(db1, db2);
        displayArray(newDB);

    }

    public static Student[] merge(Student[] db1, Student[] db2) {
        Student[] newDB = new Student[db1.length + db2.length];

        int maxLen = db1.length > db2.length ? db1.length : db2.length;
        int ind = 0;

        for (int i = 0; i < maxLen; i++) {
            if (i < db1.length) {
                newDB[ind++] = db1[i];
            }

            if (i < db2.length) {
                newDB[ind++] = db2[i];
            }
        }

        return newDB;

    }

    public static void displayArray(Student[] newDB) {
        for (int i = 0; i < newDB.length; i++) {
            System.out.println(newDB[i]);
        }
    }
}