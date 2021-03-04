package main;

import java.io.IOException;

import chipcard.GenerarInsertChipCard;
import fichero.GrabarFichero;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean generarDelete = true;   // si se pone true se a�ade el delete, si se pone false no
		
		final String nombreFicheroEntrada = "TSCHIPPR_020321";
		GenerarInsertChipCard generarInsertChipCard = new GenerarInsertChipCard();
		StringBuffer resultado = generarInsertChipCard.obtenerInsert("entrada/"+nombreFicheroEntrada + ".csv", generarDelete);  
		
		GrabarFichero grabarFichero = new GrabarFichero();
		grabarFichero.crearFichero("salida/Insert_"+nombreFicheroEntrada+".sql", true);
		grabarFichero.agregarAFichero(resultado.toString());
		grabarFichero.cerrarFichero();
		
		// Creado fichero salida con Delete + Insert
		// Creado fichero salida sin delete
//		String mensaje = generarDelete?
//				 "Creado fichero salida con Delete: Insert_"+nombreFicheroEntrada+".sql"
//				:"Creado fichero salida sin Delete: Insert_"+nombreFicheroEntrada+".sql";
//		
//		System.out.println(mensaje);
		
		// Todo lo que esta comentado arriba se resume en la l�nea de abajo
		System.out.println("Creado fichero salida "+(generarDelete?"con Delete: ":"sin Delete: ")+"Insert_"+nombreFicheroEntrada+".sql");
		}

}