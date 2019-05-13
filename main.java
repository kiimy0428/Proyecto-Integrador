import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main extends JFrame implements ActionListener
{
    
    public main() throws IOException{
        GUI.gui();
        GUI.calc.addActionListener(this);
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        try{
        GUI.AL.setText("Alcance: ");
        GUI.TA.setText("Tiempo en el aire: ");
        GUI.AM.setText("Altura Maxima: ");
        GUI.ALsr.setText("Alcance: ");
        GUI.TAsr.setText("Tiempo en el aire: ");
        GUI.AMsr.setText("Altura Maxima: ");
        
        
        double v0, a0, m, g, t, v0y, v0x, ymax, A, k, Asa, tsa, ymaxsa;
        
        v0 = Double.parseDouble(GUI.InicialVelocity.getText());
        a0 = Double.parseDouble(GUI.angle.getText());
        g = Double.parseDouble(GUI.Gravity.getText());
        
        
        v0y = v0*Math.sin(Math.toRadians(a0));
        v0x = v0*Math.cos(Math.toRadians(a0));
        
        //Formulas sin rozamiento
        Asa = (Math.pow(v0,2)*Math.sin(2*Math.toRadians(a0)))/g;
        tsa = (2*v0) * (Math.sin(Math.toRadians(a0)))/ g;
        ymaxsa = Math.pow(v0y,2) / (2*g);
        
        k = (2*0.01)/(3*v0x);
        
        //Formulas con rozamiento
        A = (-1+Math.sqrt(1-4*(k)*(-Asa)))/(2*(k));
        t = (-1/0.01)*Math.log(1-(A*0.01/v0x));
        ymax = (v0y/0.01)-(g/Math.pow(0.01,2))*Math.log(1+(0.01*v0y/g));
        
        
        //Salida del rozamiento
        GUI.AL.setText(GUI.AL.getText().concat(String.format("%.2f",A) + " m "));
        GUI.TA.setText(GUI.TA.getText().concat(String.format("%.2f",t) + " s "));
        GUI.AM.setText(GUI.AM.getText().concat(String.format("%.2f",ymax) + " m "));
        
        //Salida del vacio
        GUI.ALsr.setText(GUI.ALsr.getText().concat(String.format("%.2f",Asa) + " m "));
        GUI.TAsr.setText(GUI.TAsr.getText().concat(String.format("%.2f",tsa) + " s "));
        GUI.AMsr.setText(GUI.AMsr.getText().concat(String.format("%.2f",ymaxsa) + " m "));
      }
      catch(Exception Nan){
          JOptionPane.showMessageDialog(null,"Error, valor introducido incorrecto " + Nan);  
        }
        }
    
    public static void main(String args[]) throws IOException{
        main proyectoIntegrador2 = new main();
    }
}