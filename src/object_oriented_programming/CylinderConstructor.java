package object_oriented_programming;

class  Cylinder01
{
    private int radius;
    private int height;

    public Cylinder01()
    {
        radius=height=1;
    }
    public Cylinder01(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }

    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setDimensions(int h,int r)
    {
        height=h;
        radius=r;
    }

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}


public class CylinderConstructor {

    public static void main(String[] args) {
        Cylinder01 c=new Cylinder01();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);

        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());

    }

}