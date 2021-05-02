import java.util.Scanner;

public class Main {

  public static Candidate getCandidateDetails() throws InvalidSalaryException {
    Scanner sc = new Scanner(System.in);
    Candidate c = new Candidate();
    System.out.println("Enter the candidate Details");
    System.out.println("Name");
    c.setName(sc.nextLine());
    System.out.println("Gender");
    c.setGender(sc.nextLine());
    System.out.println("Expected Salary");
    c.setExpectedSalary(sc.nextInt());
    if (c.getExpectedSalary() < 10000) {
      throw new InvalidSalaryException(
        "Registration Failed. Salary cannot be less than 10000"
      );
    }
    return c;
  }

  public static void main(String[] args) {
    try {
      getCandidateDetails();
    } catch (InvalidSalaryException e) {}
  }
}