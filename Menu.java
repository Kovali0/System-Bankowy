import java.util.Scanner;
class Menu{
	public static int PytanieOKomende (){
		System.out.println("Aby dzialac na kontach bankowych wpisz jedno z dostepnych polecen.");
		System.out.println("Aby zobaczyc liste dostepnych polecen wpisz: ==l==. ");
		System.out.println("Aby zakonczyc dzialanie programu wpisz: ==esc==. ");
		String wczytywana; int warunekwyjscia=1;
		Scanner odczyt = new Scanner(System.in);
		wczytywana = odczyt.nextLine();
		switch(wczytywana){
			case "esc":
				warunekwyjscia=0;
			break;
			case "l":
				warunekwyjscia=1;
				System.out.println("Lista dostepnych polecen:");
				System.out.println("<<==============================>>");
				System.out.println("Komenda pozwalajaca zalozyc nowe konto: ==zalozkonto==");
				System.out.println("Komenda pozwalajaca usunac istniejace konto: ==usunkonto==");
				System.out.println("Komenda do wplaty pieniedzy na konto: ==wplac==");
				System.out.println("Komenda do wyplaty pieniedzy z konta: ==wyplac==");
				System.out.println("Komenda pozwalajaca na transfer pieniezny miedzy kontami: ==transfer==");
				System.out.println("Komenda wyswietlajaca informacje o wszystkich kontach: ==wyswietl==");
				System.out.println("Komenda wyswietlajaca informacje o wybranych kontach: ==wyswietljesli==");
				System.out.println("Komenda zakonczenia pracy systemu: ==esc==");
			break;
			case "zalozkonto":
				warunekwyjscia=1;
				System.out.println("zalozkonto");
				Konta k = new Konta();
			break;
			case "usunkonto":
				warunekwyjscia=1;
				System.out.println("usunkonto");
			case "wplac":
				warunekwyjscia=1;
				System.out.println("wplac");
			break;
			case "wyplac":
				warunekwyjscia=1;
				System.out.println("wyplac");
			case "transfer":
				warunekwyjscia=1;
				System.out.println("transfer");
			break;
			case "wyswietl":
				warunekwyjscia=1;
				System.out.println("wyswietl");
				BazaDanych Dane = new BazaDanych();
				try{
				Dane.OdczytBD();
				}catch(Exception e){
					System.out.println("cos jeblo" + e);
				}
				Dane.WszystkieKonta();
			break;
			case "wyswietljesli":
				warunekwyjscia=1;
				System.out.println("wyswietljesli");
			break;
			default:
				System.out.println("Podano zla komende. Wydaj polecenie jeszcze raz.");
				System.out.println("Jezeli nie znasz dostepnych polecen, ich lista wyswietli sie po wpisaniu komendy: '' l ''.");
		}
		return warunekwyjscia;
	}
}