import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		char[] arrayCaracteres = new char [5];// establezco el tamaño del array en 5, para que el usuario con el arrarCaracteres introduzca 5 tambien.
		System.out.println("Introduce " + arrayCaracteres.length + " caracteres");
		for (int i = 0; i < arrayCaracteres.length; i++) { // el usuario tiene que introducir de uno en uno, puesto que solo va a coger unicamente el primer caracter
			Scanner sc=new Scanner(System.in);
			char n = sc.next().charAt(0);
			arrayCaracteres[i]=n;
			
		}
		System.out.println(arrayCaracteres);// imprimo los caracteres
	}

}
