package szokitalalo;

import java.util.Scanner;
import java.util.Random;

public class SzoKitalalo 
{
    static String [] szoTomb = {"öl", "oz", "to"};
    static int N=szoTomb.length;
    
    public static void main(String[] args) 
    {
        kitalal(SzoValasztas());
    }
    
    static String SzoValasztas() 
    {
        Random rnd = new Random();
        String valasztott = "";
        int szo = rnd.nextInt(N);
        valasztott = szoTomb[szo];
        System.out.println("A gép választott szava: "+valasztott);
        
        return valasztott;
    }

    private static void kitalal(String SzoValasztas) 
    {
        Scanner scSzo= new Scanner(System.in);
        System.out.print("Kérek egy x betűs szót: ");
        String szoTipp=scSzo.nextLine();
        String kiir="";
        
        char tippBetu1=szoTipp.charAt(0);
        char tippBetu2=szoTipp.charAt(1);
        char valasztottBetu1=SzoValasztas.charAt(0);
        char valasztottBetu2=SzoValasztas.charAt(1);
        
        
        if(tippBetu1==valasztottBetu1)
        {
            kiir="jó az első betű.";
        }
        else //if(tippBetu1!=valasztottBetu1)
        {
            kiir="nem jó az első betű.";
        }
        System.out.println(kiir);
        
        if(tippBetu2==valasztottBetu2)
        {
            kiir="jó a második betű.";
        }
        else //if(tippBetu2!=valasztottBetu2)
        {
            kiir="nem jó a második betű.";
        }
        System.out.println(kiir);
        
        if(tippBetu1==valasztottBetu1 && tippBetu2==valasztottBetu2)
        {
            kiir="Eltaláltad a szót!";
        }
        else
        {
            kiir="Nem találtad el!";
        }
        System.out.println(kiir);
    }
}
