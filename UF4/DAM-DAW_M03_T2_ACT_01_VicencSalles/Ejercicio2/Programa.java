package Ejercicio2;
import java.util.Scanner;
import Ejercicio2.Cuenta;

public class Programa {

	public static void main(String[] args) {
		
		Cuenta uno = new Cuenta(1,4000,"Bob Bobson");
		Cuenta dos = new Cuenta(2,200,"Rob Robson");
		Cuenta[] cuentas ={uno,dos};
		menuPrincipal(cuentas);		

	}
	public static void menuPrincipal (Cuenta[] cuentas){
		System.out.println("#--menuPricipal--#");
		
		Scanner scaner = new Scanner(System.in);
		
		System.out.println("");
		System.out.println(" Bienvenido a Gansterlandia, tu banco de confianza ");
		System.out.println("");
		System.out.println("Selecciona una opciσn:");
		System.out.println("1.Consultar Saldo");
		System.out.println("2.Ingresar dinero");
		System.out.println("3.Sacar dinero");
		System.out.println("4.Transferencia");
		
		int eleccion = scaner.nextInt();
		
		switch (eleccion) {
        case 1:
        	int c = seleccionaCuenta();        	
            int s = cuentas[c].getSaldo();
           
           System.out.println("tu saldo es: "+s);
           menuPrincipal(cuentas);
           break;
        case 2:
        	int d = seleccionaCuenta();
        	int ing = pideCantidad();
        	cuentas[d].setSaldo(ing);
        	
        	System.out.println("Se han ingressado correctamente "+ing+" euros en tu cuenta.");
        	menuPrincipal(cuentas);
        	break;
        case 3:
        	int e = seleccionaCuenta();
        	int ret = pideCantidad();
        	cuentas[e].setSaldo(-ret);
        	
        	System.out.println("Aquν tienes tus "+ret+" euros.");
        	menuPrincipal(cuentas);
        	break;
        case 4:
            System.out.println("Elecciσn de la cuenta de origen");
        	int f = seleccionaCuenta();
        	int sac = pideCantidad();
        	cuentas[f].setSaldo(-sac);
        	System.out.println("Elecciσn de la cuenta de destino");
        	int g = seleccionaCuenta();
        	cuentas[g].setSaldo(sac);
        	
        	System.out.println("Transferencia correcta");
        	menuPrincipal(cuentas);
        	break;
        default:
            // The user input an unexpected choice.
        	System.out.println("Opciσn no disponible");
        	
        	menuPrincipal(cuentas);
    }

	}
	
	public static int seleccionaCuenta(){
		
		int respuesta= 0;
		Scanner scanerA = new Scanner(System.in);
		
		System.out.println("_______________________");
		System.out.println("Selecciona una cuenta");
		System.out.println("1.Cuenta uno");
		System.out.println("2.Cuenta dos");
		int eleccion = scanerA.nextInt();
		
		if(eleccion == 1 || eleccion == 2){
			
			respuesta = eleccion-1;
			
		}else{
			scanerA.close();
			seleccionaCuenta();
			
		}
		
		return respuesta;
		
	}
	
	public static int pideCantidad(){
		
		int respuesta= 0;
		Scanner scanerB = new Scanner(System.in);

		System.out.println("_______________________");
		System.out.println("Introduce una cantidad");
		int eleccion = scanerB.nextInt();
		respuesta = eleccion;
	
		return respuesta;
		
	}

}
