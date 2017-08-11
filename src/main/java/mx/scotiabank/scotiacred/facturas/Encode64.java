package mx.scotiabank.scotiacred.facturas;

import java.util.Base64;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encode64 {
	
	static final Logger log = LoggerFactory.getLogger(mx.scotiabank.scotiacred.facturas.Encode64.class);	
	public static void main(String[] args) {
		
		log.info("Ingrese el texto a enmascarar en base64: ");
		Scanner sc = new Scanner(System.in);
		String plain = sc.next();
		String encoded = Base64.getEncoder().encodeToString(plain.getBytes());
		log.info("Texto enmascarado es: " + encoded);
		byte[] decodebyte = Base64.getDecoder().decode(encoded);
		String decoded = new String(decodebyte);
		log.info("Texto desenmascarado es: " + decoded);
		log.warn("Por favor, copie el texto enmascarado en el archivo configServidor.properties");		
		sc.close();
		log.info("FIN DEL PROGRAMA");
	}
}