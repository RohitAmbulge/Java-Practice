import java.util.LinkedList;
import java.util.Arrays;

class HashTable<V>{
    int listCount;
    int countOfElements;

    int initialCap;
    double loadFactor;

    LinkedList [] ht;

    public HashTable(){
        initialCap = 16;
        loadFactor = 0.75;
        ht = new LinkedList[initialCap];
    }

    public HashTable(int initialCapacity){
        initialCap = initialCapacity;
        loadFactor = 0.75;
        ht = new LinkedList[initialCap];
    }

    public HashTable(int initialCapacity, double loadFactor){
        initialCap = initialCapacity;
        loadFactor =loadFactor;
        ht = new LinkedList[initialCap];
    }

    private int hashFunction(V val){
        return val == null ? 0 : val.hashCode()%initialCap;
    }

    public boolean add(V val){
        int index = hashFunction(val);

        if(ht[index] == null){
            ht[index]= new LinkedList<V>();
            ht[index].add(val);

            listCount++;
            countOfElements++;

            return true;
        }
        else if(ht[index].contains(val)){
            return false;
        }
        else{
            ht[index].add(val);
            countOfElements++;
            return true;
        }
    }

    public boolean remove(V val){
        int index = hashFunction(val);

        if(ht[index] == null){
            return false;
        }
        else{
            if(ht[index].remove(val)){
                countOfElements--;
                return true;
            }
            return false;
        }
    }

    public String toString(){
        return Arrays.toString(ht);
    }


}

public class HashTableImpl {
    public static void main(String[] args) {
        HashTable<Integer> h = new HashTable<>();

        h.add(10);
        h.add(20);
        h.add(30);

        System.out.println(h);
    }
}