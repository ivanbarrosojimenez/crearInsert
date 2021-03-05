package main;

import java.io.IOException;
import java.sql.SQLException;

import conexion.DB2Conex;
import fichero.GrabarFichero;
import tscuadro.GenerarInsertTscuadro;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean generarDelete = false;   // si se pone true se añade el delete, si se pone false no
		
		/*
		
		// Generacion TSCHIPPR
		final String nombreFicheroEntrada = "TSCHIPPR_020321";
		GenerarInsertChipCard generarInsertChipCard = new GenerarInsertChipCard();
		StringBuffer resultado = generarInsertChipCard.obtenerInsert("entrada/"+nombreFicheroEntrada + ".csv", generarDelete);  
		
		GrabarFichero grabarFichero = new GrabarFichero();
		grabarFichero.crearFichero("salida/Insert_"+nombreFicheroEntrada+".sql", true);
		grabarFichero.agregarAFichero(resultado.toString());
		grabarFichero.cerrarFichero();
		
		
		System.out.println("Creado fichero salida "+(generarDelete?"con Delete: ":"sin Delete: ")+"Insert_"+nombreFicheroEntrada+".sql");
		*/
		// Generacion TSCUADRO
		
		final String nombreFicheroEntrada = "TSCUADRO_040321_v2";
		GenerarInsertTscuadro generarInsertTscuadro = new GenerarInsertTscuadro();
		int MAX_LINEAS_PROCESAR = 10000;
		
		

		int ultimoValor = 0;
		for (int i = MAX_LINEAS_PROCESAR, parte = 0; i < 400000; i += MAX_LINEAS_PROCESAR, parte++) {
			GrabarFichero grabarFichero = new GrabarFichero();
//			grabarFichero.crearFichero("salida/Insert_"+nombreFicheroEntrada+"_parte_"+parte+".sql", true);
			StringBuffer resultado1 = generarInsertTscuadro.obtenerInsert("entrada/" + nombreFicheroEntrada + ".csv",
					generarDelete, ultimoValor, i);
//			grabarFichero.agregarAFichero(resultado1.toString());
//			System.out.println("parte "  + parte + " creando registros desde " +ultimoValor +" hasta " +i);
//			ultimoValor = i+1;
//			grabarFichero.cerrarFichero();

		}


		
		
		
		System.out.println("Creado fichero salida "+(generarDelete?"con Delete: ":"sin Delete: ")+"Insert_"+nombreFicheroEntrada+".sql");
		/*
		
		// Generacion TSREDDEL
		final String nombreFicheroEntrada = "TSREDDEL_040321_v2";
		GenerarInsertTsreddel generarInsertTsreddel = new GenerarInsertTsreddel();
		StringBuffer resultado = generarInsertTsreddel.obtenerInsert("entrada/"+nombreFicheroEntrada + ".csv", generarDelete);  
		
		GrabarFichero grabarFichero = new GrabarFichero();
		grabarFichero.crearFichero("salida/Insert_"+nombreFicheroEntrada+".sql", true);
		grabarFichero.agregarAFichero(resultado.toString());
		grabarFichero.cerrarFichero();
		
		
		System.out.println("Creado fichero salida "+(generarDelete?"con Delete: ":"sin Delete: ")+"Insert_"+nombreFicheroEntrada+".sql");*/
		
	
	}

}