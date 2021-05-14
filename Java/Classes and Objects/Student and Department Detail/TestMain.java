import java.util.*;
public class TestMain {
public static Department d1;
public static Student s1;
public static Student createStudent(){
    Scanner sc = new Scanner(System.in);
    s1 = new Student();
    d1 = new Department();
    System.out.println("Enter the Department id:");
    int did = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the  Department name:");
    String dname=sc.nextLine();
    System.out.println("Enter the Student id:");
    int sid = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the Student name:");
    String sname=sc.nextLine();
    d1.setDid(did);
    d1.setDname(dname);
    s1.setSid(sid);
    s1.setSname(sname);
    s1.setDepartment(d1);
    return s1;
}
public static void main(String args[]){
    s1=TestMain.createStudent();
    System.out.println("Department id:"+d1.getDid());
    System.out.println("Department name:"+d1.getDname());
    System.out.println("Student id:"+s1.getSid());
    System.out.println("Student name:"+s1.getSname());
}
}