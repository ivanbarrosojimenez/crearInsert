package tscuadro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tscuadro {
	private String TIPO_CUADRO;
	private String NUMERACION;
	private String TIPO_INTERFASE;
	private String COD_DELEGACION;
	private String DELEGACION;
	private String TIPO_PROFESIONAL;
	private String ESPECIALIDAD;
	private String SUBESPECIALIDAD;
	private String COD_ESPEC;
	private String COD_SUBESPEC;
	private String PRUEBA;
	private String PADRE;
	private String TRATAMIENTO;
	private String APELLIDO1;
	private String APELLIDO2;
	private String NOMBRE;
	private String TIPO_VIA;
	private String VIA;
	private String NUMERO;
	private String PISO;
	private String LETRA;
	private String ESCALERA;
	private String PORTAL;
	private String CODIGO_POSTAL;
	private String POBLACION;
	private String TELEFONO1;
	private String TELEFONO2;
	private String TELEFONO3;
	private String DIAS1;
	private String DIAS2;
	private String DIAS3;
	private String DIAS4;
	private String HORARIO1;
	private String HORARIO2;
	private String HORARIO3;
	private String HORARIO4;
	private String OBSERVACIONES;
	private String PPH;
	private String CAPITAL;
	private String ORDEN_SERVICIO;
	private String POSTAL_CLASIFICACION;
	private String IND_BUCODENTAL;
	private String IND_NO_PARTOS;
	private String TIPO_PROV;
	private String NRO_PROV;
	private String NRO_CONS;
	private String ZONA;
	private String DISTRITO;
	private String TIPO_MOV;
	private String COD_PREFERENCIA;
	private String HOR_EXT1;
	private String HOR_EXT2;
	private String HOR_EXT3;
	private String HOR_EXT4;
	private String AUDIT_FEC_ALTA;
	private String AUDIT_FEC_MODIFICACION;
	private String AUDIT_COD_USUARIO;
	private String POBLACION_COMERCIAL;
	private String IND_POB_COM;
	private String COD_IDIOMA1;
	private String COD_IDIOMA2;
	private String COD_IDIOMA3;
	private String COD_IDIOMA4;
	private String COD_IDIOMA5;
	private String COD_IDIOMA6;
	private String COD_IDIOMA7;
	private String COD_IDIOMA8;
	private String COD_IDIOMA9;
	private String COD_IDIOMA10;
	private String cabecera;
	SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd");

	
	public Tscuadro(String lineaCsv, String cabecera) {
		String [] partes;

		try {
			partes = lineaCsv.split(";");
			this.TIPO_CUADRO = partes[0];
			this.NUMERACION = partes[1];
			this.TIPO_INTERFASE = partes[2];
			this.COD_DELEGACION = partes[3];
			this.DELEGACION = partes[4];
			this.TIPO_PROFESIONAL = partes[5];
			this.ESPECIALIDAD = partes[6];
			this.SUBESPECIALIDAD = partes[7];
			this.COD_ESPEC = partes[8];
			this.COD_SUBESPEC = partes[9];
			this.PRUEBA = partes[10];
			this.PADRE = partes[11];
			this.TRATAMIENTO = partes[12];
			this.APELLIDO1 = partes[13];
			this.APELLIDO2 = partes[14];
			this.NOMBRE = partes[15];
			this.TIPO_VIA = partes[16];
			this.VIA = partes[17];
			this.NUMERO = partes[18];
			this.PISO = partes[19];
			this.LETRA = partes[20];
			this.ESCALERA = partes[21];
			this.PORTAL = partes[22];
			this.CODIGO_POSTAL = partes[23];
			this.POBLACION = partes[24];
			this.TELEFONO1 = partes[25];
			this.TELEFONO2 = partes[26];
			this.TELEFONO3 = partes[27];
			this.DIAS1 = partes[28];
			this.DIAS2 = partes[29];
			this.DIAS3 = partes[30];
			this.DIAS4 = partes[31];
			this.HORARIO1 = partes[32];
			this.HORARIO2 = partes[33];
			this.HORARIO3 = partes[34];
			this.HORARIO4 = partes[35];
			this.OBSERVACIONES = partes[36];
			this.PPH = partes[37];
			this.CAPITAL = partes[38];
			this.ORDEN_SERVICIO = partes[39];
			this.POSTAL_CLASIFICACION = partes[40];
			this.IND_BUCODENTAL = partes[41];
			this.IND_NO_PARTOS = partes[42];
			this.TIPO_PROV = partes[43];
			this.NRO_PROV = partes[44];
			this.NRO_CONS = partes[45];
			this.ZONA = partes[46];
			this.DISTRITO = partes[47];
			this.TIPO_MOV = partes[48];
			this.COD_PREFERENCIA = partes[49];
			this.HOR_EXT1 = partes[50];
			this.HOR_EXT2 = partes[51];
			this.HOR_EXT3 = partes[52];
			this.HOR_EXT4 = partes[53];
			this.AUDIT_FEC_ALTA = obtenerFecha(partes[54]);
			this.AUDIT_FEC_MODIFICACION = obtenerFecha(partes[55]);
			this.AUDIT_COD_USUARIO = partes[56];
			this.POBLACION_COMERCIAL = partes[57];
			this.IND_POB_COM = partes[58];
//			this.COD_IDIOMA1 = partes[59];
//			this.COD_IDIOMA2 = partes[60];
//			this.COD_IDIOMA3 = partes[61];
//			this.COD_IDIOMA4 = partes[62];
//			this.COD_IDIOMA5 = partes[63];
//			this.COD_IDIOMA6 = partes[64];
//			this.COD_IDIOMA7 = partes[65];
//			this.COD_IDIOMA8 = partes[66];
//			this.COD_IDIOMA9 = partes[67];
//			this.COD_IDIOMA10 = partes[68];
			this.cabecera = cabecera;

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	




	@Override
	public String toString() {
		return getCabecera() + " '" + getTIPO_CUADRO() + "', " + getNUMERACION() + ", '" + getTIPO_INTERFASE() + "', " + getCOD_DELEGACION()
		+ ", '" + getDELEGACION() + "', '" + getTIPO_PROFESIONAL() + "', '" + getESPECIALIDAD() + "', '"
		+ getSUBESPECIALIDAD() + "', " + getCOD_ESPEC() + ", " + getCOD_SUBESPEC() + ", '" + getPRUEBA() + "', '"
		+ getPADRE() + "', '" + getTRATAMIENTO() + "', '" + getAPELLIDO1() + "', '" + getAPELLIDO2() + "', '"
		+ getNOMBRE() + "', '" + getTIPO_VIA() + "', '" + getVIA() + "', '" + getNUMERO() + "', '" + getPISO() + "', '"
		+ getLETRA() + "', '" + getESCALERA() + "', '" + getPORTAL() + "', '" + getCODIGO_POSTAL() + "', '"
		+ getPOBLACION() + "', '" + getTELEFONO1() + "', '" + getTELEFONO2() + "', '" + getTELEFONO3() + "', '"
		+ getDIAS1() + "', '" + getDIAS2() + "', '" + getDIAS3() + "', '" + getDIAS4() + "', '" + getHORARIO1() + "', '"
		+ getHORARIO2() + "', '" + getHORARIO3() + "', '" + getHORARIO4() + "', '" + getOBSERVACIONES() + "', '"
		+ getPPH() + "', '" + getCAPITAL() + "', '" + getORDEN_SERVICIO() + "', '" + getPOSTAL_CLASIFICACION() + "', '"
		+ getIND_BUCODENTAL() + "', '" + getIND_NO_PARTOS() + "', '" + getTIPO_PROV() + "', " + getNRO_PROV() + ", "
		+ getNRO_CONS() + ", '" + getZONA() + "', '" + getDISTRITO() + "', '" + getTIPO_MOV() + "', '"
		+ getCOD_PREFERENCIA() + "', '" + getHOR_EXT1() + "', '" + getHOR_EXT2() + "', '" + getHOR_EXT3() + "', '"
		+ getHOR_EXT4() + "', " + getAUDIT_FEC_ALTA() + ", " + getAUDIT_FEC_MODIFICACION() + ", '"
		+ getAUDIT_COD_USUARIO() + "', '" + getPOBLACION_COMERCIAL() + "', '" + getIND_POB_COM() + "');";
	}


	private String obtenerFecha(String fecha) {
		String fechaFormato = null;
		try {
			fechaFormato = sdfSalida.format(sdfEntrada.parse(fecha));
		} catch (Exception e) {
			try {
				fechaFormato = sdfSalida.format(sdfSalida.parse(fecha));
			} catch (ParseException e1) {
			}
		}

		return fechaFormato;
	}




	public String getTIPO_CUADRO() {
		return TIPO_CUADRO;
	}


	public String getNUMERACION() {
		return NUMERACION;
	}


	public String getTIPO_INTERFASE() {
		return TIPO_INTERFASE;
	}


	public String getCOD_DELEGACION() {
		return COD_DELEGACION;
	}


	public String getDELEGACION() {
		return DELEGACION;
	}


	public String getTIPO_PROFESIONAL() {
		return TIPO_PROFESIONAL;
	}


	public String getESPECIALIDAD() {
		return ESPECIALIDAD;
	}


	public String getSUBESPECIALIDAD() {
		return SUBESPECIALIDAD;
	}


	public String getCOD_ESPEC() {
		return COD_ESPEC;
	}


	public String getCOD_SUBESPEC() {
		return COD_SUBESPEC;
	}


	public String getPRUEBA() {
		return PRUEBA;
	}


	public String getPADRE() {
		return PADRE;
	}


	public String getTRATAMIENTO() {
		return TRATAMIENTO;
	}


	public String getAPELLIDO1() {
		return APELLIDO1;
	}


	public String getAPELLIDO2() {
		return APELLIDO2;
	}


	public String getNOMBRE() {
		return NOMBRE;
	}


	public String getTIPO_VIA() {
		return TIPO_VIA;
	}


	public String getVIA() {
		return VIA;
	}


	public String getNUMERO() {
		return NUMERO;
	}


	public String getPISO() {
		return PISO;
	}


	public String getLETRA() {
		return LETRA;
	}


	public String getESCALERA() {
		return ESCALERA;
	}


	public String getPORTAL() {
		return PORTAL;
	}


	public String getCODIGO_POSTAL() {
		return CODIGO_POSTAL;
	}


	public String getPOBLACION() {
		return POBLACION;
	}


	public String getTELEFONO1() {
		return TELEFONO1;
	}


	public String getTELEFONO2() {
		return TELEFONO2;
	}


	public String getTELEFONO3() {
		return TELEFONO3;
	}


	public String getDIAS1() {
		return DIAS1;
	}


	public String getDIAS2() {
		return DIAS2;
	}


	public String getDIAS3() {
		return DIAS3;
	}


	public String getDIAS4() {
		return DIAS4;
	}


	public String getHORARIO1() {
		return HORARIO1;
	}


	public String getHORARIO2() {
		return HORARIO2;
	}


	public String getHORARIO3() {
		return HORARIO3;
	}


	public String getHORARIO4() {
		return HORARIO4;
	}


	public String getOBSERVACIONES() {
		return OBSERVACIONES;
	}


	public String getPPH() {
		return PPH;
	}


	public String getCAPITAL() {
		return CAPITAL;
	}


	public String getORDEN_SERVICIO() {
		return ORDEN_SERVICIO;
	}


	public String getPOSTAL_CLASIFICACION() {
		return POSTAL_CLASIFICACION;
	}


	public String getIND_BUCODENTAL() {
		return IND_BUCODENTAL;
	}


	public String getIND_NO_PARTOS() {
		return IND_NO_PARTOS;
	}


	public String getTIPO_PROV() {
		return TIPO_PROV;
	}


	public String getNRO_PROV() {
		return NRO_PROV;
	}


	public String getNRO_CONS() {
		return NRO_CONS;
	}


	public String getZONA() {
		return ZONA;
	}


	public String getDISTRITO() {
		return DISTRITO;
	}


	public String getTIPO_MOV() {
		return TIPO_MOV;
	}


	public String getCOD_PREFERENCIA() {
		return COD_PREFERENCIA;
	}


	public String getHOR_EXT1() {
		return HOR_EXT1;
	}


	public String getHOR_EXT2() {
		return HOR_EXT2;
	}


	public String getHOR_EXT3() {
		return HOR_EXT3;
	}


	public String getHOR_EXT4() {
		return HOR_EXT4;
	}


	public String getAUDIT_FEC_ALTA() {
		return AUDIT_FEC_ALTA==null?"NULL":"'"+this.AUDIT_FEC_ALTA+"'";
	}


	public String getAUDIT_FEC_MODIFICACION() {
		return AUDIT_FEC_MODIFICACION==null?"NULL":"'"+this.AUDIT_FEC_MODIFICACION+"'";
	}


	public String getAUDIT_COD_USUARIO() {
		return AUDIT_COD_USUARIO;
	}


	public String getPOBLACION_COMERCIAL() {
		return POBLACION_COMERCIAL;
	}


	public String getIND_POB_COM() {
		return IND_POB_COM;
	}


	public String getCOD_IDIOMA1() {
		return COD_IDIOMA1;
	}


	public String getCOD_IDIOMA2() {
		return COD_IDIOMA2;
	}


	public String getCOD_IDIOMA3() {
		return COD_IDIOMA3;
	}


	public String getCOD_IDIOMA4() {
		return COD_IDIOMA4;
	}


	public String getCOD_IDIOMA5() {
		return COD_IDIOMA5;
	}


	public String getCOD_IDIOMA6() {
		return COD_IDIOMA6;
	}


	public String getCOD_IDIOMA7() {
		return COD_IDIOMA7;
	}


	public String getCOD_IDIOMA8() {
		return COD_IDIOMA8;
	}


	public String getCOD_IDIOMA9() {
		return COD_IDIOMA9;
	}


	public String getCOD_IDIOMA10() {
		return COD_IDIOMA10;
	}


	public String getCabecera() {
		return cabecera;
	}


	public SimpleDateFormat getSdfEntrada() {
		return sdfEntrada;
	}


	public SimpleDateFormat getSdfSalida() {
		return sdfSalida;
	}

	
}

