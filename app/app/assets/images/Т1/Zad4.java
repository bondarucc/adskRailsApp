
import java.util.*;
class Student implements Comparable {
private String imie;
private String nazwisko;
private int nrAlbumu;
public Student(String imie, String nazwisko, int nrAlbumu) {
this.imie = imie;
this.nazwisko = nazwisko;
this.nrAlbumu = nrAlbumu;
}
public int compareTo(Object s){
return (nrAlbumu - ((Student)s).nrAlbumu);
}
public String toString() {
return "Student " + imie + " " + nazwisko + " nr albumu: " + nrAlbumu;
}
}
public class Zad4 {
public static void main (String[] args) {
Student[] lista = new Student[4];
lista[0] = new Student("Jan", "Kowalski", 432187);
lista[1] = new Student("Adam", "Nowak", 332132);
lista[2] = new Student("Joanna", "Wyszek", 632165);
lista[3] = new Student("Ania", "Nowak", 321419);
Arrays.sort(lista);
for(Student student: lista){
System.out.println(student);
}
}
}
