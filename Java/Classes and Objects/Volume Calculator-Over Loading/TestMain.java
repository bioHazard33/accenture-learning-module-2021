import java.util.Scanner;

class TestMain{
    public static void main(String[] args) {
        System.out.println("Enter the choice:");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("1.Find Volume For Cubiod");

        VolumeCalculator v=new VolumeCalculator();

        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();sc.nextLine();

        if(ch==1){
            int r,h;
            System.out.println("Enter the radius");
            r=sc.nextInt();sc.nextLine();

            System.out.println("Enter the height");
            h=sc.nextInt();sc.nextLine();

            System.out.println("Output");
            System.out.printf("Volume of the Cylinder is %.2f",v.calculateVolume(r,h));
        }
        else if(ch==2){
            int l,b,h;
            System.out.println("Enter the length");
            l=sc.nextInt();sc.nextLine();

            System.out.println("Enter the breadth");
            b=sc.nextInt();sc.nextLine();

            System.out.println("Enter the height");
            h=sc.nextInt();sc.nextLine();

            System.out.println("Output");
            System.out.printf("Volume of the Cuboid is %.2f",v.calculateVolume(l,b,h));
        }
    }
}