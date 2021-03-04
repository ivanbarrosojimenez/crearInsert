package tscuadro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GenerarInsertTscuadro {
	public StringBuffer obtenerInsert(String f, boolean generarDelete) {
		StringBuffer resultado = new StringBuffer();
		BufferedReader br = null; 
		try {
			FileReader fr = new FileReader(f);
			br = new BufferedReader(fr);

			if (generarDelete) {
				resultado.append("DELETE DBA1.TSCUADRO;\r\n");
			}
	         // Lectura del fichero
	         String linea;
	         String cabecera = br.readLine();
//	         System.out.println(cabecera);
	         String cabeceraConFormato = ("INSERT INTO DBA1.TSCUADRO (" + cabecera + ")  VALUES (");
	         cabeceraConFormato= cabeceraConFormato.replaceAll(";", ", ");
//	         System.out.println(cabeceraConFormato);
	         
	         while((linea=br.readLine())!=null) {
//		            System.out.println(linea);
		            Tscuadro cuadroLinea = new Tscuadro (linea, cabeceraConFormato);
//		            System.out.println(cuadroLinea.toString());
		            resultado.append(cuadroLinea.toString());
	         }
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
}
