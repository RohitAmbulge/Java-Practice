import java.util.*;

class UserEmptyStackExeption extends RuntimeException{
    UserEmptyStackExeption(){
        super();
    }
}

class UserStack<E>{
    private int index;
    private E[] arr;
    final private int INITIAL_CAPACITY = 10;

    public UserStack(){
        arr = (E[])new Object[INITIAL_CAPACITY];
    }

    public String toString(){
        if(index == 0)return "[]";
        String op = "[";
        for(int i=0;i<index-1;i++){
            op+=arr[i]+", ";
        }

        return op+=arr[index-1]+"]";
    }

    public E push(E ele){
        if(index == arr.length){
            E[] newArr = (E[])new Object[arr.length*2];
            for(int i=0;i<arr.length;i++){
                newArr[i] = this.arr[i];
            }

            this.arr = newArr;
        }
        arr[index++]= ele;
        return ele;

    }

    public int capacity(){
        return this.arr.length;
    }

    public E peek(){
        if(index == 0){
            throw new UserEmptyStackExeption();
        }

        return arr[index-1];
    }

    public E pop(){
        if(index == 0){
            throw new UserEmptyStackExeption();
        }

        E temp = arr[index-1];
        arr[index-1] = null;
        index--;
        return temp;
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public int search(Object obj){
        E search = (E)obj;
        int offset = 1;

        for(int i= index-1;i>=0;i--){
            if(arr[i] == search){
                return offset;
            }
            offset++;
        }

        return -1;
    }
}

public class StackImplementation{
    public static void main(String[] args){
        UserStack<Integer> stack = new UserStack<>();
        System.out.println(stack);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
        System.out.println(stack.search(20));


        // ;
    }
}