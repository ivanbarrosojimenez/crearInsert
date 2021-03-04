package tscuadro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GenerarInsertTscuadro {
	public StringBuffer obtenerInsert(String f, boolean generarDelete, int inicio, int fin) {
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
	         int contador = 0;
	         while((linea=br.readLine())!=null) {
//		            System.out.println(linea);
		            
		            if(contador>= inicio && contador <=fin) {
			            Tscuadro cuadroLinea = new Tscuadro (linea, cabeceraConFormato);
			            resultado.append(cuadroLinea.toString().replaceAll("'", "''"));
			            //System.out.println(resultado.capacity() + " " + contador);
		            }
		            contador++;

	         }
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
}
