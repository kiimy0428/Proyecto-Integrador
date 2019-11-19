package Graficos;

import java.awt.*;
import java.awt.event.*;
import java.math.MathContext;
import javax.management.StringValueExp;
import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class VectorGraf extends JFrame implements ActionListener 
{
    String temp = "";
    String texto = "";
    float v1, v2;
    double con;
    JMenuBar contenedor;
    JMenu ver;
    JMenuItem lineal;
   
    
    JLabel lblVectorU = new JLabel("U: ");
    
    JLabel lblVectorV = new JLabel("V: ");
    JLabel lblVectori = new JLabel("i");
    JLabel lblVectorj = new JLabel("j");
    JLabel lblVectork = new JLabel("k");

    JButton btnResolver = new JButton("Resolver");

    JLabel lblMagnitudU =new JLabel("Magnitud U: ");
    JLabel lblMagnitudV =new JLabel("Magnitud V: ");
    JLabel lblUnitarioU =new JLabel("Unitario U: ");
    JLabel lblUnitarioV =new JLabel("Unitario V: ");
    JLabel lblRestaVectores =new JLabel("U - V: ");
    JLabel lblSumaVectores =new JLabel("U + V: ");
    JLabel lblProductoEscalar =new JLabel("UV: ");
    JLabel lblProductoCruz =new JLabel("UxV: ");
    JLabel lblAnguloVectores =new JLabel("Ang/vec: ");
    //Texto
    JTextField txtUi = new JTextField();
    JTextField txtUj = new JTextField();
    JTextField txtUk = new JTextField();
    JTextField txtVi = new JTextField();
    JTextField txtVj = new JTextField();
    JTextField txtVk = new JTextField();
    JTextField txtMagnitudU = new JTextField();
    JTextField txtMagnitudV = new JTextField();
    JTextField txtUnitarioU = new JTextField();
    JTextField txtUnitarioV = new JTextField();
    JTextField txtRestaVectores = new JTextField();
    JTextField txtSumaVectores= new JTextField();
    JTextField txtProductoPunto = new JTextField();
    JTextField txtProductoCruz = new JTextField();
    JTextField txtAnguloVectores = new JTextField();
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public VectorGraf(String nombre)
    {
        super(nombre);
        iniciarControles();
    }

    public void iniciarControles()
    {
        contenedor = new JMenuBar();
        ver = new JMenu("Ver");
        lineal = new JMenuItem("Lineal");
        this.setJMenuBar(contenedor);
        contenedor.add(ver);
        ver.add(lineal);
        this.getContentPane().add(lblVectorU);
        this.getContentPane().add(lblVectorV);
        this.getContentPane().add(lblVectori);
        this.getContentPane().add(lblVectorj);
        this.getContentPane().add(lblVectork);
        this.getContentPane().add(txtUi);
        this.getContentPane().add(txtVi);
        this.getContentPane().add(txtUj);
        this.getContentPane().add(txtVj);
        this.getContentPane().add(txtUk);
        this.getContentPane().add(txtVk);

        this.getContentPane().add(btnResolver);

        this.getContentPane().add(lblMagnitudU);
        this.getContentPane().add(txtMagnitudU);
        this.getContentPane().add(lblMagnitudV);
        this.getContentPane().add(txtMagnitudV);
        this.getContentPane().add(lblUnitarioU);
        this.getContentPane().add(txtUnitarioU);
        this.getContentPane().add(lblUnitarioV);
        this.getContentPane().add(txtUnitarioV);
        this.getContentPane().add(lblRestaVectores);
        this.getContentPane().add(txtRestaVectores);
        this.getContentPane().add(lblSumaVectores);
        this.getContentPane().add(txtSumaVectores);
        this.getContentPane().add(lblProductoEscalar);
        this.getContentPane().add(txtProductoPunto);
        this.getContentPane().add(lblProductoCruz);
        this.getContentPane().add(txtProductoCruz);
        this.getContentPane().add(lblAnguloVectores);
        this.getContentPane().add(txtAnguloVectores);

        //Agragar eventos
        btnResolver.addActionListener(this);
        lineal.addActionListener(this);
        this.setBounds(500,5,370,725);
        this.setResizable(isMaximumSizeSet());//Desactiva la opcion maximizar
        this.getContentPane().setBackground(new java.awt.Color(255, 175, 175));//Color.LIGHT_PINK
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main()
    {
        VectorGraf v=new VectorGraf("Calculadora");
        v.GUI();
    }

    //Inicializar los Implements ActionListener para los eventos
    public void actionPerformed(ActionEvent e)
    {
        txtUi.setFocusable(isFocusable());
        if (e.getSource()==btnResolver)
        {
            double magnitudU, magnitudV, unitarioU, unitarioV;
            double  escalar, cruz, aVec, a1, a2; 
            float d = 0;
            float ui = Float.parseFloat(txtUi.getText());
            float uj = Float.parseFloat(txtUj.getText());
            float uk = Float.parseFloat(txtUk.getText());
            float vi = Float.parseFloat(txtVi.getText());
            float vj = Float.parseFloat(txtVj.getText());
            float vk = Float.parseFloat(txtVk.getText());

            //Sacar magnitud del vector U
            magnitudU = Math.sqrt(Math.pow(ui,2) + Math.pow(uj,2) + Math.pow(uk,2));
            this.txtMagnitudU.setText(String.format("%.2f" , magnitudU));

            //Sacar magnitud del vector V
            magnitudV = Math.sqrt(Math.pow(vi,2) + Math.pow(vj,2) + Math.pow(vk,2));
            this.txtMagnitudV.setText(String.format("%.2f", magnitudV));

            //Suma de vectores
            float i = ui + vi;
            float j = uj + vj;
            float k = uk + vk;
            this.txtSumaVectores.setText(String.valueOf(i+ "i + " + j + "j + " + k + "k"));

            //Resta de vectores
            float i2 = ui - vi;
            float j2 = uj - vj;
            float k2 = uk - vk;
            this.txtRestaVectores.setText(String.valueOf(i2+ "i + " + j2 + "j + " + k2 + "k"));

            //Magnitud de U
            double vui = (ui/magnitudU);
            double vuj = (uj/magnitudU);
            double vuk = (uk/magnitudU);
            String vui2=String.format("%.2f",vui);
            String vuj2=String.format("%.2f",vuj);
            String vuk2=String.format("%.2f",vuk);
            this.txtUnitarioU.setText(String.valueOf(vui2+ "i + " + vuj2 + "j + " + vuk2 + "k"));

            //Magnitud de V
            double vvi = (vi/magnitudV);
            double vvj = (vj/magnitudV);
            double vvk = (vk/magnitudV);
            String vvi2=String.format("%.2f",vvi);
            String vvj2=String.format("%.2f",vvj);
            String vvk2=String.format("%.2f",vvk);
            this.txtUnitarioV.setText(String.valueOf(vvi2+ "i + " + vvj2 + "j + " + vvk2 + "k"));

            //Angulo entre vectores
            escalar = ((ui*vi)+(uj*vj)+(uk*vk));
            a1 = Math.sqrt(Math.pow(ui,2)+Math.pow(uj,2)+Math.pow(uk,2));
            a2 = Math.sqrt(Math.pow(vi,2)+Math.pow(vj,2)+Math.pow(vk,2));
            aVec = Math.acos(escalar/(a1*a2));
            String aVec2=String.format("%.2f",aVec);
            double agrados = (aVec*57.296);
            String agrados2=String.format("%.2f",agrados);
            this.txtAnguloVectores.setText(String.valueOf(aVec2 + " radianes o " + agrados2 + "°"));

            //Producto Punto (escalar)
            this.txtProductoPunto.setText(String.valueOf(escalar));

            //Producto Cruz (vectorial)
            double prodCruzI =(uj*vk)-(uk*vj);
            double prodCruzJ =(ui*vk)-(vi*uk);
            double prodCruzK =(ui*vj) - (vi*uj);
            this.txtProductoCruz.setText(String.valueOf(prodCruzI + "i + " + prodCruzJ + "j +" + prodCruzK + "k"));
        }
    }   

    public void GUI(){
        lblVectorU.setBounds(30,40,80,35);
        lblVectorV.setBounds(30,95,80,35);
        lblVectori.setBounds(80,10,55,35);
        lblVectorj.setBounds(180,10,55,35);
        lblVectork.setBounds(280,10,55,35);
        txtUi.setBounds(60,40,45,35);
        txtVi.setBounds(60,95,45,35);
        txtUj.setBounds(160,40,45,35);
        txtVj.setBounds(160,95,45,35);
        txtUk.setBounds(260,40,45,35);
        txtVk.setBounds(260,95,45,35);

        btnResolver.setBounds(130,150,100,35); //Posición del botón
        //btnResolver.setBackground(new java.awt.Color(190, 192, 140));//Cambia color del boton
        btnResolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        lblMagnitudU.setBounds(30,205,80,35);
        txtMagnitudU.setBounds(105,205,170,35);
        lblMagnitudV.setBounds(30,255,80,35);
        txtMagnitudV.setBounds(105,255,170,35);
        lblUnitarioU.setBounds(30,305,80,35);
        txtUnitarioU.setBounds(105,305,170,35);
        lblUnitarioV.setBounds(30,355,80,35);
        txtUnitarioV.setBounds(105,355,170,35);
        lblRestaVectores.setBounds(30,405,80,35);
        txtRestaVectores.setBounds(105,405,170,35);
        lblSumaVectores.setBounds(30,455,80,35);
        txtSumaVectores.setBounds(105,455,170,35);
        lblProductoEscalar.setBounds(30,505,80,35);
        txtProductoPunto.setBounds(105,505,170,35);
        lblProductoCruz.setBounds(30,555,80,35);
        txtProductoCruz.setBounds(105,555,170,35);
        lblAnguloVectores.setBounds(30,605,80,35);
        txtAnguloVectores.setBounds(105,605,170,35);
    }
}
