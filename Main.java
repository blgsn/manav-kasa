
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		double pear=2.14,apple=3.67,tomatoes=1.11,banana=0.95,aubergine=5.00;
		int a,e,d,m,p;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Armut kaç kilo?");
		a=input.nextInt();
		
		System.out.print("Elma kaç kilo?");
		e=input.nextInt();
		
		System.out.print("Domates kaç kilo?");
		d=input.nextInt();
		
		System.out.print("Muz kaç kilo?");
		m=input.nextInt();
		
		System.out.print("Patlıcan kaç kilo?");
		p=input.nextInt();
		
		double total=a*pear+e*apple+d*tomatoes+m*banana+p*aubergine;
	
		System.out.println("Toplam tutar:" + total + " TL");
	}

}