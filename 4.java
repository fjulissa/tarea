/*1.- Diseñe un programa para calcular si una cadena de texto es un palíndromo.
Palíndromo: Palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.*/
package verifiparalin;
import java.util.* ;
import java.util.Scanner;

/**
 *
 * @author DRAKI_MB
 */
public class Verifiparalin {
    public static void main(String[] args) {
        
        Scanner palabra = new Scanner(System.in);
        String palabra1;
        String PalaAl;
        System.out.println("Ingrese una cadena de texto o palabra ara verificar si la xpreción es palíndromo: ");
        palabra1=palabra.nextLine();
        int longitud;
        int longitud1;
        int longitud2;
        boolean x=true;
        longitud=palabra1.length();
        longitud2=longitud-1;
        longitud1=0;
        do {
             if(palabra1.charAt(longitud2)==palabra1.charAt(longitud1)){
                 x=false;
             }
             longitud2--;
             longitud1++;
	 } while (longitud2!=-1 && longitud1<=longitud && x==false);
        if(x==false){
            System.out.println("El nombre si es un texto palíndromo");
        }
        else{
             System.out.println("El nombre no es un texto palíndromo");
        }
    }
    
}
