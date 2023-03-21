import java.util.Scanner;

public class Reto8 {

    public static void main(String[] args) {

        try (Scanner lectura = new Scanner(System.in)) {
            int i=0, contador=0, maquina=0, intento=0;

            maquina = (int) (Math.random()*100)+1;
            
            for (i = 0; i < 100; i++){

                contador = contador +1;

                System.out.println("Ingrese un Numero");
                intento = lectura.nextInt();
                
                if(maquina==intento){
                    System.out.println("Felicidades usted gano");
                    System.out.println("Intentos: "+contador);
                    
                    break;

                }else if(maquina > intento){
                    System.out.println("el numero es mayor que "+intento);
                }else if(maquina < intento){
                    System.out.println("el numero es menor que "+intento);
                }
            }
                    
                    System.out.println("perdiste todas tus vidas");
                lectura.close();
        }


    }
    
}
