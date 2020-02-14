package Week1.Classes;

public class Rectangle {
    // field

    private int wid = 1;
    private int hi = 1;
    private String color;

    // constructor
    public Rectangle(int wid, int hi, String color) {
        this.wid = wid;
        this.hi = hi;
        this.color = color;
    }

    // methods
    public int getWid() {
        return wid;
    }

    public int getHi() {
        return hi;
    }

    public String getColor() {
        return color;
    }

    public String draw() {

        if (Character.isUpperCase(color.charAt(0)))

            for (int h = 1; h <= hi; h++) {
                for (int w = 1; w <= wid; w++) {
                    System.out.print(color.charAt(0));

            }
            System.out.println("");

        }
        return "";
    }



        public void setWid ( int wid){
            this.wid = wid;
        }
        public void setHi ( int hi){
            this.hi = hi;
        }
        public void setColor (String color){ this.color = color; }
    }

