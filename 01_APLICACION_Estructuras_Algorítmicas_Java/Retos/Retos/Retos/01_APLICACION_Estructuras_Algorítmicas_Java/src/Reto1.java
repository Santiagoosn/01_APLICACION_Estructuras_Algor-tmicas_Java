import java.util.Scanner;
public class Reto1{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        double  fahrenheit, grados, num=32, num_2=1.8;
    
        System.out.print(" Ingrese la temperatura en grados:");
        grados=Double.parseDouble(lectura.nextLine());

        fahrenheit=(grados-num)/num_2;

        System.out.println("Grados Fahrenheit: "+fahrenheit);
        lectura.close();
    }
}