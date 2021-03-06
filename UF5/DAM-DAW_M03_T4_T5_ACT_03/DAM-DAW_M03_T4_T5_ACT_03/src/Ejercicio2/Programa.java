package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Programa {

	static ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	
	
	public static void menu(){
		
		String res = null;
		int opt = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("#####Bienvenido al Taller Carros2000######");
		System.out.println("Selecciona una operaci�n a realizar:");
		System.out.println("1.Registrar Trabajo.");
		System.out.println("2.Aumentar Horas de un Trabajo.");
		System.out.println("3.Aumentar Coste de las Piezas");
		System.out.println("4.Finalizar Trabajo");
		System.out.println("5.Muestra Trabajo");
		
		try {
			res = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Vaya, parece que ha fallado algo.");
			menu();
		}
		
		opt = Integer.parseInt(res);
		
		switch(opt){
				
		case 1:
			registrar();
			volver();
		break;
		
		case 2:
			
			int a = triaTrabajo();
			int nh = cuantasHoras();
			trabajos.get(a).addHoras(nh);
			volver();
		break;
		
		case 3:
			int b = triaTrabajo();
			int cp = costePiezas();
			trabajos.get(b).addCostePiezas(cp);
			volver();
			break;	
		case 4:
			int c = triaTrabajo();
			trabajos.get(c).finalizar();
			volver();
			break;
		case 5:
			int d = triaTrabajo();
			System.out.println("id: "+trabajos.get(d).getId());
			System.out.println("descripci�n: "+trabajos.get(d).getDescripcion());
			System.out.println("precio: "+trabajos.get(d).getPrecio());			
			volver();
			break;
		case 69:
			System.out.println("Sigue haciendo calendarios Michellin?");
			menu();
			break;
			
		default:
			System.out.println("Esta opci�n no est� disponible.");
			menu();
			break;
		
				
		
		}
		
	}
	
	
	//Registrar un trabajo
	
	public static void registrar(){
		
		int id = trabajos.size();
		String tipo = tipoTrabajo();
		String descripcion = descripcion();
		
		if (tipo.equals("mecanica")){
		
		RepMec a = new RepMec(id,descripcion);
		trabajos.add(a);
		
		}else if(tipo.equals("chapa")){
			
		RepChapa a = new RepChapa(id,descripcion);
		trabajos.add(a);
		
		}else{
		
		Revision a = new Revision(id,descripcion);	
		trabajos.add(a);
		
		}
				
		System.out.println("----------------------------------------");
		System.out.println("El trabajo se ha registrado correctamente.");
		System.out.println("#########################################");
		
	}
	
	
	//Seleccionar tipo de trabajo
	public static String tipoTrabajo(){
		
		String res = null;
		String input = null;
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------------");
		System.out.println("Selecciona el tipo de trabajo:");
		System.out.println("1.Reparaci�n mec�nica.");
		System.out.println("2.Reparaci�n chapa y pintura.");
		System.out.println("3.Revisi�n.");
		
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
				
		if(input.equals("1")){
			res = "mecanica";
		}else if(input.equals("2")){
			res ="chapa";
		}else if(input.equals("3")){
			res ="revision";
		}else{
			System.out.println("Debes introducir un n�mero entre 1 y 3.");
			return tipoTrabajo();
		}
		
		return res;
	}
	
	//Introduce la descripci�n de un trabajo
public static String descripcion(){
		
		String input = null;
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------------");
		System.out.println("Introduce la descripci�n del trabajo a realizar:");		
		
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		return input;
}

//Incrementa el coste de las piezas
public static int costePiezas(){
	String input = null;
	int res = 0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("------------------------------------------------");
	System.out.println("Introduce el coste de piezas a a�adir:");
	try {
		
		input = br.readLine();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();			
	}
	
	res = Integer.parseInt(input);
	
	return res;
	
}


//Numero de horas
public static int cuantasHoras(){
	String input = null;
	int res = 0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("------------------------------------------------");
	System.out.println("Introduce el n�mero de horas:");
	try {
		
		input = br.readLine();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();			
	}
	
	
	try{
	
	res = Integer.parseInt(input);
	}catch (Exception e){
		
		System.out.println("Debes introducir n�meros.");
		cuantasHoras();
		
	}
	
	return res;
	
}

//Seleccionar trabajo a editar
	public static int triaTrabajo(){
		
		String input = null;
		int output = 0;
		int res = 0;
		int mValido = trabajos.size()-1;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------------");
		System.out.println("Introduce el identificador del Trabajo:");
		try {
			
			input = br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		output = Integer.parseInt(input);
		
		if (output>mValido){
			
			System.out.println("No hay ning�n trabajo con este identificador.");
			triaTrabajo();
			
		}else{
			
			res = output;
			
		}	
				
		return res;
	}
	
	//Opcion para volver al menu principal
	public static void volver(){
		String input = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------------");
		System.out.println("Deseas volver al menu principal? [S/N]");
		try {
			
			input = br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		input = input.toUpperCase();
		
		if(input.equals("S")){
			menu();
		}else if(input.equals("N")){
			System.exit(0);
		}else{
			System.out.println("Debes responder con S o N;");
			volver();
		}
		
	}
	
}
