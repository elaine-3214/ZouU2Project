import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //welcome
        System.out.println("Welcome!");
        //coordinates
        System.out.print("Enter your first coordinate: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter your second coordinate: ");
        String coord2 = scan.nextLine();
        //x and y values
        int x1;
        int x2;
        int y1;
        int y2;


        //coordinate 1
        String newCoord1 = coord1.substring(1,coord1.length()-1);
        int comma1 = newCoord1.indexOf(", ");

        String tempx1 = (newCoord1.substring(0,comma1));
        String tempy1 = (newCoord1.substring(comma1+2));
        x1 = Integer.parseInt(tempx1);
        y1 = Integer.parseInt(tempy1);


        //coordinate 2
        String newCoord2 = coord2.substring(1,coord2.length()-1);
        int comma2 = newCoord2.indexOf(", ");

        String tempx2 = (newCoord2.substring(0,comma2));
        String tempy2 = (newCoord2.substring(comma2+2));
        x2 = Integer.parseInt(tempx2);
        y2 = Integer.parseInt(tempy2);

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);

        //object
        LinearEquation temp = new LinearEquation(x1, y1, x2, y2);

        //line info
        System.out.println(temp.lineInfo());

        //new x point coordinate
        System.out.println("Enter the x coordinate: ");
        double xCoord = scan.nextInt();
        scan.nextLine();



    }
}
