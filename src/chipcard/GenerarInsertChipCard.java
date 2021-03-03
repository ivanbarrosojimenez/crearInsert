package chipcard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GenerarInsertChipCard {
	public StringBuffer obtenerInsert(String f) {
		StringBuffer resultado = new StringBuffer();
		BufferedReader br = null; 
		try {
			FileReader fr = new FileReader(f);
			br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         String cabecera = br.readLine();
	         String cabeceraConFormato = ("INSERT INTO DBA1.TSCHIPPR (" + cabecera + ")  VALUES (");
	         cabeceraConFormato= cabeceraConFormato.replaceAll(";", ", ");
	         //System.out.println(cabeceraConFormato);
	         
	         while((linea=br.readLine())!=null) {
		            //System.out.println(linea);
		            Chippr chipprLinea = new Chippr(linea, cabeceraConFormato);
		            resultado.append(chipprLinea.toString());
	         }
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
}
