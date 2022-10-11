class Point1 {
    private int x, y;
    public Point1(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint1 extends Point1 {
    private String color;
    public ColorPoint1(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public void setXY(int x, int y) {
        move(x, y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return (color+"색의 ("+getX()+","+getY()+")의 점");
    }
}

public class fivefive {
    public static void main(String args[]) {
        ColorPoint1 cp = new ColorPoint1(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}