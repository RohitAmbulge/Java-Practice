public class Leap {
    public static void main(String[] args) {
        int num = 1900;

        // if(num % 100 == 0){
        //     if(num % 400 == 0){
        //         System.out.println("Leap year");
        //     }
        //     else{
        //         System.out.println("Not a leap year");
        //     }
        // }
        // else if(num % 4 == 0){
        //     System.out.println("Leap year");
        // }
        // else{
        //     System.out.println("Not a leap year");
        // }

        // if((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)){
        //     System.out.println("Leap Year");
        // }
        // else{
        //     System.out.println("Not a leap year");
        // }

        if((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}