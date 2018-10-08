/*
Escriba un programa java que a partir de la cadena de texto “Hola como estas”, invierta esa
cadena de texto, e imprima esa salida.
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
            System.out.print(cadena.charAt(long2));
            long2--;
            long1++;
        }while(long1<longi);
    }
    
}
