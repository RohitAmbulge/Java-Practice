class UserIllegalArgumentException extends RuntimeException {
    public UserIllegalArgumentException(String desc){
        super(desc);
    }
}

class UserNullPointerException extends RuntimmeException{
    public UserNullPointerException(String desc){
        super(desc);
    }
}

class UserNoSuchElementException extends RuntimeException{
    public UserNoSuchElementException(){
        super();
    }
}

class UserArrayList<E>{
    private E [] arr;
    private int index;
    private static final int DEFAULT_CAPACITY = 10;

    public UserArrayList(){
        arr= (E[]) new Object[DEFAULT_CAPACITY];
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

    // public userArrayList(Collection<? extends E> c){
    //     if(c == null){
    //         throw new UserNullPointerException("Input Collection cannot be null");
    //     }

    //     if(c instanceOf UserArrayList){
    //         UserArrayList<? extends E> otherList = (UserArrayList<? extends E>)c;
    //         this.index = otherList.size();
    //     }
    // }


    public boolean add(E ele){
        if(index == arr.length){
            int newCap = newCapacity(arr.length);
            E[] newArr = (E[])new Object[newCap];
            int i = 0;
            for(E ele : arr){
                newArr[i++] ele;
            }
            err = newArr;
        }

        arr[index++] = ele;
        retrun true;
    }

    private int newCapacity(int oldCap){
        return (int)(oldCap * 1.5);
    }

    public int size() {
        return index;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void clear(){
        for(int i=0;i<index;i++){
            arr[i] = null;
        }
        index = 0;
    }

    public E getFirst(){
        if(size() == 0){
            throw new UserNoSuchElementException();
        }

        return arr[0];
    }

    publix E getLast(){
        if(size() == 0){
            throw new UserNoSuchElementException();
        }

        return arr[index-1];
    }

    @Override
    public String toString(){
        if(size() == 0){
            return "[]";
        }
        
        String op = "[";
        for(int i=0;i<index-1;i++){
            op += arr[i]+", ";
        }
        op += arr[index-1]+"]";

        return op;
    }
}

public class ArrayListImplementation{
    public static void main(String[] args){
        UserArrayList<Integer> list = new UserArrayList<>();
        System.out.println(list);
    }
}