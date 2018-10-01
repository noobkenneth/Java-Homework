public class TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D myRectangle2D = new MyRectangle2D();
        myRectangle2D.setHeight(4);
        myRectangle2D.setWidth(4);
        myRectangle2D.setX(5);
        myRectangle2D.setY(5);
        MyRectangle2D r = new MyRectangle2D(0, 0, 3, 3);
        //System.out.println(myRectangle2D.getArea());
        //System.out.println(myRectangle2D.getPerimeter());
        //System.out.println(myRectangle2D.getHeight());
        //System.out.println(myRectangle2D.contains(2,1));
        System.out.println(myRectangle2D.overlaps(r));
    }
}
