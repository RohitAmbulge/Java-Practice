public class RightAngleTriangle {
    public static void main(String[] args) {
        int num = 4;

        print2(4);
    }

    public static void print(int num){
        StringBuilder temp = new StringBuilder();

        for(int i=0;i<num;i++){
            temp.append("* ");
            System.out.println(temp);
        }

        
    }

    public static void print2(int n){
        int row = 1;
        int count = 0;

        for(int i=1;i<=(n*(n+1)/2);i++){
            System.out.print("* ");
            count++;

            if(row == count){
                System.out.println();
                row++;
                count = 0;
            }
        }
    }
}