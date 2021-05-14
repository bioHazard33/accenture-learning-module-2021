import java.util.Scanner;

public class Calculator {

public static Calculate performAddition() {
Calculate add = (int a, int b) -> {
return (a + b);
};
return add;
}

public static Calculate performSubtraction() {
Calculate sub = (int a, int b) -> {
return (a - b);
};
return sub;
}

public static Calculate performProduct() {
Calculate pro = (int a, int b) -> {
return (a * b);
};
return pro;
}

public static Calculate performDivision() {
Calculate div = (int a, int b) -> {
return a / b;
};
return div;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
Calculate cal = performAddition();
System.out.println("The sum is " + cal.performCalculation(a, b));
cal = performSubtraction();
System.out.println("The difference is " + cal.performCalculation(a, b));
System.out.println(
"The product is " + performProduct().performCalculation(a, b)
);
System.out.println(
"The division value is " + performDivision().performCalculation(a, b)
);
}
}
