package punto7a;
import java.util.Scanner;
class punto7a {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int numero,i,j;
	        System.out.print("indica la tabla de multiplicar: ");
	        numero = sc.nextInt();
	 
	        for(i = 1; i<=numero; i++)
	        {
	            for(j = 1; j <= 12; j++)
	            {
	            	
	                System.out.println(i + " X " + j + " = " + i*j);
	            }
	            System.out.print("estas es la tabla de: \n");
		
	  }

      }
}