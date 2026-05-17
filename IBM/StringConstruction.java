public class StringConstruction {
    public static void main(String[] args) {
        String msg = "cat";

        char[] opType = {'F', 'B', 'F'};

        char[] opChar = {'A', 'Z', 'X'};

        System.out.println(construct(msg, opType, opChar));
    }

    public static String construct(String msg, char [] opType, char [] opChar){
        StringBuilder result = new StringBuilder(msg);

        for(int i=0;i<opType.length;i++){
            if(opType[i] == 'F'){
                result.insert(0,opChar[i]);
            }
            

            if(opType[i] == 'B'){
                result.append(opChar[i]);
            }
        }

        return result.toString();
    }
}