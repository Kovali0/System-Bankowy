import java.util.Scanner;
public class Bank{
	public static void main (String[] args){
		int warunekwyjscia = 1;
		System.out.println("Uruchomiono system bankowy BV 0.1");
		do{
			warunekwyjscia=Menu.PytanieOKomende();
		}while(warunekwyjscia==1);
		System.out.println("System bankowy zostal zamkniety.");
	}
}