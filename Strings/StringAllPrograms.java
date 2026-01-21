import java.util.*;

public class StringAllPrograms{
    public static void main(String[] args){
        String str = "java is easy java is a programming language it is platform independent language";

        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        // frequencyOfWords(arr, arr.length);

        String[] res = distinctWords(arr,arr.length);
        System.out.println(Arrays.toString(res));

        String[] uni = uniqueWords(arr,arr.length);
        System.out.println(Arrays.toString(uni));

        String[] dup = duplicateWords(arr,arr.length);
        System.out.println(Arrays.toString(dup));

        String ch = highestRepeatingWord(arr, arr.length);
        System.out.println(ch);

        String max = leastRepeatingWord(arr, arr.length);
        System.out.println(max);

        System.out.println(secLeastRepeatingWord(arr, arr.length));
        System.out.println(secMaxRepeatingWord(arr, arr.length));
    }

    public static void frequencyOfWords(String[] arr , int n){
        boolean [] t = new boolean[n];

        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    t[j] = true;
                }
            }

            System.out.println(arr[i]+" : "+count);
        }
    }

    public static String[] distinctWords(String [] arr, int n){
        ArrayList<String> list = new ArrayList<>();

        boolean [] t = new boolean[n];

        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    
                    t[j] = true;
                }
            }

            list.add(arr[i]);
        }

        String[] str = new String[list.size()];
        int index = 0;
        for(String ele : list){
            str[index++] = ele;
        }

        return str;
    }

    public static String[] uniqueWords(String[] arr , int n){
         ArrayList<String> list = new ArrayList<>();
        boolean [] t = new boolean[n];
        // String str = "";
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    t[j] = true;
                }
            }

            if(count==1){
                list.add(arr[i]);
            }

            
        }

         String[] str = new String[list.size()];
        int index = 0;
        for(String ele : list){
            str[index++] = ele;
        }

        return str;
    }

    public static String[] duplicateWords(String[] arr , int n){
         ArrayList<String> list = new ArrayList<>();
        boolean [] t = new boolean[n];
        // String str = "";
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    t[j] = true;
                }
            }

            if(count > 1){
                list.add(arr[i]);
            }

            // System.out.println(arr[i]+" : "+count);
        }

         String[] str = new String[list.size()];
        int index = 0;
        for(String ele : list){
            str[index++] = ele;
        }

        return str;
    }

     public static String highestRepeatingWord(String [] arr , int n){

       String str = "";
        int max = Integer.MIN_VALUE;

        boolean [] t = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    t[j] = true;
                }
            }

            if(count > max){
                max = count;
                str = arr[i];
            }

            
        }

        return str;
    }


    public static String leastRepeatingWord(String[] arr , int n){

        String str = "";
        int min = Integer.MAX_VALUE;

        boolean [] t = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    t[j] = true;
                }
            }

            if(count < min){
                min = count;
                str = arr[i];
            }

            
        }

        return str;
    }


    public static String secLeastRepeatingWord(String[] arr , int n){

         String str = "", str2 = "";
        int min1 = Integer.MAX_VALUE , min2 = min1;

        boolean [] t = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    t[j] = true;
                }
            }

            if(count < min1){
                min2 = min1;
                str2 = str;
                min1 = count;
                str = arr[i];
            }
            else if(count < min2 && min1 != min2){
                min2 = count;
                str2 = arr[i];
            }

            
        }

        return str2;
    }

    public static String secMaxRepeatingWord(String[] arr , int n){

        String str = "", str2 = "";
        int max1 = Integer.MIN_VALUE , max2 = max1;

        boolean [] t = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    t[j] = true;
                }
            }

            if(count > max1){
                max2 = max1;
                str2 = str;
                max1 = count;
                str = arr[i];
            }
            else if(count > max2 && max1 != max2){
                max2 = count;
                str2 = arr[i];
            }

            
        }

        return str2;
    }

}