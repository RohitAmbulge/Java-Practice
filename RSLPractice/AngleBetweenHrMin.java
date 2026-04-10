public class AngleBetweenHrMin{
    public static void main(String[] args){
        int hr = 3;
        int min = 30;

        System.out.println(angle(hr,min));
    }

    public static double angle(int hr, int min){
        if(hr == 12){
            hr = 0;
        }

        if(min == 60){
            min = 0;
            hr++;
        }

        double hrAngle = (hr *30)+(min * 0.5);
        double minAngle = min * 6;

        double angle = Math.abs(hrAngle-minAngle);
        return Math.min(angle,360-angle);
    }
}