class Student{
    String name = "Ramesh";

    @Override
    public void finalize()throws Throwable{
        System.out.println("Garbage collection clean up activity");
        super.finalize();
    }
}


public class FinalizeMethod{
    public static void main(String[] args){
        Student obj = new Student();
        System.out.println(obj.name);
        obj = null;
        System.gc();
    }
}