package punto6b
import java.util.Scanner;
class punto6b {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner (System.in);
	        int numero;
	        int inicial = 1;
	        int suma = 0;
	       

	        System.out.print("Introduce un numero: ");
	        numero =sc.nextInt();

	        while(inicial < numero)
	        {
	            if(inicial%2==0)
	            {
	                suma = suma + inicial;
	            }
	           
	            inicial++;
	        }

	        System.out.println(" La suma de los numero pares es: "+suma);
		
		
	}

}
