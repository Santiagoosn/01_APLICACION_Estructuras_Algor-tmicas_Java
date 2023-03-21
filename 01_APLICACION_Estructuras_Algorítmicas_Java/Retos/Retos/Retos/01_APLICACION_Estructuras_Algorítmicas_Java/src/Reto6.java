import java.util.Scanner;
import java.util.Random;

public class Reto6 {

public static void main(String[] args) {
    Scanner Lectura = new Scanner(System.in);
    Random random = new Random();
    int S;
    boolean sal = false;
    
    do{

        System.out.println("Digite la cantidad de dinero a apostar: ");

        Lectura.nextDouble();

        System.out.println("Elija sello o cara :[1],[2] ");
        S =Lectura.nextInt();

        switch(S){

            case 1:
            int i = random.nextInt(2);
            if (i == 0) {
                System.out.println ("Felicidades salio Sello");
            } else if (i == 1) {
                System.out.println ("salio Cara usted perdio");
            }
                break;

            case 2:
            int H = random.nextInt(2);
            if (H == 0) {
                System.out.println ("salio Sello usted perdio");
            } else if (H == 1) {
                System.out.println ("Felicidades salio Cara");
            }
                break;

        }
        System.out.println("¿Desea Seguir Jugando?");
        if(Lectura.next().equals("si")) sal=false ;
        else  sal=true; 
    }
    while(!sal);
    Lectura.close();
}
}