package tsreddel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tsreddel {
	private String COD_RED_PREST;
	private String COD_DELEGACION;
	private String DES_RED_PREST;
	private String COD_RED_BASE;
	private String IND_ALTA_AUTO;
	private String IND_ORIGEN;
	private String FECHA_DESDE;
	private String FECHA_HASTA;
	private String AUDIT_FEC_ALTA;
	private String AUDIT_FEC_MODIFICACION;
	private String AUDIT_COD_USUARIO;
	private String cabecera;
	SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd");

	
	public Tsreddel(String lineaCsv, String cabecera) {
		String [] partes;

		try {
			partes = lineaCsv.split(";");
			
			this.COD_RED_PREST = partes [0];
			this.COD_DELEGACION = partes [1];
			this.DES_RED_PREST = partes [2];
			this.COD_RED_BASE = partes [3];
			this.IND_ALTA_AUTO = partes [4];
			this.IND_ORIGEN = partes [5];
			this.FECHA_DESDE = obtenerFecha(partes [6]);
			this.FECHA_HASTA = obtenerFecha(partes [7]);
			this.AUDIT_FEC_ALTA = obtenerFecha(partes [8]);
			this.AUDIT_FEC_MODIFICACION = obtenerFecha(partes [9]);
			this.AUDIT_COD_USUARIO = partes [10];
			
			this.cabecera = cabecera;

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

	@Override
	public String toString() {
		return getCabecera() + " " + getCOD_RED_PREST() + ", " + getCOD_DELEGACION() + ", '" + getDES_RED_PREST() + "', " + getCOD_RED_BASE()
				+ ", '" + getIND_ALTA_AUTO() + "', '" + getIND_ORIGEN() + "', " + getFECHA_DESDE() + ", " + getFECHA_HASTA()
				+ ", " + getAUDIT_FEC_ALTA() + ", " + getAUDIT_FEC_MODIFICACION() + ", '" + getAUDIT_COD_USUARIO() + "'); \r\n";
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



	public String getCOD_RED_PREST() {
		return COD_RED_PREST;
	}



	public String getCOD_DELEGACION() {
		return COD_DELEGACION;
	}



	public String getDES_RED_PREST() {
		return DES_RED_PREST;
	}



	public String getCOD_RED_BASE() {
		return COD_RED_BASE;
	}



	public String getIND_ALTA_AUTO() {
		return IND_ALTA_AUTO;
	}



	public String getIND_ORIGEN() {
		return IND_ORIGEN;
	}



	public String getFECHA_DESDE() {
		return FECHA_DESDE==null?"NULL":"'"+this.FECHA_DESDE+"'";
	}



	public String getFECHA_HASTA() {
		return FECHA_HASTA==null?"NULL":"'"+this.FECHA_HASTA+"'";
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

