public class Creatura {
    protected String name;
    protected int age;

    Creatura(){
        this.name = "";
        this.age = 0;
    }

    Creatura(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void print(){
        System.out.println(String.format("Nombre: %s\n Edad: %d", this.name, this.age));
    }
}
