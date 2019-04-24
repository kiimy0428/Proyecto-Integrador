import java.util.Scanner;
import java.lang.Math;
/**
 * Calulcar BMI y poner estado
 */
public class IMC
{
     public static void main(String[] arg) {
         double peso, altura, BMI;
         System.out.print("\u000c");
         Scanner entrada = new Scanner(System.in);
         System.out.println("peso (kg): ");
         peso = entrada.nextDouble();
         System.out.println("altura(m): ");
         altura = entrada.nextDouble();
        
        BMI= peso/(altura*altura);
        System.out.println("BMI: "+ BMI);
      
        if(BMI<16){
          System.out.println("Diagnóstico: Criterio de ingreso en hospital");
        }
           else if(BMI>=16 && BMI<17){
              System.out.println("Diagnóstico: Infrapeso");
            }
             else if(BMI>=17 && BMI<18){
              System.out.println("Diagnóstico: Bajo peso");
            }
             else if(BMI>=18 && BMI<25){
              System.out.println("Diagnóstico: Peso saludable");
             }
             else if(BMI>=25 && BMI<30){
              System.out.println("Diagnóstico: Sobrepeso");
            }
             else if(BMI>=30 && BMI<35){
              System.out.println("Diagnóstico: Sobrepeso crónico");
            }
             else if(BMI>=35 && BMI<=40){
              System.out.println("Diagnóstico: Obesidad premórbida");
            }
             else if(BMI>40){
              System.out.println("Diagnóstico: Obesidad mórbida");
        }
            
        }
        
    }