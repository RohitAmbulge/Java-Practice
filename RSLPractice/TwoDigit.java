public class TwoDigit {
    public static void main(String[] args) {
        

        for(int tens = 1;tens<=5;tens++){
            for(int ones = 0;ones<=4;ones++){
                if(tens > ones){
                    System.out.println(""+tens+ones);
                }
                
            }
        }
    }
}