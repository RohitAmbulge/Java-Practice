class UserDoublyLL<E>{
    private int index;
    private Node head;
    private Node tail;

    class Node{
        E data;
        Node prev;
        Node next;

        public Node(E data){
            this.data = data;
        }
    }

    public boolean add(E data){
        Node temp = new Node(data);

        if(head == null){
            
            head = temp;
            tail = temp;
           
           
        }
        else{
            
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
           
            
        }
         index++;
 
        return true;
        
    }

    public E remove(){
        E temp = tail.data;

        tail = tail.prev;
        tail.next = null;

        return temp;
    }

    public E removeFirst(){
        // E temp = null;
        if(head == null)return null;

        if(head.next == null){
            E temp =head.data;
            head = null;
            return temp;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;

        return temp.data;

    }



    public String toString(){
        if(head == null)return "[]";

        String str = "[";
        Node temp = head;

        while(temp.next != null){
            str+= temp.data +", ";
            temp = temp.next;
        }

        str+=temp.data+"]";

        return str;
    }

}



public class DoublyLLImplementation {
    public static void main(String[] args) {
        UserDoublyLL<Integer> t = new UserDoublyLL<>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(50);


        t.removeFirst();
     

        System.out.println(t);
    }
}