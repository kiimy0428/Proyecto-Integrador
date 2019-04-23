/**
 * Write a description of class ss here.
 *
 * @Celine Diaz, Kimberly Garcia
 * @1.0
 * Calculadora: cientifica, estandar, biblica, del indice de masa corporal y de la formula cuadrática.
 * Usos de matemáticas discretas en el programa: en if (condicional), or en linea 661, "and" (y) en la parte del BMI, not en la fracción al negar que la parte de abajo sea igual a 0. 
 */
import java.math.MathContext;
import java.awt.*;
import java.awt.event.*;
import javax.management.StringValueExp;
import javax.swing.*;
public class Calc extends JFrame implements ActionListener
{
    private JLabel lblMonedas, lblLineales, lblCapacidades, lblPeso, lblAltura, lblBMI, lblA, lblB, lblC,lblEC, lblED;
    //private JTextField txtAltura, txtPeso;
    String temp = "";
    String texto = "";
    float v1, v2,v3;
    double BMI;
    double abajo,disc,x1,x2;
    double con;
    int opcion;
    JMenuBar contenedor;
    JMenu ver, edicion, ayuda;
    JRadioButtonMenuItem radianes, centimetros;
    JMenuItem estandar, cientifica, programador, biblica, IMC, FormC;
    JMenuItem copiar, pegar, historial, ver_ayuda, acerca_de;
    JButton btnGsm = new JButton("Gsm");
    JButton btnExp = new JButton("Exp");
    JButton btnSin = new JButton("Sin");
    JButton btnln = new JButton("ln");
    JButton btnPow = new JButton("x^y");
    JButton btnLog= new JButton("Log");
    JButton btnCos = new JButton("Cos");
    JButton btnCub = new JButton("x^3");
    JButton btnFact = new JButton("n!");
    JButton btnTan = new JButton("Tan");
    JButton btnCua = new JButton("x^2");
    JButton btnFra = new JButton("1/x");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnDiv = new JButton("/");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btnMul = new JButton("*");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btnRes = new JButton("-");
    JButton btn0 = new JButton("0");
    JButton btnSig = new JButton("+/-");
    JButton btnComa = new JButton(",");
    JButton btnSum = new JButton("+");
    JButton btnIgual = new JButton("=");
    JButton btnRetro = new JButton("Retroceso");
    JButton btnCE = new JButton("CE");
    JButton btnC = new JButton("C");
    JButton btnSqr = new JButton("√");
    JButton btnPerc = new JButton("%");
    JButton btnPunto = new JButton(".");
    //monedas
    JButton btnTal = new JButton("Talento");
    JButton btnLibPla = new JButton("Libra de plata");
    JButton btnSiclo = new JButton("Siclo");
    JButton btnDen = new JButton("Denario");
    JButton btnDrac = new JButton("Dracma");
    JButton btnBla = new JButton("Blanca");
    //lineales
    JButton btnCodo = new JButton("Codo");
    JButton btnBra = new JButton("Braza");
    JButton btnEst = new JButton("Estadio");
    JButton btnMil = new JButton("Milla");
    JButton btnCam = new JButton("Camino de un día de reposo");
    //capacidad
    JButton btnAl = new JButton("Almud");
    JButton btnMSato = new JButton("Sato");
    JButton btnBar = new JButton("Barril");
    JButton btnKor = new JButton("Koro");
    JButton btnCant = new JButton("Cántaro");

    //IMC
    JButton btnIMC = new JButton("IMC");
    //EQ CUADRATICA
    JButton btnEC = new JButton("Resultado");
    JTextField txtValor = new JTextField();
    JTextField txtPeso = new JTextField();
    JTextField txtAltura = new JTextField();
    JTextField txtA = new JTextField();
    JTextField txtB = new JTextField();
    JTextField txtC = new JTextField();
    public Calc(String nombre) {
        super(nombre);
        iniciarControles();
        System.out.print("\u000c");

    }

    public void iniciarControles()
    {
        //menu ver
        contenedor = new JMenuBar();
        ver= new JMenu("Ver");
        edicion = new JMenu("Edición");
        ayuda = new JMenu("Ayuda");

        // crear los items del menu
        estandar = new JMenuItem("Estándar");
        cientifica = new JMenuItem("Cientifica");
        biblica = new JMenuItem("Biblica");
        IMC= new JMenuItem("IMC");
        FormC= new JMenuItem("Formula Cuadrática");
        copiar = new JMenuItem("Copiar");
        pegar= new JMenuItem("Pegar");
        historial= new JMenuItem("Historial");
        ver_ayuda= new JMenuItem("Ver ayuda");
        acerca_de= new JMenuItem("Acerca de");
        // agregar los menus y submenus a la barra del menu
        this.setJMenuBar(contenedor);
        contenedor.add(edicion);
        contenedor.add(ayuda);
        contenedor.add(ver);
        ver.add(estandar);
        ver.add(cientifica);
        ver.add(biblica);
        ver.add(IMC);
        ver.add(FormC);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.add(historial);
        ayuda.add(ver_ayuda);
        ayuda.add(acerca_de);
        //Crear botones de radio

        radianes = new JRadioButtonMenuItem("Radianes");
        centimetros = new JRadioButtonMenuItem("Centimetros");
        radianes.setBounds(50,100,85,45);
        radianes.setBackground(Color.GRAY);
        centimetros.setBounds(140,100,90,45);
        centimetros.setBackground(Color.GRAY);
        lblMonedas= new JLabel("Monedas: ");
        lblLineales= new JLabel("Lineales: ");
        lblCapacidades= new JLabel("Capacidades: ");
        lblPeso= new JLabel("Peso: ");
        lblAltura= new JLabel("Altura: ");
        lblBMI= new JLabel("Diagnostico: ");
        lblEC= new JLabel("x1: ");
        lblED= new JLabel("x2: ");
        lblA= new JLabel("a: ");
        lblB= new JLabel("b: ");
        lblC= new JLabel("c: ");
            
        txtValor.setBounds(50,50,405,35);
        btnGsm.setBounds(50,150,60,25);
        btnExp.setBounds(115,150,60,25);
        btnSin.setBounds(180,150,60,25);
        btnln.setBounds(50,180,60,25);
        btnPow.setBounds(115,180,60,25);
        btnLog.setBounds(180,180,60,25);
        btnCos.setBounds(50,210,60,25);
        btnCub.setBounds(115,210,60,25);
        btnFact.setBounds(180,210,60,25);
        btnTan.setBounds(50,240,60,25);
        btnCua.setBounds(115,240,60,25);
        btnFra.setBounds(180,240,60,25);
        //boton para retroceso
        btnRetro.setBounds(260,95,93,25);
        btnCE.setBounds(365,95,50,25);
        btnC.setBounds(409,95,44,25);
        //
        btn7.setBounds(260,125,45,25);
        btn8.setBounds(310,125,45,25);
        btn9.setBounds(360,125,45,25);

        btnDiv.setBounds(410,125,45,25);

        btn4.setBounds(260,155,45,25); //17
        btn5.setBounds(310,155,45,25);
        btn6.setBounds(360,155,45,25);

        btnMul.setBounds(410,155,45,25);

        btn1.setBounds(260,185,45,25); 
        btn2.setBounds(310,185,45,25);
        btn3.setBounds(360,185,45,25);

        btnRes.setBounds(410,185,45,25);

        btn0.setBounds(260,215,45,25);
        btnSig.setBounds(305,215,55,25);
        btnComa.setBounds(360,215,45,25);
        btnSum.setBounds(410,215,45,25);
        btnIgual.setBounds(410, 245,42,25);


        this.getContentPane().add(txtValor);
        this.getContentPane().add(radianes);
        this.getContentPane().add(centimetros);
        this.getContentPane().add(btnGsm);
        this.getContentPane().add(btnExp);
        this.getContentPane().add(btnSin);
        this.getContentPane().add(btnln);
        this.getContentPane().add(btnPow);
        this.getContentPane().add(btnLog);
        this.getContentPane().add(btnCos);
        this.getContentPane().add(btnCub);
        this.getContentPane().add(btnFact);
        this.getContentPane().add(btnTan);
        this.getContentPane().add(btnCua);
        this.getContentPane().add(btnFra);
        this.getContentPane().add(btn7);
        this.getContentPane().add(btn8);
        this.getContentPane().add(btn9);
        this.getContentPane().add(btnDiv);
        this.getContentPane().add(btn4);
        this.getContentPane().add(btn5);
        this.getContentPane().add(btn6);
        this.getContentPane().add(btnMul);
        this.getContentPane().add(btn1);
        this.getContentPane().add(btn2);
        this.getContentPane().add(btn3);
        this.getContentPane().add(btnRes);
        this.getContentPane().add(btn0);
        this.getContentPane().add(btnSig);
        this.getContentPane().add(btnComa);
        this.getContentPane().add(btnSum);
        this.getContentPane().add(btnIgual);
        this.getContentPane().add(btnRetro);
        this.getContentPane().add(btnCE);
        this.getContentPane().add(btnC);
        this.getContentPane().add(btnSqr);
        this.getContentPane().add(btnPerc);
        this.getContentPane().add(btnPunto);
        this.getContentPane().add(btnTal);
        this.getContentPane().add(btnLibPla);
        this.getContentPane().add(btnSiclo);
        this.getContentPane().add(btnDen);
        this.getContentPane().add(btnDrac);
        this.getContentPane().add(btnBla);
        this.getContentPane().add(btnCodo);
        this.getContentPane().add(btnBra);
        this.getContentPane().add(btnEst);
        this.getContentPane().add(btnMil);
        this.getContentPane().add(btnCam );
        this.getContentPane().add(btnAl);
        this.getContentPane().add(btnMSato);
        this.getContentPane().add(btnBar);
        this.getContentPane().add(btnKor);
        this.getContentPane().add(btnCant);
        this.getContentPane().add(btnIMC);
        this.getContentPane().add(btnEC);
        this.getContentPane().add(txtPeso);
        this.getContentPane().add(txtAltura);
        this.getContentPane().add(txtA);
        this.getContentPane().add(txtB);
        this.getContentPane().add(txtC);
        btnGsm.addActionListener(this);
        btnExp.addActionListener(this);
        btnSin.addActionListener(this);
        btnln.addActionListener(this);
        btnPow.addActionListener(this);
        btnLog.addActionListener(this);
        btnCos.addActionListener(this);
        btnCub.addActionListener(this);
        btnFact.addActionListener(this);
        btnTan.addActionListener(this);
        btnCua.addActionListener(this);
        btnFra.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDiv.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnMul.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btnRes.addActionListener(this);
        btn0.addActionListener(this);
        btnSig.addActionListener(this);
        btnComa.addActionListener(this);
        btnSum.addActionListener(this);
        btnIgual.addActionListener(this);
        btnRetro.addActionListener(this);
        btnCE.addActionListener(this);
        btnC.addActionListener(this);
        btnSqr.addActionListener(this);
        btnPerc.addActionListener(this);
        btnPunto.addActionListener(this);

        btnTal.addActionListener(this);
        btnLibPla.addActionListener(this);
        btnSiclo.addActionListener(this);
        btnDen.addActionListener(this);
        btnDrac.addActionListener(this);
        btnBla.addActionListener(this);

        btnCodo.addActionListener(this);
        btnBra.addActionListener(this);
        btnEst.addActionListener(this);
        btnMil.addActionListener(this);
        btnCam.addActionListener(this);

        btnAl.addActionListener(this);
        btnMSato.addActionListener(this);
        btnBar.addActionListener(this);
        btnKor.addActionListener(this);
        btnCant.addActionListener(this);

        btnIMC.addActionListener(this);
        btnEC.addActionListener(this);
        // eventos para los 
        cientifica.addActionListener(this);
        //biblica.addActionListener(this);
        estandar.addActionListener(this);
        biblica.addActionListener(this);
        IMC.addActionListener(this);
        FormC.addActionListener(this);
        copiar.addActionListener(this);
        pegar.addActionListener(this);
        this.setBounds(500,100,475,335);
        this.setResizable(isMaximumSizeSet()); //desactivar la 0opcion maximizar
        this.getContentPane().setBackground(Color.GRAY);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(){
        new Calc("Calculadora");

    }

    // inicializar los implements action listener para los eventos
    public void actionPerformed(ActionEvent e){
        txtValor.setFocusable(isFocusable()); //desactivar el cursor al capturar un valor
        if (e.getSource()==Calc.this.btnln) {
            v1=Float.parseFloat(txtValor.getText());
            txtValor.setText("");
            txtValor.setText(String.valueOf(Math.log(v1)));
            v2=0;   
        }
        if (e.getSource()==Calc.this.btnSin) {
            v1=Float.parseFloat(txtValor.getText());
            con = (v1 * Math.PI)/180; // de rad a sexagesimal
            txtValor.setText("");
            txtValor.setText(String.valueOf(Math.sin(con)));
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnPow) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 2;
            txtValor.setText("");
            txtValor.setText(String.valueOf(Math.pow(v1,v2)));
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnLog) {
            v1=Float.parseFloat(txtValor.getText());
            txtValor.setText("");
            txtValor.setText(String.valueOf(Math.log10(v1)));
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnCos) {
            v1=Float.parseFloat(txtValor.getText());
            con = (v1 * Math.PI)/180;
            txtValor.setText("");
            txtValor.setText(String.valueOf(Math.cos(con)));
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnCub) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 3;
            txtValor.setText("");
            txtValor.setText(String.valueOf(Math.pow(v1,v2)));
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnFact) {
            int i;
            double fact=1;
            v1=Float.parseFloat(txtValor.getText());
            txtValor.setText("");
            for(i=1;i<v1;i++){
                fact = fact*i;

            }
            txtValor.setText(String.valueOf(fact));
        }

        if (e.getSource()==Calc.this.btnTan) {
            v1=Float.parseFloat(txtValor.getText());
            con = (v1 * Math.PI)/180;
            txtValor.setText("");
            txtValor.setText(String.valueOf(Math.tan(con)));
            v1=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnCua) {
            v1=Float.parseFloat(txtValor.getText());
            txtValor.setText("");
            txtValor.setText(String.valueOf(Math.pow(v1,2)));
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnFra) {
            v1=Float.parseFloat(txtValor.getText());
            txtValor.setText("");
            if(v1 != 0){
                txtValor.setText(String.valueOf(1/v1));
            }
            else{
                txtValor.setText("Error");
            }
         if (e.getSource()==Calc.this.btn7) {
                if(txtValor.getText()==""){
                    btn7.setText(btn7.getText());
                    temp=btn7.getText();
                }
                else{
                    txtValor.setText(temp+btn7.getText());
                    temp+=btn7.getText();
                }
            }
            if (e.getSource()==Calc.this.btn8) {
                if(txtValor.getText()==""){
                    btn8.setText(btn8.getText());
                    temp=btn8.getText();
                }
                else{
                    txtValor.setText(temp+btn8.getText());
                    temp+=btn8.getText();
                }
            }
            if (e.getSource()==Calc.this.btn9) {
                if(txtValor.getText()==""){
                    btn9.setText(btn9.getText());
                    temp=btn9.getText();
                }
                else{
                    txtValor.setText(temp+btn9.getText());
                    temp+=btn9.getText();
                }
            }
            if (e.getSource()==Calc.this.btn4) {
                if(txtValor.getText()==""){
                    btn4.setText(btn4.getText());
                    temp=btn4.getText();
                }
                else{
                    txtValor.setText(temp+btn4.getText());
                    temp+=btn4.getText();
                }
            }
            if (e.getSource()==Calc.this.btn5) {
                if(txtValor.getText()==""){
                    btn5.setText(btn5.getText());
                    temp=btn5.getText();
                }
                else{
                    txtValor.setText(temp+btn5.getText());
                    temp+=btn5.getText();
                }
            }
            if (e.getSource()==Calc.this.btn6) {
                if(txtValor.getText()==""){
                    btn6.setText(btn6.getText());
                    temp=btn6.getText();
                }
                else{
                    txtValor.setText(temp+btn6.getText());
                    temp+=btn6.getText();
                }
            }
            if (e.getSource()==Calc.this.btn1) {
                if(txtValor.getText()==""){
                    btn1.setText(btn1.getText());
                    temp=btn1.getText();
                }
                else{
                    txtValor.setText(temp+btn1.getText());
                    temp+=btn1.getText();
                }
            }
            if (e.getSource()==Calc.this.btn2) {
                if(txtValor.getText()==""){
                    btn2.setText(btn2.getText());
                    temp=btn2.getText();
                }
                else{
                    txtValor.setText(temp+btn2.getText());
                    temp+=btn2.getText();
                }
            }
            if (e.getSource()==Calc.this.btn3) {
                if(txtValor.getText()==""){
                    btn3.setText(btn3.getText());
                    temp=btn3.getText();
                }
                else{
                    txtValor.setText(temp+btn3.getText());
                    temp+=btn3.getText();
                }
            }

        }
        if (e.getSource()==Calc.this.btn7) {
            if(txtValor.getText()==""){
                btn7.setText(btn7.getText());
                temp=btn7.getText();
            }
            else{
                txtValor.setText(temp+btn7.getText());
                temp+=btn7.getText();
            }
        }
        if (e.getSource()==Calc.this.btn8) {
            if(txtValor.getText()==""){
                btn8.setText(btn8.getText());
                temp=btn8.getText();
            }
            else{
                txtValor.setText(temp+btn8.getText());
                temp+=btn8.getText();
            }
        }
        if (e.getSource()==Calc.this.btn9) {
            if(txtValor.getText()==""){
                btn9.setText(btn9.getText());
                temp=btn9.getText();
            }
            else{
                txtValor.setText(temp+btn9.getText());
                temp+=btn9.getText();
            }
        }
        if (e.getSource()==Calc.this.btn6) {
            if(txtValor.getText()==""){
                btn6.setText(btn6.getText());
                temp=btn6.getText();
            }
            else{
                txtValor.setText(temp+btn6.getText());
                temp+=btn6.getText();
            }
        }
        if (e.getSource()==Calc.this.btn5) {
            if(txtValor.getText()==""){
                btn5.setText(btn5.getText());
                temp=btn5.getText();
            }
            else{
                txtValor.setText(temp+btn5.getText());
                temp+=btn5.getText();
            }
        }
        if (e.getSource()==Calc.this.btn4) {
            if(txtValor.getText()==""){
                btn4.setText(btn4.getText());
                temp=btn4.getText();
            }
            else{
                txtValor.setText(temp+btn4.getText());
                temp+=btn4.getText();
            }
        }
        if (e.getSource()==Calc.this.btn1) {
            if(txtValor.getText()==""){
                btn1.setText(btn1.getText());
                temp=btn1.getText();
            }
            else{
                txtValor.setText(temp+btn1.getText());
                temp+=btn1.getText();
            }
        }
        if (e.getSource()==Calc.this.btn2) {
            if(txtValor.getText()==""){
                btn2.setText(btn2.getText());
                temp=btn2.getText();
            }
            else{
                txtValor.setText(temp+btn2.getText());
                temp+=btn2.getText();
            }
        }
        if (e.getSource()==Calc.this.btn3) {
            if(txtValor.getText()==""){
                btn3.setText(btn3.getText());
                temp=btn3.getText();
            }
            else{
                txtValor.setText(temp+btn3.getText());
                temp+=btn3.getText();
            }
        }

        if (e.getSource()==Calc.this.btn0) {
            if(txtValor.getText()==""){
                btn0.setText(btn0.getText());
                temp=btn0.getText();
            }
            else{
                txtValor.setText(temp+btn0.getText());
                temp+=btn0.getText();
            }
        }
        if (e.getSource()==Calc.this.btnSig) {
            float temp6;
            temp6=-Float.valueOf(txtValor.getText());
            txtValor.setText(String.valueOf(temp6));
        }
        if (e.getSource()==Calc.this.btnRetro) {
            int i;
            String temp2="";
            for(i =0; i < txtValor.getText().length()-1; i++){
                temp2=temp2+txtValor.getText().charAt(i);
            }
            txtValor.setText(temp2);
            temp=temp2;
        }
        if (e.getSource()==Calc.this.btnSum) {
            v1=Float.parseFloat(txtValor.getText());
            temp="";
            txtValor.setText("");
            opcion=1;
        }
        if (e.getSource()==Calc.this.btnRes) {
            v1=Float.parseFloat(txtValor.getText());
            temp="";
            txtValor.setText("");
            opcion=2;
        }
        if (e.getSource()==Calc.this.btnMul) {
            v1=Float.parseFloat(txtValor.getText());
            temp="";
            txtValor.setText("");
            opcion=3;
        }
        if (e.getSource()==Calc.this.btnDiv) {
            v1=Float.parseFloat(txtValor.getText());
            temp="";
            txtValor.setText("");
            opcion=4;
        }
        if (e.getSource()==Calc.this.btnSqr) {
            v1=Float.parseFloat(txtValor.getText());
            txtValor.setText(String.valueOf(Math.sqrt(v1)));
            v1=0;
        }
        if (e.getSource()==Calc.this.btnPunto) {
            temp=txtValor.getText();
            txtValor.setText(temp+".");
            temp+=txtValor.getText();
        }
        if (e.getSource()==ver_ayuda || e.getSource()==acerca_de) {
            JOptionPane.showMessageDialog(null,"Proyecto integrador"+"\n"+"Ingenieria en sistemas computacionales"+"\n"+"Derechos reservados."+"\n"+"Agosto-Diciembre 2018");
        }
        if(e.getSource()==copiar){
            txtValor.copy();
        }
        if(e.getSource()==pegar){
            txtValor.paste();
        }
        if (e.getSource()==Calc.this.btnIgual) {
            v2=Float.parseFloat(txtValor.getText());
            switch(opcion){
                case 1: 
                txtValor.setText("");
                txtValor.setText(String.valueOf(v1+v2));
                break;
                case 2: 
                txtValor.setText("");
                txtValor.setText(String.valueOf(v1-v2));
                break;
                case 3: 
                txtValor.setText("");
                txtValor.setText(String.valueOf(v1*v2));
                break;
                case 4: 
                if(v2!=0){
                    txtValor.setText("");
                    txtValor.setText(String.valueOf(v1/v2));
                }
                else {txtValor.setText("error");}
                break;
                case 5: 
                txtValor.setText("");
                txtValor.setText(String.valueOf(Math.pow(v1,v2)));
                break;
                default: 
                txtValor.setText("Valor incorrecto ");
            }
        }

        if(e.getSource()==Calc.this.btnCE){
            txtValor.setText("0");
            temp="";
            v1=0;
            v2=0;
            opcion=0;
            con=0;
        }
        if(e.getSource()==Calc.this.btnC){
            txtValor.setText("0");
            temp="";
            v1=0;
            v2=0;
            opcion=0;
            con=0;
        }
        if (e.getSource()==Calc.this.btnLibPla) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 360;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" grs. de plata");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnSiclo) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 144;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2/10)+" grs. de plata");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnDen) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 4;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" grs. de plata");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnDrac) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 36;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2/10)+" grs. de plata");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnBla) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 4;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2/128)+" grs. de plata"); //1/128 de denario
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnTal) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 12600;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" grs. de plata");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnCodo) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 45;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+"cm");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnBra) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 18;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2/10)+"m");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnEst) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 180;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+"m");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnMil) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 1480;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" m");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnCam) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 1080;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+"m");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnAl) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 875;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2/100)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnMSato) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 13;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnBar) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 37;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnKor) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 370;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnCant) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 40;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnIMC) {
            v1=Float.parseFloat(txtPeso.getText());
            v2=Float.parseFloat(txtAltura.getText());
            BMI= v1/(v2*v2);
            if(BMI<16){
                lblBMI.setText("Diagnóstico: Criterio de ingreso en hospital. BMI"+BMI);
            }
            else if(BMI>=16 && BMI<17){
                lblBMI.setText("Diagnóstico: Infrapeso. BMI: "+BMI);
            }
            else if(BMI>=17 && BMI<18){
                lblBMI.setText("Diagnóstico: Bajo peso. BMI: "+BMI);
            }
            else if(BMI>=18 && BMI<25){
                lblBMI.setText("Diagnóstico: Peso saludable. BMI: "+BMI);
            }
            else if(BMI>=25 && BMI<30){
                lblBMI.setText("Diagnóstico: Sobrepeso. BMI: "+BMI);
            }
            else if(BMI>=30 && BMI<35){
                lblBMI.setText("Diagnóstico: Sobrepeso crónico. BMI: "+BMI);
            }
            else if(BMI>=35 && BMI<=40){
                lblBMI.setText("Diagnóstico: Obesidad premórbida. BMI: "+BMI);
            }
            else if(BMI>40){
                lblBMI.setText("Diagnóstico: Obesidad mórbida. BMI: "+BMI);
            }
            v2=0;   
            con=0;
        }
        if (e.getSource()==Calc.this.btnEC) {
        v1=Float.parseFloat(txtA.getText());
        v2=Float.parseFloat(txtB.getText());
        v3=Float.parseFloat(txtC.getText());
        abajo =(2*v1);
        disc=Math.pow(v2,2)-(4*(v1*v3));
        x1= (-v2)+(Math.sqrt(disc))/abajo;
        x2= (-v2)-(Math.sqrt(disc))/abajo;
        if(disc<0){ 
            lblEC.setText("x1 :"+ -v2 +"+√"+ -disc+"i/"+abajo);
            lblED.setText("x2 :"+ -v2 +"+√"+ -disc+"i/"+abajo);
        }
        else if(disc == 0){ 
            lblEC.setText("dos soluciones reales iguales");
            lblED.setText("x: " + -v2/abajo);
        }
        else{
            lblEC.setText("x1: "+x1);
            lblED.setText("x2: "+ x2);
        }
        
        
        }
        if(e.getSource()==estandar){
            this.setBounds(500,100,300,300);
            txtValor.setVisible(true);
            btnGsm.setVisible(false);
            btnExp.setVisible(false);
            btnln.setVisible(false);
            btnSin.setVisible(false);
            btnPow.setVisible(false);
            btnLog.setVisible(false);
            btnCos.setVisible(false);
            btnCub.setVisible(false);
            btnFact.setVisible(false);
            btnTan.setVisible(false);
            btnComa.setVisible(false);
            btnCua.setVisible(false);
            centimetros.setVisible(false);
            radianes.setVisible(false);
            lblMonedas.setVisible(false);
            lblLineales.setVisible(false);
            lblCapacidades.setVisible(false);
            btnTal.setVisible(false);
            btnLibPla.setVisible(false);
            btnSiclo .setVisible(false);
            btnDen.setVisible(false);
            btnDrac.setVisible(false);
            btnBla.setVisible(false);
            btnCodo.setVisible(false);
            btnBra.setVisible(false);
            btnEst.setVisible(false);
            btnMil.setVisible(false);
            btnCam .setVisible(false);
            btnAl.setVisible(false);
            btnMSato.setVisible(false);
            btnBar.setVisible(false);
            btnKor.setVisible(false);
            btnCant.setVisible(false);
            btnFra.setVisible(true);
            btnSqr.setVisible(true);
            btnPerc.setVisible(true);
            btnSum.setVisible(true);
            btnDiv.setVisible(true);
            btnRes.setVisible(true);
            btnMul.setVisible(true);
            txtAltura.setVisible(false);
            txtPeso.setVisible(false);
            btnIMC.setVisible(false);
            lblBMI.setVisible(false);
            lblEC.setVisible(false);
            lblED.setVisible(false);
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
            btn5.setVisible(true);
            btn6.setVisible(true);
            btn7.setVisible(true);
            btn8.setVisible(true);
            btn9.setVisible(true);
            btn0.setVisible(true);
            lblPeso.setVisible(false);
            lblAltura.setVisible(false);
            btnIgual.setVisible(true);
            btnCE.setVisible(true);
            btnC.setVisible(true);
            lblA.setVisible(false);
            lblB.setVisible(false);
            lblC.setVisible(false);
            txtA.setVisible(false);
            txtB.setVisible(false);
            txtC.setVisible(false);
            btnEC.setVisible(false);
            txtValor.setBounds(10,50,260,35);
            btnRetro.setBounds(10,90,50,25);
            btnCE.setBounds(110,90,50,25);
            btnC.setBounds(160,90,50,25);
            btnSig.setBounds(220,90,50,25);
            btn7.setBounds(10,120,45,25);
            btn8.setBounds(60,120,45,25);
            btn9.setBounds(110,120,48,25);
            btnDiv.setBounds(165,120,50,25);
            btnPerc.setBounds(220,120,50,25);
            btn4.setBounds(10,150,45,25);
            btn5.setBounds(60,150,45,25);
            btn6.setBounds(110,150,48,25);
            btnMul.setBounds(165,150,50,25);
            btnFra.setBounds(110,210,52,25);
            btn1.setBounds(10,180,45,25);
            btn2.setBounds(60,180,45,25);
            btn3.setBounds(110,180,48,25);
            btnRes.setBounds(165,180,50,25);
            btnSqr.setBounds(220,180,52,25);
            btn0.setBounds(10,210,95,25);
            btnPunto.setBounds(110,210,50,25);
            btnSum.setBounds(165,210,50,25);
            btnIgual.setBounds(220,210,52,25);
        }
        else if(e.getSource()==cientifica){
            txtValor.setVisible(true);
            btnGsm.setVisible(true);
            btnExp.setVisible(true);
            btnln.setVisible(true);
            btnSin.setVisible(true);
            btnPow.setVisible(true);
            btnLog.setVisible(true);
            btnCos.setVisible(true);
            btnCub.setVisible(true);
            btnFact.setVisible(true);
            btnTan.setVisible(true);
            btnComa.setVisible(true);
            btnFra.setVisible(true); //
            btnCua.setVisible(true);
            btnDiv.setVisible(true);
            btnMul.setVisible(true);
            btnRes.setVisible(true);
            btnSum.setVisible(true);
            btnTal.setVisible(false);
            btnLibPla.setVisible(false);
            btnSiclo .setVisible(false);
            btnDen.setVisible(false);
            btnDrac.setVisible(false);
            btnBla.setVisible(false);
            btnCodo.setVisible(false);
            btnBra.setVisible(false);
            btnEst.setVisible(false);
            btnMil.setVisible(false);
            btnCam .setVisible(false);
            btnAl.setVisible(false);
            btnMSato.setVisible(false);
            btnBar.setVisible(false);
            btnKor.setVisible(false);
            btnCant.setVisible(false);
            btnSqr.setVisible(false);
            btnPerc.setVisible(false);
            lblMonedas.setVisible(false);
            lblLineales.setVisible(false);
            lblCapacidades.setVisible(false);
            centimetros.setVisible(true);
            radianes.setVisible(true);
            btnSig.setVisible(true);
            txtAltura.setVisible(false);
            txtPeso.setVisible(false);
            btnIMC.setVisible(false);
            lblBMI.setVisible(false);
            lblEC.setVisible(false);
            lblED.setVisible(false);
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
            btn5.setVisible(true);
            btn6.setVisible(true);
            btn7.setVisible(true);
            btn8.setVisible(true);
            btn9.setVisible(true);
            btn0.setVisible(true);
            lblPeso.setVisible(false);
            lblAltura.setVisible(false);
            btnIgual.setVisible(true);
            btnCE.setVisible(true);
            btnC.setVisible(true);
            lblA.setVisible(false);
            lblB.setVisible(false);
            lblC.setVisible(false);
            txtA.setVisible(false);
            txtB.setVisible(false);
            txtC.setVisible(false);
            btnEC.setVisible(false);
            txtValor.setBounds(50,50,405,35);
            btnFra.setBounds(180,240,60,25);
            btn7.setBounds(260,125,45,25);
            btn8.setBounds(310,125,45,25);
            btn9.setBounds(360,125,45,25);
            btnDiv.setBounds(410,125,45,25);
            btn4.setBounds(260,155,45,25);
            btn5.setBounds(310,155,45,25);
            btn6.setBounds(360,155,45,25);
            btnMul.setBounds(410,155,45,25);
            btn1.setBounds(260,185,45,25);
            btn2.setBounds(310,185,45,25);
            btn3.setBounds(360,185,45,25);
            btnRes.setBounds(410,185,45,25);
            btn0.setBounds(260,215,45,25);
            btnSig.setBounds(310,215,45,25);
            btnComa.setBounds(360,215,45,25);
            btnSum.setBounds(410,215,45,25);
            btnIgual.setBounds(410,245,42,25);
            btnRetro.setBounds(260,95,93,25);
            btnCE.setBounds(356,95,59,25);
            btnC.setBounds(409,95,44,25);
            this.setBounds(500,100,475,335);
        }
        else if(e.getSource()==biblica){
            this.setBounds(500,100,530,370);
            txtValor.setVisible(true);
            btnGsm.setVisible(false);
            btnExp.setVisible(false);
            btnln.setVisible(false);
            btnSin.setVisible(false);
            btnPow.setVisible(false);
            btnLog.setVisible(false);
            btnCos.setVisible(false);
            btnCub.setVisible(false);
            btnFact.setVisible(false);
            btnTan.setVisible(false);
            btnComa.setVisible(false);
            btnDiv.setVisible(false);
            btnMul.setVisible(false);
            btnRes.setVisible(false);
            btnSum.setVisible(false);
            btnTal.setVisible(true);
            btnLibPla.setVisible(true);
            btnSiclo.setVisible(true);
            btnDen.setVisible(true);
            btnDrac.setVisible(true);
            btnBla.setVisible(true);
            btnCodo.setVisible(true);
            btnBra.setVisible(true);
            btnEst.setVisible(true);
            btnMil.setVisible(true);
            btnCam.setVisible(true); 
            btnAl.setVisible(true);
            btnMSato.setVisible(true);
            btnBar.setVisible(true);
            btnKor.setVisible(true);
            btnCant.setVisible(true);
            centimetros.setVisible(false);
            radianes.setVisible(false);
            btnPunto.setVisible(false);
            btnFra.setVisible(false);
            btnCua.setVisible(false);
            btnSig.setVisible(false);
            btnSqr.setVisible(false);
            txtAltura.setVisible(false);
            txtPeso.setVisible(false);
            btnIMC.setVisible(false);
            lblBMI.setVisible(false);
            lblEC.setVisible(false);
            lblED.setVisible(false);
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
            btn5.setVisible(true);
            btn6.setVisible(true);
            btn7.setVisible(true);
            btn8.setVisible(true);
            btn9.setVisible(true);
            btn0.setVisible(true);
            lblPeso.setVisible(false);
            lblAltura.setVisible(false);
            btnIgual.setVisible(true);
            btnCE.setVisible(true);
            btnC.setVisible(true);
            btnRetro.setVisible(true);
            lblA.setVisible(false);
            lblB.setVisible(false);
            lblC.setVisible(false);
            txtA.setVisible(false);
            txtB.setVisible(false);
            txtC.setVisible(false);
            btnEC.setVisible(false);
            btnTal.setBounds(20,270,130,25);
            btnLibPla.setBounds(20,170,130,25);
            btnSiclo.setBounds(20,190,130,25);
            btnDen.setBounds(20,210,130,25);
            btnDrac.setBounds(20,230,130,25);
            btnBla.setBounds(20,250,130,25);

            btnCodo.setBounds(155,250,200,25);
            btnBra.setBounds(155,170,200,25);
            btnEst.setBounds(155,190,200,25);
            btnMil.setBounds(155,210,200,25);
            btnCam.setBounds(155,230,200,25); 

            btnAl.setBounds(360,250,130,25);
            btnMSato.setBounds(360,170, 130,25);
            btnBar.setBounds(360,190,130,25);
            btnKor.setBounds(360,210,130,25);
            btnCant.setBounds(360,230,130,25);

            btn0.setBounds(50,120,45,25);
            btn1.setBounds(85,120,45,25);
            btn2.setBounds(120,120,45,25);
            btn3.setBounds(155,120,45,25);
            btn4.setBounds(190,120,45,25);
            btn5.setBounds(225,120,45,25);
            btn6.setBounds(260,120,45,25);
            btn7.setBounds(295,120,45,25);
            btn8.setBounds(330,120,45,25);
            btn9.setBounds(365,120,45,25);
            btnIgual.setBounds(400,120,45,25);
            btnRetro.setBounds(160,95,93,25);
            btnCE.setBounds(250,95,50,25);
            btnC.setBounds(300,95,44,25);

            //lblMonedas= new JLabel("Monedas: ");
            lblMonedas.setBounds(30,150,200,25);
            add(lblMonedas);
            //lblLineales= new JLabel("Lineales: ");
            lblLineales.setBounds(165,150,200,25);
            add(lblLineales);
            //lblCapacidades= new JLabel("Capacidades: ");
            lblCapacidades.setBounds(370,150,130,25);
            add(lblCapacidades);
        }
        else if(e.getSource()==IMC){
            this.setBounds(500,100,475,335);
            lblPeso.setVisible(true);
            lblAltura.setVisible(true);
            lblBMI.setVisible(true);
            txtAltura.setVisible(true);
            txtPeso.setVisible(true);
            btnIMC.setVisible(true);
            btnGsm.setVisible(false);
            btnExp.setVisible(false);
            btnln.setVisible(false);
            btnSin.setVisible(false);
            btnPow.setVisible(false);
            btnLog.setVisible(false);
            btnCos.setVisible(false);
            btnCub.setVisible(false);
            btnFact.setVisible(false);
            btnTan.setVisible(false);
            btnComa.setVisible(false);
            btnDiv.setVisible(false);
            btnMul.setVisible(false);
            btnRes.setVisible(false);
            btnSum.setVisible(false);
            centimetros.setVisible(false);
            radianes.setVisible(false);
            btnPunto.setVisible(false);
            btnFra.setVisible(false);
            btnCua.setVisible(false);
            btnSig.setVisible(false);
            btnSqr.setVisible(false);
            btnTal.setVisible(false);
            btnLibPla.setVisible(false);
            btnSiclo .setVisible(false);
            btnDen.setVisible(false);
            btnDrac.setVisible(false);
            btnBla.setVisible(false);
            btnCodo.setVisible(false);
            btnBra.setVisible(false);
            btnEst.setVisible(false);
            btnMil.setVisible(false);
            btnCam .setVisible(false);
            btnAl.setVisible(false);
            btnMSato.setVisible(false);
            btnBar.setVisible(false);
            btnKor.setVisible(false);
            btnCant.setVisible(false);
            btnSqr.setVisible(false);
            btnPerc.setVisible(false);
            lblMonedas.setVisible(false);
            lblLineales.setVisible(false);
            lblCapacidades.setVisible(false);
            txtValor.setVisible(false);
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn4.setVisible(false);
            btn5.setVisible(false);
            btn6.setVisible(false);
            btn7.setVisible(false);
            btn8.setVisible(false);
            btn9.setVisible(false);
            btn0.setVisible(false);
            btnRetro.setVisible(false);
            btnC.setVisible(false);
            btnCE.setVisible(false);
            btnIgual.setVisible(false);
            lblA.setVisible(false);
            lblB.setVisible(false);
            lblC.setVisible(false);
            txtA.setVisible(false);
            txtB.setVisible(false);
            txtC.setVisible(false);
            btnEC.setVisible(false);
            lblEC.setVisible(false);
            lblED.setVisible(false);
            lblPeso= new JLabel("Peso(kg): ");
            lblPeso.setBounds(50,30,100,30); 
            add(lblPeso);
            lblAltura= new JLabel("Altura(m): ");
            lblAltura.setBounds(50,60,100,30);
            add(lblAltura);
            lblBMI.setBounds(100,120,400,30); 
            add(lblBMI);
            txtPeso.setBounds(110,30,100,30); 
            txtAltura.setBounds(110,60,100,30);
            btnIMC.setBounds(100,90,100,30);

        }
        else if(e.getSource()==FormC){
            lblPeso.setVisible(false);
            lblAltura.setVisible(false);
            lblBMI.setVisible(false);
            txtAltura.setVisible(false);
            txtPeso.setVisible(false);
            btnIMC.setVisible(false);
            btnGsm.setVisible(false);
            btnExp.setVisible(false);
            btnln.setVisible(false);
            btnSin.setVisible(false);
            btnPow.setVisible(false);
            btnLog.setVisible(false);
            btnCos.setVisible(false);
            btnCub.setVisible(false);
            btnFact.setVisible(false);
            btnTan.setVisible(false);
            btnComa.setVisible(false);
            btnDiv.setVisible(false);
            btnMul.setVisible(false);
            btnRes.setVisible(false);
            btnSum.setVisible(false);
            centimetros.setVisible(false);
            radianes.setVisible(false);
            btnPunto.setVisible(false);
            btnFra.setVisible(false);
            btnCua.setVisible(false);
            btnSig.setVisible(false);
            btnSqr.setVisible(false);
            btnTal.setVisible(false);
            btnLibPla.setVisible(false);
            btnSiclo .setVisible(false);
            btnDen.setVisible(false);
            btnDrac.setVisible(false);
            btnBla.setVisible(false);
            btnCodo.setVisible(false);
            btnBra.setVisible(false);
            btnEst.setVisible(false);
            btnMil.setVisible(false);
            btnCam .setVisible(false);
            btnAl.setVisible(false);
            btnMSato.setVisible(false);
            btnBar.setVisible(false);
            btnKor.setVisible(false);
            btnCant.setVisible(false);
            btnSqr.setVisible(false);
            btnPerc.setVisible(false);
            lblMonedas.setVisible(false);
            lblLineales.setVisible(false);
            lblCapacidades.setVisible(false); 
            txtValor.setVisible(false);
            btnIgual.setVisible(false); 
            btnC.setVisible(false); 
            btnCE.setVisible(false); 
            btnRetro.setVisible(false); 
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn4.setVisible(false);
            btn5.setVisible(false);
            btn6.setVisible(false);
            btn7.setVisible(false);
            btn8.setVisible(false);
            btn9.setVisible(false);
            btn0.setVisible(false);
            lblA.setVisible(true);
            lblB.setVisible(true);
            lblC.setVisible(true);
            txtA.setVisible(true);
            txtB.setVisible(true);
            txtC.setVisible(true);
            btnEC.setVisible(true);
            lblEC.setVisible(true);
            lblED.setVisible(true);
            lblA= new JLabel("a: ");
            lblA.setBounds(50,30,100,30);
            add(lblA);
            lblB= new JLabel("b: ");
            lblB.setBounds(50,60,100,30);
            add(lblB);
            lblC= new JLabel("c: ");
            lblC.setBounds(50,90,100,30);
            add(lblC);
            txtA.setBounds(110,30,100,30); 
            txtB.setBounds(110,60,100,30);
            txtC.setBounds(110,90,100,30);
           btnEC.setBounds(110,120,100,30);
           lblEC.setBounds(110,150,200,30); 
            add(lblEC);
            lblED.setBounds(110,180,200,30); 
            add(lblED);
         
        }
    }
}

