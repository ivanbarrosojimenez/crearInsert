package main;

import java.io.IOException;

import chipcard.GenerarInsertChipCard;
import fichero.GrabarFichero;

public class Main {

	public static void main(String[] args) throws IOException {
		final String nombreFicheroEntrada = "TSCHIPPR_020321";
		GenerarInsertChipCard generarInsertChipCard = new GenerarInsertChipCard();
		StringBuffer resultado = generarInsertChipCard.obtenerInsert("entrada/"+nombreFicheroEntrada + ".csv", true);
		
		GrabarFichero grabarFichero = new GrabarFichero();
		grabarFichero.crearFichero("salida/Insert_"+nombreFicheroEntrada+".sql", true);
		grabarFichero.agregarAFichero(resultado.toString());
		grabarFichero.cerrarFichero();
		System.out.println("Creado fichero salida/Insert_"+nombreFicheroEntrada+".sql ");
	}

}
