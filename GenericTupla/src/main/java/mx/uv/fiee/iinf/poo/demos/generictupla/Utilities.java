package mx.uv.fiee.iinf.poo.demos.generictupla;

public class Utilities {
    Utilities(){

    }

    public static <T,U> boolean compare(T point1, U point2){
        if (point1 instanceof GenericTupla && point2 instanceof GenericTupla){
            return point1.toString().equals(point2.toString()); //Para comparar la llave y el valor de la tupla u objeto que se le pase
        }
        return false; // No es una Tupla Generica
    }
}