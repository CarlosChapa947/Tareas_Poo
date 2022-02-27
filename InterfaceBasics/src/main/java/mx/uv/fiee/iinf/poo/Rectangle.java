package mx.uv.fiee.iinf.poo;

public class Rectangle <T extends Number> implements Draw, Calculate, Comparable<Rectangle>{
    private T lado1, lado2, altura1, altura2;
    public Rectangle(T lado1, T lado2, T altura1, T altura2){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura1 = altura1;
        this.altura2 = altura2;
    }
    @Override
    public double calculateArea() {
        return lado1.doubleValue() * altura1.doubleValue();
    }

    @Override
    public void draw(int color) {

    }

    @Override
    public void fill(int color) {

    }

    @Override
    public int compareTo(Rectangle rect){
        return Double.compare(this.calculateArea(), rect.calculateArea());
    }
}
