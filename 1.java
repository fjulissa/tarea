/*
Escriba un applet que permita al usuario introducir los cuatro argumentos requeridos por el
método drawOval, y que después dibuje un óvalo utilizando los cuatro valores introducidos. La
clase Graphics contiene el método drawOval, el cual toma 4 argumentos que especifican el
“cuadro delimitador” para el ovalo: los lados del cuadro delimitador son los límites del óvalo. Los
primeros 2 argumentos representan las coordenadas de la esquina superior izquierda del cuadro y los
otros 2 argumentos son las coordenadas de la esquina inferior derecha del cuadro.
*/package pkg4.ovalo;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author DRAKI_MB
 */
public class Dibujandoelovalo extends JApplet{
    int cor1;
    int cor2;
    int cor3;
    int cor4;
    @Override
    public void init(){
        String Coordenadas;
      Coordenadas=JOptionPane.showInputDialog("Escriba la primera coordenada del ovalo");
    cor1=Integer.parseInt(Coordenadas);
    
    Coordenadas=JOptionPane.showInputDialog("Escriba la segunda coordenada del ovalo");
    cor2=Integer.parseInt(Coordenadas);
    
    Coordenadas=JOptionPane.showInputDialog("Escriba la tercera coordenada del ovalo");
    cor3=Integer.parseInt(Coordenadas);
    
    Coordenadas=JOptionPane.showInputDialog("Escriba la cuarta coordenada del ovalo");
    cor4=Integer.parseInt(Coordenadas);
    
    }//fin de init
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawOval(cor1,cor2,cor3,cor4);
    }
    
    
}
