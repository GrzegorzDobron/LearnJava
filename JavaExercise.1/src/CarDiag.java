public class CarDiag
{
    public static void main (String[] args)
    {
        //Car Auto1 = new Car("brum", "brum", 56);
        Pojazd Auto1 = new Pojazd("brum");
        Pojazd Auto2 = new Pojazd("brum", "brum", 56);

        System.out.print(Auto1.getInfo());
        int podwyszka = 100;

        Auto1.upgrade(podwyszka);
    }

}
