import java.util.Scanner;

public class main
{
    public static void main (String[] args)
    {
        int[] tablica = new int[50];
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        scanner.nextLine();
        int rozmiar = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Dane z tablicy: \n");

        while (temp < rozmiar)
        {
            tablica[temp] = temp;
            temp++;
        }
        temp = 0;
        do {
            System.out.print("pozycja: " + temp + "\t wartosc: " + tablica[temp] + "\n");
            temp++;
        } while (temp < rozmiar);

        scanner.close();
    }

}