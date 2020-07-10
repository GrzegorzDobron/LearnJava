import java.util.Scanner;

public class Function {
    Scanner scanner = new Scanner(System.in);

    protected int addIsbn()
    {
        int isbn;
        System.out.print("Podaj ISBN: ");
        isbn = scanner.nextInt();
        scanner.nextLine();
        return isbn;
    }

    protected double addCost()
    {
        double cost;
        System.out.print("Podaj cene: ");
        cost = scanner.nextDouble();
        scanner.nextLine();
        return cost;
    }

    protected String addTitle()    {
        String title;
        System.out.print("Podaj tytul: ");
        title = scanner.nextLine();
        return title;
    }

    protected String addAuthor()    {
        String Author;
        System.out.print("Podaj autora: ");
        Author = scanner.nextLine();
        return Author;
    }

}
