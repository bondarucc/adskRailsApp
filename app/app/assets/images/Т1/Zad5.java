

import java.util.*;
class Student1 implements Comparable
{
	private String imie;
	private String nazwisko;
	private int nrAlbumu;
	
	public Student1(String imie, String nazwisko, int nrAlbumu) 
	{
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nrAlbumu = nrAlbumu;
	}
	
	public int compareTo(Object s)
	{
		if (!nazwisko.equals(((Student1)s).nazwisko))
		{
			if(nazwisko.charAt(0)>(((Student1)s).nazwisko).charAt(0))
			{
				return nazwisko.charAt(0)-(((Student1)s).nazwisko).charAt(0);
			}
			else if(nazwisko.charAt(0)<(((Student1)s).nazwisko).charAt(0))
			{
				return nazwisko.charAt(0)-(((Student1)s).nazwisko).charAt(0);
			}
			else return 0;
		}
		
		else if (!imie.equals(((Student1)s).imie))
		{
			if(imie.charAt(0)>(((Student1)s).imie).charAt(0))
			{
				return imie.charAt(0)-(((Student1)s).imie).charAt(0);
			}
			else if(imie.charAt(0)<(((Student1)s).imie).charAt(0))
			{
				return imie.charAt(0)-(((Student1)s).imie).charAt(0);
			}
			else return 0;
		}
		else return (nrAlbumu - ((Student1)s).nrAlbumu);
	}
	public String toString() 
	{
		return "Student " + imie + " " + nazwisko + " nr albumu: " + nrAlbumu;
	}
}

public class Zad5
{
    public static void main (String[] args) 
    {
        Student1[] lista = new Student1[4];
	lista[0] = new Student1("Jan", "Kowalski", 432187);
	lista[1] = new Student1("Adam", "Nowak", 332132);
	lista[2] = new Student1("Joanna", "Wyszek", 632165);
	lista[3] = new Student1("Ania", "Nowak", 321419);
	Arrays.sort(lista);
	for(Student1 student1:lista)
	{
	   System.out.println(student1);
	}
   }
}