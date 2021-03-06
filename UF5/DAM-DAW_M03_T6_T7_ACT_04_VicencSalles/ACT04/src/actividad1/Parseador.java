package actividad1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Parseador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SAXBuilder builder = new SAXBuilder();
		File arxiu = new File("c:\\arxiu.xml");
		
	
	
	try{
		Document document = (Document) builder.build(arxiu);
		Element nodeArrel = document.getRootElement();
		List<Element> llista = nodeArrel.getChildren("pa�s");
		
		for (int i=0; i<llista.size(); i++){
			
			Element node = (Element) llista.get(i);
			
			System.out.println("Estado: " + node.getAttributeValue("nombre"));
			System.out.println("Capital: "+ node.getChildText("capital"));
			System.out.println("Poblaci�n: "+ node.getChildText("poblaci�n"));
			System.out.println("Superf�cie: "+ node.getChildText("superficie"));
			System.out.println("---------------------------------------------");
			
		}
		
		
		
	}catch(IOException io){
		System.out.println(io.getMessage());
	}catch(JDOMException jdomex){
		System.out.println(jdomex.getMessage());
	}
	}
}
