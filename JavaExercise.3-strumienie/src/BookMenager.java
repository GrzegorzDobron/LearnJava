import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class BookMenager
{
    public static void main(String[] args)
    {
        short opcja;
        int isbn;
        double cost;
        String title;
        String Author;
        String BookName;
        String MagazinName;

        int size = 10;

        Function addOption = new Function();

        Book[] buks = new Book[size];
        Magazine[] magazyny = new Magazine[size];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Spis publikacji \n 1. new book \n 2. new magazine \n");
        opcja = scanner.nextShort();

        switch (opcja)
        {
            case 1:
                System.out.print("wybrano ksiazke \n");
                isbn = addOption.addIsbn();
                title = addOption.addTitle();
                cost = addOption.addCost();
                int BookNumber=10;
                BookName = "Book"+Integer.toString(BookNumber);
                System.out.print(BookName + "\n");
                buks[0] = new Book(isbn, title, cost);
                System.out.print("Wczytana ksiazka to: \n" + buks[0].getInfo());

                break;
            case 2:
                System.out.print("wybrano ksiazke");
                break;
            case 3:
                System.out.print("Koniec programu");
                //Thread.sleep(1000);
                //System.exit(void);
            default:
                System.out.print("Niepoprawna opcja");
                //System.exit();
        }
        scanner.close();
    }
}
