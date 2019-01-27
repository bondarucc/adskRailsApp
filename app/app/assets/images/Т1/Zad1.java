
import java.util.*;

class Stoper {

private long start;
private long stop;
private String nazwa;


public Stoper(String nazwa) {
this.nazwa = nazwa;
}

public void start(){
start = System.currentTimeMillis();
}
public void stop(){
stop = System.currentTimeMillis();
}
public double pobierzWynik(){
return (stop - start) / 1000.0;
}
}
public class Zad1 {
 public static void main(String[] args) 
 {
     String znak1,znak2;
     String nazwa = "";
     Scanner wprowadzono = new Scanner(System.in);
     
     System.out.println("Wlaczyc‡ stoper? y/n");
     znak1 = wprowadzono.nextLine();
     
     if (znak1.charAt(0) == 'y')
     {
         Stoper s = new Stoper(nazwa);
         s.start();
     
     System.out.println("zatrzymac stoper? y/n");
     znak2 = wprowadzono.nextLine();
     if (znak2.charAt(0) == 'y')
     {
          s.stop();
          double wynik = s.pobierzWynik();
         System.out.println("stoper dzialal‚: " + wynik + " s");
     }
     
  
     }
     
     
     
 }
    
    
}
