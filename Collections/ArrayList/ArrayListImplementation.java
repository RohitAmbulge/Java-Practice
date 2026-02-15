import java.util.Collection; 

class UserIllegalArgumentException extends RuntimeException {
    public UserIllegalArgumentException(String desc){
        super(desc);
    }
}

class UserNullPointerException extends RuntimeException{
    public UserNullPointerException(String desc){
        super(desc);
    }
}

class UserNoSuchElementException extends RuntimeException{
    public UserNoSuchElementException(){
        super();
    }
}

class UserArrayIndexOutOfBoundsException extends RuntimeException{
    public UserArrayIndexOutOfBoundsException(String desc){
        super(desc);
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

    public void ensureCapacity(int minCapacity){
        if(minCapacity > arr.length){
            int newCapacity = (int)(arr.length * 1.5);

            if(newCapacity < minCapacity){
                newCapacity = minCapacity;
            }

            E[] newArr = (E[])new Object[newCapacity];

            System.arraycopy(arr, 0, newArr, 0, size());

            arr = newArr;
        }
    }

      private void checkIndex(int index){
        if(index < 0 || index >= size()){
            throw new UserArrayIndexOutOfBoundsException("Index "+index+" out of bounds for size "+size());
        }
      } 
    

    private int newCapacity(int oldCap){
        return (int)(oldCap * 1.5);
    }

    //Collection Interface Methods

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

    public boolean add(E ele){
        if(index == arr.length){
            int newCap = newCapacity(arr.length);
            E[] newArr = (E[])new Object[newCap];
            int i = 0;
            for(E e : arr){
                newArr[i++] =e;
            }
            arr = newArr;
        }

        arr[index++] = ele;
        return true;
    }

    public boolean addAll(Collection<E> c){
        if(c == null || c.isEmpty()){
            return false;
        }

        ensureCapacity(this.size()+c.size());

        if(c instanceof UserArrayList){
            UserArrayList<E> otherList = (UserArrayList<E>)c;
            for(int i =0 ;i<otherList.size();i++){
                this.add(otherList.get(i));
            }
        }

        return true;
    }

    public void add(int pos, E ele){
        if(pos < 0 || pos > index){
            throw new UserArrayIndexOutOfBoundsException("Index "+pos+" out of bounds for size "+index);
        } 

        ensureCapacity(index+1);

        for(int i=index-1;i>=pos;i--){
            arr[i+1] = arr[i];
        }

        // E [] newArr = (E[])new Object[index+1];
        // for(int i = index-1;i>= 0;i--){
        //     if(i>= pos){
        //         newArr[i+1] = arr[i];
        //     }
        //     else{
        //         newArr[i] = arr[i];
        //     }

        //     if(i == pos){
        //         newArr[i] = ele;
        //     }
            
        // }

        arr[pos] = ele;
        index++;
        // arr = newArr;
    }

    public boolean addAll(int pos , Collection<E> c){

        if(c == null || c.isEmpty()){
            throw new UserNullPointerException("Collection cannot be null");
        }
        if(pos < 0 || pos > index){
           return false;
        }

        ensureCapacity(index+c.size());
       
        for(int i= index-1;i>=pos;i--){
            arr[i+1] = arr[i];
        } 

        int i =pos;
        for(E ele : c){
            arr[i++] =ele;
        }

        index += c.size();

        return true;

    }

    public E remove(int pos){
         if(pos < 0 || pos >= index){
            throw new UserArrayIndexOutOfBoundsException("Index "+pos+" out of bounds for size "+index);
        } 
        E ele = arr[pos];
       

        for(int i = pos;i<index-1;i++){
            arr[i] = arr[i+1];
        }

        arr[index-1] = null;
        index--;
        return ele;
    }
    
    public boolean remove(E ele){
        int ind = indexOf(ele);

        if(ind == -1){
            return false;
        }
        remove(ind);

        return true;
    }

    public int indexOf(E ele){
        for(int i = 0;i<index;i++){
            if(arr[i] == ele){
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(E ele){
        for(int i = index-1;i>=0;i--){
            if(arr[i] == ele){
                return i;
            }
        }

        return -1;
    }

    public boolean contains(E ele){
        for(int i=0;i<index;i++){
            if(arr[i] == ele){
                return true;
            }
        }

        return false;
    }

    public E get(int pos){
        return arr[pos];
    }

    public E getFirst(){
        if(size() == 0){
            throw new UserNoSuchElementException();
        }

        return arr[0];
    }

    public E getLast(){
        if(size() == 0){
            throw new UserNoSuchElementException();
        }

        return arr[index-1];
    }

    public E set(int index, E ele){
        E oldEle = arr[index];
        arr[index] = ele;

        return oldEle;
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
        list.add(10);
        list.add(20);
        list.add(30);
        // list.add(2,50);
        System.out.println(list);
        System.out.println(list.indexOf(20));;
        // remove()
        // System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(20)));
        // System.out.println(list.getIndex());
        System.out.println(list);
    }
}