import java.util.*;

public class TestMain {

  public static void main(String[] args) {
    BusTicket b = getTicketDetails();
    System.out.print("\nTicket no:" + b.getTicketNo());
    System.out.print("\nPassenger Name:" + b.getPerson().getName());
    System.out.print("\nPrice of a ticket:" + b.getTicketPrice());
    b.calculateTotal();
    System.out.print("\nTotal Amount:" + b.getTotalAmount());
  }

  public static BusTicket getTicketDetails() {
    Scanner sc = new Scanner(System.in);
    BusTicket b = new BusTicket();
    Person person = new Person();
    b.setPerson(person);
    System.out.println("Enter the passenger name:");
    b.getPerson().setName(sc.nextLine());
    System.out.println("Enter the gender(M or F / m or f):");
    b.getPerson().setGender(sc.next().charAt(0));
    System.out.println("Enter the age:");
    b.getPerson().setAge(sc.nextInt());
    System.out.println("Enter the ticket no:");
    b.setTicketNo(sc.nextInt());
    System.out.println("Enter the ticket price:");
    b.setTicketPrice(sc.nextFloat());
    sc.close();
    return b;
  }
}
