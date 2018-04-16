import java.util.Scanner;
class Peselik{
    public int[] Pesel;
	
    public Peselik() {
        Pesel = new int[11];  
    }
	
	//public boolean LiczbaKontrolna(int[] P){
	//	int suma;
	//	suma=P[0]*1
	//	for(int i=0; i<11; i++){
	//		P[i]
	//x  -= (x / 10) * 10; od Chodora
	//	}
	//}
	
	public int[] SprawdzPesel()
	{
		String odczyt;
		Scanner odczytywanie = new Scanner(System.in);
		int warunek = 1;
		do{
			System.out.println("Prosze podac pesel nowego uzytkownika. (11 cyfr)");
			odczyt = odczytywanie.nextLine();
			if(odczyt.length()==11){
				try{
					for(int i = 0; i < odczyt.length(); i++){
						Pesel[i] = Character.digit(odczyt.charAt(i), 10);
						if(Pesel[i]==-1){
							throw new NumberFormatException();
						}
					}
					warunek = 0;
				}catch(NumberFormatException e){
					System.out.println("Podano nieprawidlowy Pesel. Wprowadz dane jeszcze raz.");
					warunek = 1;
				}
			}
			else{
				System.out.println("Podano zla ilosc cyfr. Wprowadz Pesel jeszcze raz.");
				warunek = 1;
			}
			if(Pesel[2] % 2==1){
				if(Pesel[3]>2){
					System.out.println("W podanym Peslu wystepuje blad w cyfrach odpowiadajaych miesiacom. Powtorz wprowadzenie danych.");
					warunek = 1;
				}
			}
			switch(Pesel[4]){
				case 0:
					if(Pesel[5]==0){
						System.out.println("W podanym Peslu wystepuje blad w cyfrach odpowiadajaych dniom. Powtorz wprowadzenie danych.");
						warunek=1;
					}
				break;
				case 3:
					if(Pesel[5]>1){
						System.out.println("W podanym Peslu wystepuje blad w cyfrach odpowiadajaych dniom. Powtorz wprowadzenie danych.");
						warunek=1;
					}
				break;
				default:
					System.out.println("W podanym Peslu wystepuje blad w cyfrach odpowiadajaych dniom. Powtorz wprowadzenie danych.");
					warunek=1;
			}	
		}while(warunek==1);
		return Pesel;
	}
}