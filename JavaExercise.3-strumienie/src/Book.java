public class Book extends Publication
{
    double cost;

    public Book(int isbn, String title, double cost)
    {
        super(isbn, title);
        this.cost = cost;
    }

    public String getInfo()
    {return "isbn: " + isbn + " title: " + title + " koszt: " + cost;}
    //{return super.getInfo();}
}