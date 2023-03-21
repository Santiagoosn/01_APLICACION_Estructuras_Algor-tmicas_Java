
import java.util.Scanner;
public class Reto7 {
    
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int opcion, random;
        boolean sal=false;

        do{
            System.out.println("elige tu opcion: piedra:1, papel:2, tijera:3");

            opcion=lectura.nextInt();
            random=(int) (Math.random()*3)+1;
        
            if(random==1 && opcion==1){
                System.out.println("respuesta tijera");
                System.out.println("felicidads has ganado");
            }
            else if(random==1 && opcion==2){
                System.out.println("respuesta tijera");
                System.out.println("has perdido");
       
            }
            else if(random==3 && opcion==1){
                System.out.println("empate");
            }
            else if(random==2 && opcion==2){
                System.out.println("respuesta piedra");
                System.out.println("has ganado");
            }
            else if(random==3 && opcion==3){
                System.out.println("respuesta piedra");
                System.out.println("has perdido ");
            }
            else if(random==3 && opcion==2){
                System.out.println("empate");
            }
            else if(random==2 && opcion==1){
                System.out.println("respuesta papel");
                System.out.println("has perdido");
            }
            else if(random==2 && opcion==3){
                System.out.println("respuesta papel");
                System.out.println("felicidades has ganado");
            }
            else if(random==1 && opcion==3){
                System.out.println("empate");
            }
            System.out.println("¿Desea Seguir Jugando?");
            if(lectura.next().equals("si")) sal=false;
            else  sal=true;  
        }
        
        while(!sal);
        lectura.close();
    }
}