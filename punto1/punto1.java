package punto1;
import java.util.Scanner;
class punto1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int camilo;
		do{
		
		try{
			
		camilo=0;
		int p;
		int hola;
		System.out.println("ingre los numeros: ");
		

           hola = sc.nextInt();
		
		while (hola>0) {
		p=hola%10;
		hola=hola/10;

		System.out.println("estos estan invertidos: "+ p);
		}
		}catch(Exception e){System.out.println("solo es numeros"); camilo=1; sc.nextLine();}
		} while(camilo !=0);
	}
		
}
	


