package szokitalalo;

import java.util.Scanner;
import java.util.Random;

public class SzoKitalalo 
{
    static String [] szoTomb = {"ol", "oz", "to"};
    static int N=szoTomb.length;
    
    public static void main(String[] args) 
    {
//        while(!kitalal(SzoValasztas())) {
//        kitalal(SzoValasztas());
//            
//        }
        
        kitalal(SzoValasztas());
        System.out.println("sajt");
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

    private static boolean kitalal(String SzoValasztas) 
    {
        Scanner scSzo= new Scanner(System.in);
        System.out.print("Kérek egy 2 betűs szót: ");
        String szoTipp=scSzo.nextLine();
        String kiir="";
        boolean helyes=false;
        
        char tippBetu1=szoTipp.charAt(0);
        char tippBetu2=szoTipp.charAt(1);
        char valasztottBetu1=SzoValasztas.charAt(0);
        char valasztottBetu2=SzoValasztas.charAt(1);
        
        while(!(szoTipp.equals(SzoValasztas)))
        {
            
            if(tippBetu1==valasztottBetu1)
            {
                kiir="jó az első betű.";
            }
            else //if(tippBetu1!=valasztottBetu1)
            {
                kiir="nem jó az első betű.";
                kitalal(SzoValasztas);
            }
            System.out.println(kiir);

            if(tippBetu2==valasztottBetu2)
            {
                kiir="jó a második betű.";
            }
            else //if(tippBetu2!=valasztottBetu2)
            {
                kiir="nem jó a második betű.";
                kitalal(SzoValasztas);
            }
            System.out.println(kiir);

            if(tippBetu1==valasztottBetu1 && tippBetu2==valasztottBetu2)
            {
                kiir="Eltaláltad a szót!";
                helyes = true;
            }
            else
            {
                kiir="Nem találtad el!";
                kitalal(SzoValasztas);
            }
            
            System.out.println(kiir);
            
            
        }
        
        return helyes;
    }
    
    
}
