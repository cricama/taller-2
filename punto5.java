package punto5;
import  java.util.Scanner ;
class punto5 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     float velocida=0;
     System.out.println("meta cuantos  kilometro por hora vas: ");
     velocida = sc.nextFloat();
     velocida = velocida*1000/3600; 
     System.out.println( " vas a esta velocida m/s:" + velocida);
	}

}
