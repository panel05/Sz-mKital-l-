package szokitalalo;

import java.util.Scanner;
import java.util.Random;

public class SzoKitalalo 
{
    static String [] szoTomb = {"ól", "őz", "tó"};

    
    public static void main(String[] args) 
    {
        kitalal();
        SzoValasztas();
    }

    private static void kitalal() 
    {
        Scanner scSzo= new Scanner(System.in);
        
        int i=0;
    }


    

    static void SzoValasztas() 
    {
        String valasztott = " ";
        Random rnd = new Random();
        int szo = rnd.nextInt(szoTomb.length);
        valasztott = szoTomb[szo];
        System.out.println(valasztott);
    }
}
