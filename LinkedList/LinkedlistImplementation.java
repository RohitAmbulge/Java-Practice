import java.util.*;

class UserNoSuchElementException extends RuntimeException{
    UserNoSuchElementException(){
        super();
    }
}

class UserIndexOutOfBoundsException extends RuntimeException{
    UserIndexOutOfBoundsException(String desc){
        super(desc);
    }
}

class UserLinkedList<E>{
    private int index;
    private Node head;
    private Node tail;

    private class Node{
        E ele;
        Node next;
        public Node(E ele){
            this.ele = ele;
        }
    }

    @Override
    public String toString(){
        if(index == 0)return "[]";

        Node currEle = head;
        String resp = "[";
        while(currEle.next != null){
            resp += currEle.ele+", ";
            currEle = currEle.next;
        }
        resp += currEle.ele+"]";
        return resp;
    }

    public boolean add(E ele){
        Node newNode = new Node(ele);
        if(index == 0){
            head = newNode;
            tail = head;
            index++;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            index++;
        }
        return true;
    }

    public void addLast(E ele){
        add(ele);
    }

    public void addFirst(E ele){
        Node newNode = new Node(ele);

        newNode.next = head;
        head = newNode;
        index++;
    }

    public int size(){
        return index;
    }

    public E getFirst(){
        if(size() == 0){
            throw new UserNoSuchElementException();
        }

        return head.ele;
    }

    public E getLast(){
        if(size() == 0){
            throw new UserNoSuchElementException();
        }

        return tail.ele;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public E removeLast(){
        if(size() == 0){
            throw new UserNoSuchElementException();
        }

        E temp = tail.ele;
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        tail = curr;
        index--;
        return temp;
    }

    public E removeFirst(){
        if(size() == 0){
            throw new UserNoSuchElementException();
        }

        Node curr = head;
        head= head.next;
        curr.next = null;
        index--;

        return curr.ele;
    }

    public void add(int idx, E ele){
        if(idx < 0 || idx > size()){
            throw new UserIndexOutOfBoundsException("Index : "+idx+", Size : "+size());
        }

        Node newNode = new Node(ele);
        Node curr = head;

        for(int i=1;i<idx-1;i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        idx++;
    }
}

public class LinkedlistImplementation{
    public static void main(String[] args){
        UserLinkedList<Integer> list = new UserLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.addFirst(1000);
        list.addLast(5000);
        System.out.println(list);

        // System.out.println(list.getFirst());
        // System.out.println(list.removeFirst());
        list.add(3,5);
        System.out.println(list);
    }
}

