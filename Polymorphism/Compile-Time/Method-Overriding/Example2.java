class Father {
    public void marriage() {
        System.out.println("Susheela");
    }
}

class Son extends Father {
    String response;

    Son(String response) {
        this.response = response;
    }

    @Override
    public void marriage() {
        if (response.equals("HA")) {
            System.out.println("Sheela");
        } else {
            super.marriage();
        }
    }
}

public class Example2 {

    public static void main(String[] args) {
        Father obj = new Son("Na");
        obj.marriage();
    }
}