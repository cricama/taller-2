package punto6a;
import java.util.Scanner;
class punto6a {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		 int n,num,camilo=1,s=0;
		  
		  do{
		   System.out.print("Cuantos numeros vas sumar: ");
		   n = Integer.parseInt(sc.nextLine());
		  }while(n<=0);
		  
		  while(camilo<=n){
		   System.out.print("Ingrese ");
		   num = Integer.parseInt(sc.nextLine());
		   s = s+num;
		   camilo=camilo+1;
		  }
		     System.out.print("Suma: "+s);
		
	}

}
