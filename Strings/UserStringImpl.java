class UserStringIndexOutOfBoundsException extends RuntimeException{
    public UserStringIndexOutOfBoundsException(String desc){
        super(desc);
    }
}

class UserString{
    private char [] arr;
    

    UserString(){
        arr = new char[0];
        
    }

    UserString(String str){
        arr = new char[str.length()];

        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
            
        }
    }

    UserString(StringBuffer sb){
        this(sb.toString());
    }

    UserString(StringBuilder sb){
        this(sb.toString());
    }

    public UserString(char[] arr){
        this.arr = new char[arr.length];

        for(int i=0;i<arr.length;i++){
            this.arr[i] = arr[i];
        }
    }

    public UserString(char[]arr, int offset, int count){
         if (offset < 0 || count < 0 || offset+ count > arr.length) {
            throw new UserStringIndexOutOfBoundsException(
                "Invalid range: offset=" + offset +
                ", count=" + count +
                ", length=" + arr.length
            );
        }

        this.arr = new char[count];
        int j = 0;
        for(int i=offset;i<offset+count;i++){
            this.arr[j++] = arr[i];
        }
    }



    //MEthods

    public int length(){
        return arr.length;
    }

    @Override
    public String toString(){
        String str = "";
        for(char el : this.arr){
            str += el;
        }

        return str;
    }

    public boolean isEmpty(){
        return arr.length==0;
    } 

    public char charAt(int index){
        if(index < 0 || index >= arr.length){
            throw new UserStringIndexOutOfBoundsException("Index "+index+" out of bounds for length "+arr.length);
        } 

        return arr[index];
    }

    public int codePointAt(int index){
        return arr[index];
    }

    public int codePointBefore(int index){
        return arr[index-1];
    }

    public UserString toUpperCase(){
        char[] newArr = new char[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 97 &&  arr[i]<=122 ){
                newArr[i] = (char)(arr[i]-32);
            }
            else{
                newArr[i] = arr[i];
            }
        }

        return new UserString(newArr);
    }

    public UserString toLowerCase(){
        char [] newArr = new char[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 65 && arr[i] <=90){
                newArr[i] = (char)(arr[i]+32);
            }
            else{
                newArr[i] = arr[i];
            }
        }

        return new UserString(newArr);
    }

    public int indexOf(int ascii){
        return indexOf(ascii, 0);
    }


    public int indexOf(int ascii, int start){
        for(int i=start;i<arr.length;i++){
            if(arr[i] == (char)ascii)return i;
        }

        return -1;
    }

    public int lastIndexOf(int ascii, int start){
        for(int i=start;i>=0;i--){
            if(arr[i] == (char)(ascii)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int ascii){
        return lastIndexOf(ascii, arr.length-1);
    } 

    public UserString concat(UserString str){
        char[] newArr = new char[arr.length+str.length()];
        int index = 0;

        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }

        for(int i=0;i<str.length();i++){
            newArr[i+arr.length] = str.charAt(i);
        }

        return new UserString(newArr);
    }

    public boolean startsWith(UserString prefix, int start){
        if(prefix.length() > arr.length || start > arr.length){
            return false;
        }

        for(int i=0;i<prefix.length();i++){
            if(arr[i+start] != prefix.charAt(i)){
                return false;
           }
        }

        return true;
    }

    public boolean startsWith(UserString prefix){
        return startsWith(prefix, 0);
    }

    public boolean contains(UserString str){
        for(int i=0;i<arr.length;i++){
            if(startsWith(str, i)){
                return true;
            }
        }


        return false;
    }


}

public class UserStringImpl {
    public static void main(String[] args) {
        // char [] c = {'a','b','c','d','e','f'};
        UserString s1 = new UserString("RoAhit");
        UserString s2 = new UserString("Ahi");
        // System.out.println(s1.codePointAt(2));
        // System.out.println(s1.concat(s2));
        System.out.println(s1.startsWith(s2, 2));
    }
}