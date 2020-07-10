public class Magazine extends Publication
{
   String wydawca;

   public Magazine(int isbn, String title, String wydawca)
   {
       super(isbn, title);
       this.wydawca = wydawca;
   }

   public String getInfo() {return "isbn: " + isbn + " title: " + title + " wydawca: " + wydawca;}
}