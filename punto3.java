package punto3;

import java.util.Scanner;
public class punto3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		float grados=0;
		int camilo;
		do {
		try {	
		camilo=0;
		System.out.println("ingrese los grados: ");
		grados = sc.nextFloat();
		float farenheit=grados*2-grados/5;
		farenheit=farenheit+32;
		System.out.println("a esto equibale: "+farenheit);
		
		}catch(Exception e){System.out.println("solo es numeros"); camilo=1; sc.nextLine();}
		}while(camilo !=0);

	}

}
