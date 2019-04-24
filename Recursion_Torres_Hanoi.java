import java.util.Scanner;
/**
 */
public class Recursion_Torres_Hanoi
{
    public static void main (String[] ars){
       System.out.println('\u000c');
       Scanner leer = new Scanner(System.in);
       System.out.print("Digite el número de discos: ");
       int d = leer.nextInt();
       
       movimientos (d,1, 2, 3);
    }
    
    public static void movimientos (int discos, int orig, int aux, int destino){
       if(discos==1){
           System.out.println("Mover del "+ orig + " al " +destino);
        }else{
           movimientos(discos-1, orig, destino, aux);
           System.out.println("Mover del "+ orig + " al " +destino);
           movimientos(discos-1, aux, orig, destino);
        }
    }
    }

