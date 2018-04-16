import java.util.Scanner;
class Konta{
	public int NumerKonta;
    public String Imie;
    public String Nazwisko;
    public int[] Pesel;
    public String Adres;
    public int StanKonta;
    public int IloscKont;

    public Konta() {
        NumerKonta = 0;
        Pesel = new int[11];
        StanKonta = 0;
		NoweKonto();
    }
	
	public void  NoweKonto(){
		String odczyt;
		boolean potwierdz;
		System.out.println("Witam w kreatorze konta.");
		System.out.println("Prosze podac imie nowego uzytkownika.");
		Scanner odczytywanie = new Scanner(System.in);
		Imie = odczytywanie.nextLine();
		System.out.println("Prosze podac nazwisko nowego uzytkownika.");
		Nazwisko = odczytywanie.nextLine();
		Peselik bar = new Peselik();
		Pesel=bar.SprawdzPesel();
		System.out.println("Prosze podac adres nowego uzytkownika.");
		Adres = odczytywanie.nextLine();
		Potwierdzenie par = new Potwierdzenie();
		potwierdz=par.PotwierdzenieOperacji();
		if(potwierdz==true){
			System.out.println("Operacja zostala potwierdzona.");
		}
		else{
			System.out.println("Operacja zostala anulowana.");
		}
		BazaDanych Dane = new BazaDanych();
		Dane.NoweDoBD(Imie,Nazwisko,Pesel,Adres);
	}
}