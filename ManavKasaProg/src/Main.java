
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// De�i�kenleri Tan�ml�yorum.
		double a=2.14, e=3.67, d=1.11, m=0.95, p=5.00, tutar;
		
		//�imdi Kullan�c�dan �r�nlerin Kilo Bilgisini �stiyorum.
		Scanner inp = new Scanner(System.in);
		System.out.println("Armut Ka� Kilo: ");
		double armut=inp.nextDouble();
		
		System.out.println("Elma Ka� Kilo: ");
		double elma=inp.nextDouble();
		
		System.out.println("Domates Ka� Kilo: ");
		double domates=inp.nextDouble();
		
		System.out.println("Muz Ka� Kilo: ");
		double muz=inp.nextDouble();
		
		System.out.println("Patl�can Ka� Kilo: ");
		double patlican=inp.nextDouble();
		
		//�imdi Tutar� Hesapl�yorum
		tutar=((a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican));
		System.out.println("Toplam Tutar: "+ tutar);
	}
}
