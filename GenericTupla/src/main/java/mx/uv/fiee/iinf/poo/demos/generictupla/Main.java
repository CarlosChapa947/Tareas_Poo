package mx.uv.fiee.iinf.poo.demos.generictupla;

public class Main {

    public static void main (String [] args) {
        boolean isEqual;
        GenericTupla<Double, Double> point1 = new GenericTupla<>(Double.valueOf("1"), 1.0);
        GenericTupla<Double, Double> point2 = new GenericTupla<>(1.0, Double.valueOf("1"));
        isEqual = Utilities.compare(point1, point2);
        if(isEqual){
            System.out.println("Exito");
        } else {
            System.out.println("Fracaso");
        }
    }
}
