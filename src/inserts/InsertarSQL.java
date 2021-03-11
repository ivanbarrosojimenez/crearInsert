package inserts;

import java.io.BufferedReader;
import java.io.FileReader;

import conexion.DB2Conex2Hilo;

public class InsertarSQL {
private String usuario = "";
private String pass = "";
 public InsertarSQL(String usuario, String pass) {
	 this.usuario = usuario;
	 this.pass = pass;
 }
	BufferedReader br = null; 
	String linea = "";
	public void insertar(String f){
		try {
			new DB2Conex2Hilo(usuario, pass, linea.toString());

			FileReader fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			
			 int contador = 0;
				while ((linea = br.readLine()) != null) {
					//System.out.println(linea);
					 new DB2Conex2Hilo(usuario, pass, linea.toString()).start();;
					
					contador++;
					System.out.println(contador);
				}
		}
		catch (Exception e) {
			System.err.println(linea);
		}
	}
}
