class UserIllegalArgumentException extends RuntimeException {
    public UserIllegalArgumentException(String desc){
        super(desc);
    }
}

class UserArrayList<E>{
    private E [] arr;
    private int index;
    private static final int DEFAULT_CAPACITY = 10;

    public UserArrayList(){
        this(DEFAULT_CAPACITY);
    }

    public UserArrayList(int initialCapacity){
        if(initialCapacity > 0){
            this.arr = (E[])new Object[initialCapacity];
        }
        else if(initialCapacity == 0){
            this.arr = (E[])new Object[0];
        }
        else{
            throw new UserIllegalArgumentException("Illegal Capacity Initialized");
        }

        this.index = 0;
    }




    public int size() {
        return index;
    }

    public String toString(){
        if(size() == 0){
            return "[]";
        }
        return "";
    }
}

public class ArrayListImplementation{
    public static void main(String[] args){
        UserArrayList<Integer> list = new UserArrayList<>();
        System.out.println(list);
    }
}