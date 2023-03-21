import java.util.Scanner;

public class Reto5 {

    public static void main (String[] args) {
        Scanner Lectura=new Scanner(System.in);
        double codigo, importe, precio, unidades;
    
        System.out.println("Ingresa el codigo");
        codigo=Lectura.nextDouble();

        System.out.println("Ingresa la cantidad de unidades adquiridas");
        unidades=Lectura.nextDouble();
        
        precio=0;
        if(codigo==01)
            precio=17.5;
        if(codigo==02)
            precio=25.0;
        if(codigo==03)
            precio=15.5;
       importe=precio*unidades;

        System.out.println("Valor total a pagar: " + importe + "\n" +
        "precio unitario: " + precio);
        Lectura.close();
    }

}