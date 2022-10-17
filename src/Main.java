import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //welcome
        System.out.println("Welcome!");
        //coordinates
        System.out.println("Enter your first coordinate: ");
        String coord1 = scan.nextLine();
        System.out.println("Enter your second coordinate: ");
        String coord2 = scan.nextLine();
        //x and y values
        double x1;
        double x2;
        double y1;
        double y2;


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

        String tempx2 = (newCoord2.substring(0,comma1));
        String tempy2 = (newCoord2.substring(comma1+2));
        x2 = Integer.parseInt(tempx2);
        y2 = Integer.parseInt(tempy2);


    }
}
