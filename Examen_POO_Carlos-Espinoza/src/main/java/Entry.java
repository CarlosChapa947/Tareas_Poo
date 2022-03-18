public class Entry {
    public static void main(String[] args) {
        Human male = new Human("Adan", 50);
        Human female = new Human("Eva", 45);
        Human[] hc = new Human[3];
        hc[0] = new Human("Hugo", 20);
        hc[1] = new Human("Paco", 18);
        hc[2] = new Human("Luis", 15);

        Family<Human> fm = new Family<>(male, female, hc);
        fm.getFather().print();
        fm.getMother().print();
        for (int i = 0; i < hc.length; i++) {
            fm.getChild(i).print();
        }

        Dog dogMale = new Dog ("Jimmy", 8);
        Dog dogFemale = new Dog ("Julie", 6);
        Dog [] puppies = new Dog [2];
        puppies [0] = new Dog ("toto", 1);
        puppies [1] = new Dog ("nimo", 2);

        Family<Dog> fd = new Family<>(dogMale, dogFemale, puppies);
        fd.getFather().print ();
        fd.getMother().print ();
        for (int i = 0; i < puppies.length; i++) {
            fd.getChild(i).print ();
        }
    }
}