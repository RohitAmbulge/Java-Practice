class Coach{
    String name;
    String type;
    int capacity;

    Coach(String name, String type,int capacity){
        super();
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public void displayCoach(){
        System.out.println("Name: "+name+" Type: "+type+" capacity: "+capacity);
    }
}

class Train implements Cloneable{
    String name;
    int number;
    String junction;
    int capacity;
    String type;
    Coach [] arr = new Coach[10];

    Train(String name, int number, String junction, String type){
        super();
        this.name= name;
        this.number = number;
        this.junction = junction;
        this.type = type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public void addCoaches(){
        for(int i=1;i<=10;i++){
            Coach obj1 = new Coach(("s"+i),"Sleeper",50);
            arr[i-1]= obj1;
        }
    }

    public void displayTrain(){
        System.out.println("Train Details : ");
        System.out.println("Name : "+name);
        System.out.println("Number : "+number );
        System.out.println("Junction : "+junction);
        System.out.println("capacity : "+capacity);
        System.out.println();
        System.out.println("Coach Details Below");

        for(Coach ele : arr){
            ele.displayCoach();
        }
    }
}
public class CloneMethod{
    public static void main(String[] args) throws CloneNotSupportedException{
        Train oldObj = new Train("Gareeb Rath",12345,"Pune","Passenger");

        oldObj.addCoaches();
        oldObj.displayTrain();

        System.out.println("------------------------");
        Train copy = (Train)oldObj.clone();
        copy.displayTrain();

        System.out.println("-----------------------");
        oldObj.arr[1].name = "undefined";
        oldObj.displayTrain();

        System.out.println();
        copy.displayTrain();
        
    }
}