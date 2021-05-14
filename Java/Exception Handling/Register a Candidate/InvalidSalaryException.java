public class InvalidSalaryException extends Exception {

  public InvalidSalaryException(String s) {
    super(s);
    System.out.println(s);
  }
}
