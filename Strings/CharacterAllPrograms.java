import java.util.Arrays;

public class CharacterAllPrograms{
    public static void main(String[] args){
        String str = "hippopotammus";
        char [] arr = str.toCharArray();

        frequencyOfCharacters(arr, arr.length);
        String res = distinctCharacters(arr,arr.length);
        System.out.println(res);

        String uni = uniqueCharacters(arr,arr.length);
        System.out.println(uni);

        String dup = duplicateCharacters(arr,arr.length);
        System.out.println(dup);

        char ch = highestRepeatingCharacter(arr, arr.length);
        System.out.println(ch);

        char max = leastRepeatingCharacter(arr, arr.length);
        System.out.println(max);

        System.out.println(secLeastRepeatingCharacter(arr, arr.length));
        System.out.println(secMaxRepeatingCharacter(arr, arr.length));
    }

    public static void frequencyOfCharacters(char[] arr , int n){
        boolean [] t = new boolean[n];

        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    t[j] = true;
                }
            }

            System.out.println(arr[i]+" : "+count);
        }
    }

    public static String distinctCharacters(char [] arr, int n){
        String result = "";

        boolean [] t = new boolean[n];

        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    
                    t[j] = true;
                }
            }

            result += arr[i];
        }

        return result;
    }

    public static String uniqueCharacters(char[] arr , int n){
        boolean [] t = new boolean[n];
        String str = "";
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    t[j] = true;
                }
            }

            if(count == 1){
                str += arr[i];
            }

            
        }

        return str;
    }

    public static String duplicateCharacters(char[] arr , int n){
        boolean [] t = new boolean[n];
        String str = "";
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    t[j] = true;
                }
            }

            if(count > 1){
                str += arr[i];
            }

            // System.out.println(arr[i]+" : "+count);
        }

        return str;
    }

     public static char highestRepeatingCharacter(char[] arr , int n){

        char ch = ' ';
        int max = Integer.MIN_VALUE;

        boolean [] t = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    t[j] = true;
                }
            }

            if(count > max){
                max = count;
                ch = arr[i];
            }

            
        }

        return ch;
    }


    public static char leastRepeatingCharacter(char[] arr , int n){

        char ch = ' ';
        int min = Integer.MAX_VALUE;

        boolean [] t = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    t[j] = true;
                }
            }

            if(count < min){
                min = count;
                ch = arr[i];
            }

            
        }

        return ch;
    }


    public static char secLeastRepeatingCharacter(char[] arr , int n){

        char ch = ' ', ch2 = ' ';
        int min1 = Integer.MAX_VALUE , min2 = min1;

        boolean [] t = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    t[j] = true;
                }
            }

            if(count < min1){
                min2 = min1;
                ch2 = ch;
                min1 = count;
                ch = arr[i];
            }
            else if(count < min2 && min1 != min2){
                min2 = count;
                ch2 = arr[i];
            }

            
        }

        return ch2;
    }

    public static char secMaxRepeatingCharacter(char[] arr , int n){

        char ch = ' ', ch2 = ' ';
        int max1 = Integer.MIN_VALUE , max2 = max1;

        boolean [] t = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(t[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    t[j] = true;
                }
            }

            if(count > max1){
                max2 = max1;
                ch2 = ch;
                max1 = count;
                ch = arr[i];
            }
            else if(count > max2 && max1 != max2){
                max2 = count;
                ch2 = arr[i];
            }

            
        }

        return ch2;
    }

    
}