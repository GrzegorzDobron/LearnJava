public class Pojazd
{
    String model;
    String nazwa;
    int cena;

    Pojazd(String model, String nazwa, int cena)
    {
        this(model);
        this.nazwa = nazwa;
        this.cena = cena;
    }

    Pojazd(String model)
    {
        this.model = model;
    }

    String getInfo()
    {
        return "Model: " + model + " koszt to: " + cena + "\n";
    }

    void upgrade(int wzrost)
    {
        System.out.print("przed wzrostem:"+cena + "\n");
        cena = cena+wzrost;
        System.out.print("po wzroscie:"+cena+"\n");
    }

}
