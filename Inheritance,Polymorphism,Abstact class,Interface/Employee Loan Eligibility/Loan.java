public class Loan { //Implement the below method

  public double calculateLoanAmount(Employee employeeObj) {
    if (employeeObj instanceof PermanentEmployee) return (
      0.15 * employeeObj.getSalary()
    ); else return 0.10 * employeeObj.getSalary();
  }
}
