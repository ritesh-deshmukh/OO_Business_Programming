// Name: Ritesh Deshmukh

public class Rectangle {
    public int length,width,perimeter,area;

    public Rectangle()
    {

        this(0,0,0,0);
    }

    public Rectangle(int l, int w, int p, int a)
    {
        setLength(l);
        setWidth(w);
        setPerimeter(p);
        setArea(a);
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getPerimeter(){
        return perimeter;
    }
    public int getArea(){
        return area;
    }
    public void setLength(int l){
            length = l;
    }
    public void setWidth(int w){
            width = w;
    }public void setPerimeter(int p){
        p = 2*length + 2*width;
            perimeter = p;
    }public void setArea(int a){
        a = length * width;
            area = a;
    }
    public String toString(){
        return "Length = " + length + ", Width = " + width + ", Perimeter = " + perimeter + ", Area = " + area;
    }
    public boolean equals(Object x){
        Rectangle r = (Rectangle)x;
        if ((length == r.getLength()) && (width == r.getWidth()) && (perimeter == r.getPerimeter()) && (area == r.getArea()))
            return true;
        return false;
    }
    public Rectangle clone(){
        Rectangle r =  new Rectangle(length,width,perimeter,area);
        return r;
    }


}
