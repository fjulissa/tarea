/*
 Escriba un programa java que lea la cadena de texto del ejercicio anterior, después de cada letra
le agregué el carácter token ‘*’, e imprima esa salida
 */
package hola_como_estas;

/**
 *
 * @author DRAKI_MB
 */
public class Hola_Como_Estas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String cadena;
        int longi;
        int long1;
        int long2;
        cadena="Hola Como Estas";
        longi=cadena.length();
        long2=longi-1;
        long1=0;
        System.out.println("La cadena invertida es la siguiente: ");
        do{
            System.out.print(cadena.charAt(long1));
            System.out.print("*");
            long2--;
            long1++;
        }while(long1<longi);
    }
    
}
