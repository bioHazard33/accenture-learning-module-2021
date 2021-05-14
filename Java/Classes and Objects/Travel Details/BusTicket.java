public class BusTicket {

  private int ticketNo;
  private float ticketPrice;
  private float totalAmount;
  private Person person;

  public void setTicketNo(int ticketNo) {
    this.ticketNo = ticketNo;
  }

  public void setTicketPrice(float ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public void setTotalAmount(float totalAmount) {
    this.totalAmount = totalAmount;
  }

  public int getTicketNo() {
    return ticketNo;
  }

  public float getTicketPrice() {
    return ticketPrice;
  }

  public float getTotalAmount() {
    return totalAmount;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Person getPerson() {
    return person;
  }

  public void calculateTotal() {
    if (this.person.getAge() < 16) {
      totalAmount = (float) (ticketPrice - ticketPrice * 0.5);
      setTotalAmount(totalAmount);
    } else if (this.person.getAge() >= 60) {
      totalAmount = (float) (ticketPrice - ticketPrice * 0.25);
      setTotalAmount(totalAmount);
    } else if (
      (this.person.getGender() == 'F') || (this.person.getGender() == 'f')
    ) {
      totalAmount = (float) (ticketPrice - ticketPrice * 0.1);
      setTotalAmount(totalAmount);
    } else {
      setTotalAmount(ticketPrice);
    }
  }
}
