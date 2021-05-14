public class Doctor extends Person {

  String specializationType;

  String displayDetails() {
    return this.name + " is a " + this.specializationType;
  }
}
