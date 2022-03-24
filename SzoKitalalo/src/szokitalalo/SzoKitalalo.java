package szokitalalo;

import java.util.Scanner;
import java.util.Random;

public class SzoKitalalo 
{
    static String [] szoTomb = {"ól", "őz", "tó"};
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
        
//        int i=0;
//        while(i<N && !(SzoValasztas==szoTipp))
//        {
//            i++;
//            
//        }
        
        //for (int i = 0; i < SzoValasztas.length(); i++) 
        int i=0;
        while(i<N && (SzoValasztas!=szoTipp))
            {
                i++;
                if(i<N)
                {
                    System.out.printf("van ilyen benne és jó helyen: %d",szoTomb[i].length());
                }
                else if(i<N)
                {
                    System.out.printf("van ilyen benne, de rossz helyen: %d",szoTomb[i].length());
                }
                else
                {
                    System.out.print("nincs ilyen benne!");
                }
            }
        
        
    }


    

    
}
