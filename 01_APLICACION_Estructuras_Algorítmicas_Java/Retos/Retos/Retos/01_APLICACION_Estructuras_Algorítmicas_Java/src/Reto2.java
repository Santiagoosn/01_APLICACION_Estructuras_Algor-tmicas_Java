import java.util.Scanner;
public class Reto2{
    public static void main(String[] args){
	Scanner lectura = new Scanner(System.in);

    Double dosis, peso, meses;
	int asd=10, das=8;
	
	System.out.print("Ingrese peso del bebe");
	peso=Double.parseDouble(lectura.nextLine());

	System.out.print("Ingrese meses del bebe");
	meses=Double.parseDouble(lectura.nextLine());

	dosis=(peso + asd)/(meses * asd)*das;

	System.out.print("la dosis de vacuna es:"+dosis);

lectura.close();
	

    }
}