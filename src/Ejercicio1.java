
public class Ejercicio1 {

	public static void main(String[] args) {
    	String cad="as15j7@21";
    	char[] array;
    	array=obtenerArrayCaracteres(cad);
   	 
    	int suma=0;
    	 
    	for (int i = 0; i < array.length; i++) { // lee el array de un caracter a otro, si es numero lo va sumando, y si es caracter simplemente pasa al siguiente
   		 char c= array[i];
   		 int d = 0;
   		 if(Character.isDigit(c)){
   			 d = Character.getNumericValue(c); // Con esta función coge el valor del número y no su valor ascii
   		 }
   		 suma=suma+d;
   	 }
    	System.out.println(suma);
   }

	public static char[] obtenerArrayCaracteres(String cadena) //coge la longitud de la cadena y hace un array del mismo tamaño
	{
    	char[] arrayCaract= new char[cadena.length()];
    	for(int i=0;i<cadena.length();i++)
    	{
        	arrayCaract[i]=cadena.charAt(i);
    	}
    	return arrayCaract;
   	 
	}//obtenerArrayCaracteres    
}



