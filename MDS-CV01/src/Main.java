import cz.vutbr.bmds.cv01.MyClass;
import cz.vutbr.bmds.cv01.MapClass;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        MyClass prvni = new MyClass();
        MyClass druha = new MyClass();
        MyClass treti = null;

        try{
            treti = new MyClass(1,2,3,4,5,6);

            prvni.addInteger(20);
            prvni.addInteger(21);
            prvni.addInteger(22);

            druha.addInteger(31);
            druha.addInteger(32);
        }catch(IllegalArgumentException e){
            System.err.print("Chyba " + e.getMessage());
        }

        System.out.println("Pocet vytvorenych trid: " + MyClass.getCount());

        System.out.println("Existuje ve trojce 4ka ? " + treti.integerExists(4));

        MyClass united = MyClass.createUnited(prvni,druha);
        united.print();

        System.out.println(united);

        MapClass one = new MapClass();

        one.store(1, "Ferenc");
        one.store(2,"Jozef");
        one.store(100,"stovecka");

        System.out.println("Najdi kluc na id = 100 => " + one.getValue(100) +
                "\nVelkost pola one = " + one.getSize());
        one.deleteKey(1);
        System.out.print("Zmaz hodnotu na id = 1 a vypis velkost pola => " + one.getSize() + "\n");

        one.print();
    }
}
