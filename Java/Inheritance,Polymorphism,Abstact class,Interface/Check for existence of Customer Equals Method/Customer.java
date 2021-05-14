public class Customer {

  private String name;
  private String panno;
  private String emailid;
  private int salary;

  public void setName(String a) {
    name = a;
  }

  public void setPanno(String b) {
    panno = b;
  }

  public void setEmailid(String c) {
    emailid = c;
  }

  public void setSalary(int d) {
    salary = d;
  }

  public String getName() {
    return name;
  }

  public String getPanno() {
    return panno;
  }

  public String getEmailid() {
    return emailid;
  }

  public int getSalary() {
    return salary;
  }

  public Customer() {
    name = "";
    panno = "";
    emailid = "";
    salary = 0;
  }

  public Customer(String a, String b, String c, int d) {
    this.name = a;
    this.panno = b;
    this.emailid = c;
    this.salary = d;
  }

  public boolean equals(Object o) {
    Customer e = (Customer) o;
    if (
      e.name.equals(this.name) &&
      e.panno.equals(this.panno) &&
      e.emailid.equals(this.emailid) &&
      e.salary == this.salary
    ) return true; else return false;
  }
}
