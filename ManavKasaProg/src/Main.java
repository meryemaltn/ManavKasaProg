
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Deðiþkenleri Tanýmlýyorum.
		double a=2.14, e=3.67, d=1.11, m=0.95, p=5.00, tutar;
		
		//Þimdi Kullanýcýdan Ürünlerin Kilo Bilgisini Ýstiyorum.
		Scanner inp = new Scanner(System.in);
		System.out.println("Armut Kaç Kilo: ");
		double armut=inp.nextDouble();
		
		System.out.println("Elma Kaç Kilo: ");
		double elma=inp.nextDouble();
		
		System.out.println("Domates Kaç Kilo: ");
		double domates=inp.nextDouble();
		
		System.out.println("Muz Kaç Kilo: ");
		double muz=inp.nextDouble();
		
		System.out.println("Patlýcan Kaç Kilo: ");
		double patlican=inp.nextDouble();
		
		//Þimdi Tutarý Hesaplýyorum
		tutar=((a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican));
		System.out.println("Toplam Tutar: "+ tutar);
	}
}
