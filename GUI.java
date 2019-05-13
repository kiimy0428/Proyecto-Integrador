import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class GUI
{
    
    //Instanciar objetos
     static JFrame f = new JFrame("Movimiento de Proyectil con Rozamiento");
     //JLabel
     static JLabel imglbl=new JLabel();
     static JLabel IV = new JLabel("Velocidad Inicial: (m/s)");
     static JLabel angulo = new JLabel("Angulo: (°)");
     static JLabel Gravedad = new JLabel("Gravedad: (m/s^2)");
     static JLabel Friccion = new JLabel("Coeficiente de friccion: 0.01 (1/s)");
     static JLabel Aire = new JLabel("Con Rozamiento: ");
     static JLabel Vacio = new JLabel("En el vacio: ");
     static JLabel TA = new JLabel("Tiempo en el aire: ");
     static JLabel AM = new JLabel("Altura Maxima: ");
     static JLabel AL = new JLabel("Alcance: ");
     static JLabel TAsr = new JLabel("Tiempo en el aire: ");
     static JLabel AMsr = new JLabel("Altura Maxima: ");
     static JLabel ALsr = new JLabel("Alcance: ");
     
     //JTextField
     static JTextField InicialVelocity = new JTextField();
     static JTextField angle = new JTextField();
     static JTextField Gravity = new JTextField();
     
     
     //JButton
     static JButton calc = new JButton ("Fuego!!");
     
    
     //Constructor del programa
    public static void gui() throws IOException 
    {
     //Parametros del main frame
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setBounds(450,250,900,470);
     f.setLayout(null);
     f.setVisible(true);
     f.setResizable(true);
     //Adding the image
     //BufferedImage img=ImageIO.read(new File("G:/My Drive/Fit/2ndo semestre/Programacion/ProyectoIntegrador/final.PNG"));
     //ImageIcon icon=new ImageIcon(img);
     //imglbl.setIcon(icon);
     //imglbl.setBounds(20,20,500,300);
     //f.add(imglbl);
     
     //Adding the GUI
     IV.setBounds(40,320,150,40);
     InicialVelocity.setBounds(180,330,60,20);
     angulo.setBounds(40,350,100,40);
     angle.setBounds(180,360,60,20);
  
     
     Gravedad.setBounds(270,320,150,40);
     Gravity.setBounds(440,330,60,20);
     Friccion.setBounds(270,350,190,40);
     
     
     Aire.setBounds(570,10,100,40);
     TA.setBounds(550,50,200,40);
     AM.setBounds(550,90,200,40);
     AL.setBounds(550,130,200,40);
     calc.setBounds(640,190,90,50);
     
     Vacio.setBounds(740,10,100,40);
     TAsr.setBounds(720,50,200,40);
     AMsr.setBounds(720,90,200,40);
     ALsr.setBounds(720,130,200,40);
     
     
     
     f.add(IV);
     f.add(InicialVelocity);
     f.add(angulo);
     f.add(angle);
     
     
     
     
     
     
     f.add(Gravedad);
     f.add(Gravity);
     f.add(Friccion);
     
     f.add(Aire);
     f.add(TA);
     f.add(AM);
     f.add(AL);
     f.add(Vacio);
     f.add(TAsr);
     f.add(AMsr);
     f.add(ALsr);
     f.add(calc);
     
     
    }
    
   

}

