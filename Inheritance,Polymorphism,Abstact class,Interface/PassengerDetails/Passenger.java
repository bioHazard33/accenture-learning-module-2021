public class Passenger {

  private int ticketid;
  private String name, gender, address;

  public Passenger(int ticketid, String name, String gender, String address) {
    this.ticketid = ticketid;
    this.name = name;
    this.gender = gender;
    this.address = address;
  }

  public String toString() {
    return (
      "ticketid:" +
      ticketid +
      "," +
      "name:" +
      name +
      ",gender:" +
      gender +
      ",address:" +
      address
    );
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTicketid(int ticketid) {
    this.ticketid = ticketid;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return this.address;
  }

  public String getName() {
    return this.name;
  }

  public int getTicketid() {
    return this.ticketid;
  }

  public String getGender() {
    return this.gender;
  }
}
