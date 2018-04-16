import java.io.*;
import java.nio.*;
import java.util.ArrayList;
import java.util.Scanner;
class BazaDanych{
	public ArrayList<Konta> ListaKont = new ArrayList<Konta>();
	public String filePath = "C:\\Users\\Kovalio\\Desktop\\Bank\\tekst";
	public Scanner Odczyt = new Scanner(System.in);
	public ObjectInputStream Wczytanie;
	
	public void NoweDoBD(String Imie, String Nazwisko, int[] Pesel, String Adres){
		FileWriter fileWriter = null;
		try {
			File file = new File(filePath);
			if (file.createNewFile()){
				System.out.println("Plik zostal stworzony!");
			}else{
				System.out.println("Plik juz istnieje");
			}
		} catch (IOException e) {
			System.out.println("Podczas zapisywania pliku pojawil sie blad. Powtorz cala operacje zakladania konta.");
			e.printStackTrace();
		}
		try {
            /*fileWriter = new FileWriter(filePath, true);
            fileWriter.write(Imie + " ");
			fileWriter.write(Nazwisko + " ");
			for(int i=0;i<11;i++){ fileWriter.write(Integer.toString(Pesel[i])); }
			fileWriter.write( " " + Adres + " ");
			fileWriter.write(Integer.toString(0) + "\n");*/
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Imie + " ");
			oos.writeObject(Nazwisko + " ");
			for(int i=0;i<11;i++){ oos.writeObject(Integer.toString(Pesel[i])); }
			oos.writeObject( " " + Adres + " ");
			oos.writeObject(Integer.toString(0) + "\n");
        } catch (IOException e) {}
        finally {
            try {
                if(fileWriter != null) {
                    fileWriter.close();
                }
            } catch(IOException io) {
            }
        }
	}
	public void OdczytBD() throws IOException, EOFException, ClassNotFoundException {
		//FileReader fileReader = null;
		System.out.println("Wczytywanie bazy danych rozpoczeto");
		//fileReader = new FileReader(filePath);
		FileInputStream Uchwyt = new FileInputStream(filePath);
		ObjectInputStream Wczytanie= new ObjectInputStream(Uchwyt);
		System.out.println("Wczytywanie bazy danych zakonczone pomyslnie.");
		while(Uchwyt.available() > 0)
		{
			System.out.println("Wczytywanie bazy danych rozpoczetox4");
			ListaKont.add((Konta)Wczytanie.readObject());
		}
		System.out.println(ListaKont.size());
		System.out.println("Wczytywanie bazy danych rozpoczetox5");
	}
	public void  WszystkieKonta(){
		for(int i=0;i<10;i++)
		{
			System.out.println("<=============================>");
			System.out.println("Konto numer " + (i+1));
			System.out.println(ListaKont.get(i));
		}
	}
}