import java.util.Scanner;

/*
 *  Realizar un método que reciba un valor numérico y un array de enteros. Dependiendo del valor numérico que se reciba deberá realizar:
 *  a) Si es un 1 deberá realizar la suma de todos los valores del array e imprimirlo por pantalla.
 *  b) Si es un 2 deberá realizar la resta de todos los valores e imprimirlo por pantalla.
 *  c) Si es un 3 deberá realizar la multiplicación de todos los valores e imprimirlo por pantalla.
 *  d) Si es cualquier otro valor deberá mostrar un mensaje de error (valor no definido).
 *  Realizar la comprobación de los valores mediante un switch.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
   	 int[] num = { 1, 42, 7, 25, 5, 62, 3, 81, 2};
   	 int opciones;
   	 
   	 do {

   		 opciones = obtenerOpciones();						//mediante el switch escogemos una de las 3 operaciones
   		 switch (opciones) {

   		 
   		 case 1:											//funcion en el caso 1 donde suma los valores
   			 int suma=0;
   			 for (int i = 0; i < num.length; i++) {
   				 int a = num[i];
   				 suma=suma+a;
   			 }
   			 System.out.println(suma);
   			 break;

   		 
   		 case 2:											//funcion en el caso 1 donde se restan los valores
   			 int resta = num[0];
   			 for (int i = 1; i < num.length; i++) {
   				 int a = num[i];
   				 resta=resta-a;
   			 }
   			 System.out.println(resta);

   			 break;

   		 
   		 case 3:											//funcion donde multiplica los valores, si el usuario introduce demasiados numeros dara un numero negativo, 
   			 int multiplicacion = num[0];					//ser el numero demasiado grande
   			 for (int i = 1; i < num.length; i++) {
   				 int a = num[i];
   				 multiplicacion=multiplicacion*a;
   			 }
   			 System.out.println(multiplicacion);
   			 

   			 break;

   		 }
   	 } while (opciones >= 1 && opciones <= 3);				//mientras marque valores del uno al 3 sigue operando, sino sale.

   	 

    }

    private static int obtenerOpciones() {  				//esta funcion recoge el valor introducido por el usuario
   	 int num = 0;

   	 Scanner sc = new Scanner(System.in);

   	 boolean valorCorrecto = false; // el usuario tiene 3 opciones para introducir, 1,2 y 3, si no es ninguna salta el mensaje de valor no definido
   	 while (valorCorrecto == false) {
   		 System.out.println("Indique la opción que desee calcular:\n" + "\t1:Suma de todos los valores\n"
   				 + "\t2:Resta de todos los valores\n" + "\t3:Multiplicación de todos los valores\n");
   		 if (sc.hasNextInt()) {
   			 num = sc.nextInt();
   			 if (num >= 1 && num <= 3)
   				 valorCorrecto = true;
   			 else {
   				 System.out.println("Valor no definido");
   				 valorCorrecto = false;
   			 }
   		 } else {
   			 System.out.println("Valor no definido");
   			 sc.next();
   			 valorCorrecto = false;

   		 }

   	 } // while
   	 return num;
    }// obtenerOpciones
}

