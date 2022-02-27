package mx.uv.fiee.iinf.poo;

public class Circle <T extends Number> implements Draw, Calculate, Comparable<Circle>{
    T radius, diameter, circumference;
    public Circle(T radius, T diameter, T circumference){
        this.radius = radius;
        this.diameter = diameter;
        this.circumference = circumference;
    }
    @Override
    public double calculateArea() {
        return Math.pow(this.radius.doubleValue(), 2)*Math.PI;
    }
    @Override
    public void draw(int color) {

    }

    @Override
    public void fill(int color) {

    }

    @Override
    public int compareTo(Circle cir){
        double area1=this.calculateArea(), area2=cir.calculateArea();
        return Double.compare(area1, area2);
    }
}
