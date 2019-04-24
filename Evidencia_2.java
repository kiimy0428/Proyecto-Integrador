import java.util.Scanner;
/**
 */
public class Evidencia_2
{
    public static void main (String[]ars){
        System.out.print('\u000c');
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el valor del radio: ");
        int radio = leer.nextInt();
        System.out.print("Circunferencia: ");
        System.out.println(calcularCircunferencia(radio));
        System.out.print("Area: ");
        System.out.print(calcularArea(radio));
        }
   
    static double calcularCircunferencia(int radio){
        return 2*radio*Math.PI;
      }
      
    static double calcularArea(int radio){
        return radio*radio*Math.PI;

       }
     
    
}
