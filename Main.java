
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00;
		int a,e,d,m,p;
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.print("Armut kaç kilo?");
		a=girdi.nextInt();
		
		System.out.print("Elma kaç kilo?");
		e=girdi.nextInt();
		
		System.out.print("Domates kaç kilo?");
		d=girdi.nextInt();
		
		System.out.print("Muz kaç kilo?");
		m=girdi.nextInt();
		
		System.out.print("Patlıcan kaç kilo?");
		p=girdi.nextInt();
		
		double toplam=a*armut+e*elma+d*domates+m*muz+p*patlıcan;
	
		System.out.println("Toplam tutar:" + toplam + " TL");
	}

}