public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    /* Creates a LinearEquation object */
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
  this precondition is not violated) */
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
       the nearest hundredth */
    public double distance() {
        double part1 = Math.pow((x2-x1),2);
        double part2 = Math.pow((y2-y1),2);
        return roundedToHundredth(Math.sqrt(part1+part2));
    }



    /* Calculates and returns the y-intercept of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {
        double equationRight = slope()*x1;
        double yIntercept = y1-equationRight;
        return yIntercept;
    }



    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        int yDifference = y2-y1;
        int xDifference = x2-x1;
        double slope = roundedToHundredth((double) yDifference/xDifference);
        return slope;
    }



    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".
        When generating the m value (slope), here are examples of "printable" slopes:
           5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7
        Here are non-examples of "printable" slopes:
     1/-2 (should be -1/2), -4/-3 (should be 4/3), 8/4 (should be reduced to 2),
           -12/3 (should be -4), 3/3 (should be 1), -6/6 (should be -1)
        HINT: Be sure to check if the line is horizontal and return an appropriate string,
        e.g. y = 6
        HINT: Absolute value might be helpful for ensuring proper placement of negative sign!
        When generating the b value, here are some examples of "printable" y-intercepts:
           + 1.0   - 2.35       + 12.5      - 8.0     + 17.19
        Here are non-examples of "printable" y-intercepts:
           - -1.0  + -2.35    - -12.5    + -8.0      - -17.19  + 0    - 0
        HINT: Absolute value might be helpful for printing negative y-intercepts as
               subtraction!
     */
    public String equation() {
        String equationLeft = "y = ";
        String temp;
        String b;
        // m
        int yDifference = y2-y1;
        int xDifference = x2-x1;
        String m;
        // m
        if (slope() == 1) {
            m = "";
            temp = equationLeft + m + "x ";
        } else if (slope() == -1) {
            m = "-";
            temp = equationLeft + m + "x ";
        } else if (slope() == 0) {
            m = "";
            temp = equationLeft + yIntercept();
        } else if ( yDifference%xDifference == 0) {
            m = yDifference/xDifference + "";
            temp = equationLeft + m + "x ";
        } else if (yDifference<0 && xDifference<0) {
            m = Math.abs(yDifference)+"/"+Math.abs(xDifference);
            temp = equationLeft + m + "x ";
        } else if(xDifference<0) {
            m = "-" + yDifference + "/" + (Math.abs(xDifference));
            temp = equationLeft + m + "x ";
        } else {
            m = yDifference+"/"+xDifference;
            temp = equationLeft + m + "x ";
        }

        //+b

        if (slope()==0) {
            b = "";
        } else if(yIntercept()<0) {
            b = "- " + (Math.abs(yIntercept())) ;
        } else  if (yIntercept() == 0) {
            b = "";
        } else {
            b = "+ " + yIntercept();
        }

        return temp + b;
    }





    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue) {
//        String temp = equation().substring(4);
//        int idx = temp.indexOf("x");
//        String slope = (temp.substring(0, idx));
//        double slopeInt;
//        if (slope.indexOf("/")<0) {
//            slopeInt = Integer.parseInt(slope);
//        } else {
//            int first = Integer.parseInt(slope.substring(0, slope.indexOf("/")));
//            int end = Integer.parseInt(slope.substring(slope.indexOf("/")+1));
//            double second = (double) 1 / end;
//            slopeInt = first * second;
//        }
        return "("+xValue+ ", " + ((slope() * xValue) + yIntercept())+")";

    }





    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth
        HINT:  the Math.round method can help with this!
     */
    public double roundedToHundredth(double num ) {
        return (double) Math.round(num * 100)/100;
    }



    /* Returns a string that includes all information about the linear equation, each on
       separate lines:
         - The original points: (x1, y1) and (x2, y2)
         - The equation of the line in y = mx + b format (using equation() method)
         - The slope of the line, as a decimal (using slope() method)
         - The y-intercept of the line (using yIntercept() method)
         - The distance between the two points (using distance() method)
      This method should call all other appropriate methods to get the info it needs:
      equation(), slope(), yIntercept(), distance().
      */
    public String lineInfo() {
        String line1 = "The original points: ("+x1+", "+y1+") and ("+x2+", "+y2+")";
        String line2 = "The equation of the line in y = mx + b format: "+ equation();
        String line3 = "The slope of the line, as a decimal: "+ slope();
        String line4 = "The y-intercept of the line: "+yIntercept();
        String line5 = "The distance between the two points: "+ distance();
        return line1 +"\n"+ line2 +"\n"+ line3 +"\n"+ line4 +"\n"+ line5 +"\n";
    }


}