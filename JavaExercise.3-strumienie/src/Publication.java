public class Publication
{
    int isbn;
    String title;

    public Publication(int isbn, String title)
    {
        this(isbn);
        this.title = title;
    }

    public Publication(int isbn){this.isbn = isbn;}

    public String getInfo() {return isbn + " - " + title;}
}