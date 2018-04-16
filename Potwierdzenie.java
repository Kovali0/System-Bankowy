import java.util.Scanner;
class Potwierdzenie{
	
	public boolean PotwierdzenieOperacji()
	{
		int warunek=1;
		System.out.println("Czy potwierdzasz dokonanie operacji? Po tej odpowiedzi nie bedzie juz mozna cofnac zmian. (Wpisz 'Tak' lub 'Nie')");
		String odpowiedz = "";
		Scanner odczytywanie = new Scanner(System.in);
		do{
			odpowiedz = odczytywanie.nextLine();
			if(odpowiedz.equals("tak")){
				return true;
			}
			else{
				if(odpowiedz.equals("nie")){
				return false;
				}
				else{
					System.out.println("Wpisano zla odpowiedz. Wpisz 'Tak' lub 'Nie'");
					System.out.println("Czy potwierdzasz dokonanie operacji? Po tej odpowiedzi nie bedzie juz mozna cofnac zmian.");
					warunek=1;
				}
			}
		}while(warunek==1);
		return false;
	}
}