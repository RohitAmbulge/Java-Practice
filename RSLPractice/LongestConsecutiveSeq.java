import java.util.HashSet;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int [] arr = {1,0,1,2}; 

        System.out.println(sequence(arr));
    }

    public static int sequence(int [] arr){
        HashSet<Integer> set = new HashSet<>();

        int longest = 1;

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(int num : set){
           int x = num;

            if(!set.contains(x-1)){
                int count = 1;
                
                while(set.contains(x+1)){
                    count++;
                    x = x+1;
                }

                if(count > longest){
                    longest = count;
                }
            }
        }

        return longest;
    }
}