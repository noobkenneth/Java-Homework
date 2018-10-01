public class MyRectangle2D {
    public double x;
    public double y;
    public double width;
    public double height;

    public MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }


    public boolean contains(double x, double y) {
        double left = this.x - (this.width / 2);
        double right = this.x + (this.width/2);
        double top = this.y + (this.height/2);
        double bottom = this.y - (this.height/2);

        if (x >= left && x <= right && y <= top && y >= bottom) {
            return true;
        }

        return false;
    }

    public boolean contains(MyRectangle2D r) {
        double ruppleftx = r.x - (r.width / 2);
        double rupplefty = r.y + (r.height / 2);
        double rdownrightx = r.x + (r.width / 2);
        double rdownrighty = r.y - (r.height / 2);

        double uppleftx = this.x - (this.width / 2);
        double upplefty = this.y + (this.height / 2);
        double downrightx = this.x + (this.width / 2);
        double downrighty = this.y - (this.height / 2);

        if (ruppleftx >= uppleftx && rupplefty <= upplefty && rdownrightx <= downrightx && rdownrighty >= downrighty) {
            return true;
        }

        return false;
    }

    public boolean overlaps(MyRectangle2D r) {
        return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                        (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }

    private double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
}