
import java.util.*;

class Licznik 
{
  private int ilosc = 0;
  
  
  public Licznik()
  {
 
  }
  
  public int pobierzIlosc ()
  {
      return ilosc;
  }
   public void  ustawIlosc ()
  {
    ilosc++;
  } 
}

public class Zad2 {
    public static void main(String[] args) 
 {
     String znak;
     Licznik l = new Licznik();
     Scanner wprowadzono = new Scanner(System.in);
     
     System.out.println("Napisz coś");
     znak = wprowadzono.nextLine();
     
     for (int i = 0; i <znak.length(); i++)
     {
         if(znak.charAt(i) == 32)
            l.ustawIlosc();
              
     }
     int wynik = l.pobierzIlosc();
     System.out.println("ilosc spacji: " + wynik);
     
 }
    
    
}
