package punto7b;
import  java.util.Scanner ;
class punto7b {

	public static void main(String[] args) {
		   Scanner numero = new Scanner(System.in);
		  long factorial=1;
	        int num;
	     
	        System.out.print("Introduce un número: ");
	        num = numero.nextInt();
	        for (int i = num; i > 0; i--) {
	            factorial = factorial * i;
	        }
	        System.out.println("El factorial de " + num + " es: " + factorial);
	}

}
