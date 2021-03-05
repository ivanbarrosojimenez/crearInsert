package tscuadro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import conexion.DB2Conex;

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
	         //System.out.println(cabecera);
	         String cabeceraConFormato = ("INSERT INTO DBA1.TSCUADRO (" + cabecera + ")  VALUES (");
	         cabeceraConFormato= cabeceraConFormato.replaceAll(";", ", ").replaceAll("﻿", "");
//	         System.out.println(cabeceraConFormato);
	         
	         DB2Conex conexion = new DB2Conex("", "");

	 		conexion.setVerbose(false);
		
	         
	         int contador = 0;
			while ((linea = br.readLine()) != null) {

				// System.out.println(linea);
				
				// System.out.println(linea);
				if (contador >= inicio && contador <= fin) {
					linea = linea.replaceAll(";\"", ";").replaceAll("\";", ";").replaceAll("\"\"", "\"").replaceAll("     ", "");
					Tscuadro cuadroLinea = new Tscuadro(linea.replaceAll("'", "''"), cabeceraConFormato);
					resultado.append(cuadroLinea.toString());
//					try {
//						if(contador >= 25882) {
//							conexion.ejecutaUpdateSQLNoConex(cuadroLinea.toString());
//
//						}
//
//					} catch (ClassNotFoundException e) {
//						e.printStackTrace();
//						System.out.println(cuadroLinea.toString());
//						System.out.println(contador);
//
//					} catch (SQLException e) {
//						if(e.toString().contains("-803")){
//							System.out.println("Continuar error 803");
//						} else {
//							e.printStackTrace();
//							System.out.println(cuadroLinea.toString());
//							System.out.println(contador);
//						}
//						
//
//
//					}

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
	
	public StringBuffer obtenerInsertSquirrel(String f, boolean generarDelete, int inicio, int fin) {
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
	         //System.out.println(cabecera);
	         String cabeceraConFormato = ("INSERT INTO DBA1.TSCUADRO (" + cabecera + ")  VALUES (");
	         cabeceraConFormato= cabeceraConFormato.replaceAll(";", ", ").replaceAll("﻿", "");
//	         System.out.println(cabeceraConFormato);
	         
	
	         
	         int contador = 0;
			while ((linea = br.readLine()) != null) {

				// System.out.println(linea);
				
				// System.out.println(linea);
				if (contador >= inicio && contador <= fin) {
					linea = linea.replaceAll(";\"", ";").replaceAll("\";", ";").replaceAll("\"\"", "\"").replaceAll("     ", "");
					Tscuadro cuadroLinea = new Tscuadro(linea, "");
					resultado.append(cuadroLinea.toStringSquirrel());


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
