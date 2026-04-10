public class Numbers {
    public static void main(String[] args) {
        for(int i=100;i<=500;i++){
            if(i%5==0 && i%11==0){
                System.out.println("Cool dude");
            }
            else if(i%5 == 0){
                System.out.println("Cool");
            }
            else if(i % 11 == 0){
                System.out.println("dude");
            }
            
        }
    }
}