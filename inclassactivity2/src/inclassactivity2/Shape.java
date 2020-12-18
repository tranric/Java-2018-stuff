package inclassactivity2;

abstract public class Shape
{
    public abstract double getArea();
}

class TwoDimensionalShape extends Shape
{
    public double getArea(){
        return 0;
    }
}

class ThreeDimensionalShape extends Shape
{
    public double getArea(){
        return 0;
    }
}

class Circle extends TwoDimensionalShape
{
    public double getArea(double radius){
        return radius*radius;
    }
}

class Square extends TwoDimensionalShape
{
    public double getArea(double length, double width){
        return length * width;
    }
}

class Triangle extends TwoDimensionalShape
{
    public double getArea(double base, double height){
        return ((base * height)/2);
    }
}

class Sphere extends ThreeDimensionalShape
{
    public double getArea(double radius){
        return (4*Math.PI*Math.pow(radius, 2));
    }
}

class Cube extends ThreeDimensionalShape
{
    public double getArea(double edge){
        return (6*Math.pow(edge, 2));
    }
}

class Tetrahedron extends ThreeDimensionalShape
{
    public double getArea(double edge){
        return (Math.sqrt(3)*Math.pow(edge, 2));
    }
}
