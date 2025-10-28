class Ticket {
    String name;
    String gender;
    String adhaar;
    String contact;

    Ticket(String name) {
        this(name, "Rather not to say", "NA");
    }

    Ticket(String name, String gender) {
        this(name, gender, "NA", "NA");
    }

    Ticket(String name, String gender, String adhaar) {
        this(name, gender, adhaar, "NA");
    }

    Ticket(String name, String gender, String adhaar, String contact) {
        this.name = name;
        this.gender = gender;
        this.adhaar = adhaar;
        this.contact = contact;
    }

    public void displayTicket() {
        System.out.println("Ticket Details : ");
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Adhaar : " + adhaar);
        System.out.println("Contact : " + contact);
        System.out.println();
    }

}

public class TicketDriver {

    public static void main(String[] args) {
        Ticket t1 = new Ticket("Rohit");
        t1.displayTicket();

        Ticket t2 = new Ticket("Ankit", "Male");
        t2.displayTicket();

        Ticket t3 = new Ticket("Gagan", "Male", "1234_5678_9456");
        t3.displayTicket();

        Ticket t4 = new Ticket("mahi", "Femal", "3456_7890_1234", "9876543210");
        t4.displayTicket();

    }
}