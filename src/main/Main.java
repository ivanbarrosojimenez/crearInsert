package main;

import java.io.IOException;

import fichero.GrabarFichero;
import tscuadro.GenerarInsertTscuadro;
import tsreddel.GenerarInsertTsreddel;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean generarDelete = true;   // si se pone true se añade el delete, si se pone false no
		
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
		
		// Generacion TSCUADRO
		final String nombreFicheroEntrada = "TSCUADRO_040321_v2";
		GenerarInsertTscuadro generarInsertTscuadro = new GenerarInsertTscuadro();
		StringBuffer resultado = generarInsertTscuadro.obtenerInsert("entrada/"+nombreFicheroEntrada + ".csv", generarDelete);  
		
		GrabarFichero grabarFichero = new GrabarFichero();
		grabarFichero.crearFichero("salida/Insert_"+nombreFicheroEntrada+".sql", true);
		grabarFichero.agregarAFichero(resultado.toString());
		grabarFichero.cerrarFichero();
		
		
		System.out.println("Creado fichero salida "+(generarDelete?"con Delete: ":"sin Delete: ")+"Insert_"+nombreFicheroEntrada+".sql");
		*/
		
		// Generacion TSREDDEL
		final String nombreFicheroEntrada = "TSREDDEL_040321_v2";
		GenerarInsertTsreddel generarInsertTsreddel = new GenerarInsertTsreddel();
		StringBuffer resultado = generarInsertTsreddel.obtenerInsert("entrada/"+nombreFicheroEntrada + ".csv", generarDelete);  
		
		GrabarFichero grabarFichero = new GrabarFichero();
		grabarFichero.crearFichero("salida/Insert_"+nombreFicheroEntrada+".sql", true);
		grabarFichero.agregarAFichero(resultado.toString());
		grabarFichero.cerrarFichero();
		
		
		System.out.println("Creado fichero salida "+(generarDelete?"con Delete: ":"sin Delete: ")+"Insert_"+nombreFicheroEntrada+".sql");
		}

}