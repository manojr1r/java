package OOP.OOP1Challenges;

public class PointTim {
    private int x, y;

    public PointTim() {   }

    public PointTim(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


//d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

    //needs to return the distance between this Point and Point (0, 0) as a double
    public double distance() {
        return distance(0, 0);
    }

//    Method named distance with parameter of type Point,
//    it needs to return the distance between this Point and the parameter Point as a double.
    public double distance(PointTim a){
        return distance(a.x, a.y);
    }

    public double distance(int x, int y) {
//        √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
