package chipcard;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chippr {
	private String NIF;
	private String COD_PROVE_MATRIZ;
	private String COD_MAT_OR;
	private String COD_PROVE;
	private String NRO_COLEGIADO_OMC;					
	private String ESTADO;
	private String FECHA_ENVIO;
	private String FECHA_BAJA;
	private String FECHA_CHIPCARD;
	private String IND_VIDEO_ASISA;
	private String IND_VIDEO_CHIPCARD;
	private String cabecera;
	SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd");

	
	public Chippr(String lineaCsv, String cabecera) {
		String [] partes;

		try {
			partes = lineaCsv.split(";");
			this.NIF = partes[0];
			this.COD_PROVE_MATRIZ = (partes[1]);
			this.COD_MAT_OR = (partes[2]);
			this.COD_PROVE = (partes[3]);
			this.NRO_COLEGIADO_OMC = (partes[4]);
			this.ESTADO = partes[5];
			
			this.FECHA_ENVIO = obtenerFecha(partes[6]);
			this.FECHA_BAJA = obtenerFecha(partes[7]);
			this.FECHA_CHIPCARD = obtenerFecha(partes[8]);
			
			this.IND_VIDEO_ASISA = partes[9];
			this.IND_VIDEO_CHIPCARD = partes[10];
			this.cabecera = cabecera;

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	
	
	public String getESTADO() {
		return ESTADO;
	}
	public void setESTADO(String eSTADO) {
		ESTADO = eSTADO;
	}
	
	public String getIND_VIDEO_ASISA() {
		return IND_VIDEO_ASISA;
	}
	public void setIND_VIDEO_ASISA(String iND_VIDEO_ASISA) {
		IND_VIDEO_ASISA = iND_VIDEO_ASISA;
	}
	public String getIND_VIDEO_CHIPCARD() {
		return IND_VIDEO_CHIPCARD;
	}
	public void setIND_VIDEO_CHIPCARD(String iND_VIDEO_CHIPCARD) {
		IND_VIDEO_CHIPCARD = iND_VIDEO_CHIPCARD;
	}
	
	public String getCOD_PROVE_MATRIZ() {
		return COD_PROVE_MATRIZ;
	}

	public void setCOD_PROVE_MATRIZ(String cOD_PROVE_MATRIZ) {
		COD_PROVE_MATRIZ = cOD_PROVE_MATRIZ;
	}

	public String getCOD_MAT_OR() {
		return COD_MAT_OR;
	}

	public void setCOD_MAT_OR(String cOD_MAT_OR) {
		COD_MAT_OR = cOD_MAT_OR;
	}

	public String getCOD_PROVE() {
		return COD_PROVE;
	}

	public void setCOD_PROVE(String cOD_PROVE) {
		COD_PROVE = cOD_PROVE;
	}

	public String getNRO_COLEGIADO_OMC() {
		return NRO_COLEGIADO_OMC;
	}

	public void setNRO_COLEGIADO_OMC(String nRO_COLEGIADO_OMC) {
		NRO_COLEGIADO_OMC = nRO_COLEGIADO_OMC;
	}

	public String getFECHA_ENVIO() {
		return FECHA_ENVIO==null?"NULL":"'"+this.FECHA_ENVIO+"'";
	}

	public void setFECHA_ENVIO(String fECHA_ENVIO) {
		FECHA_ENVIO = fECHA_ENVIO;
	}

	public String getFECHA_BAJA() {
		return FECHA_BAJA==null?"NULL":"'"+this.FECHA_BAJA+"'";
	}

	public void setFECHA_BAJA(String fECHA_BAJA) {
		FECHA_BAJA = fECHA_BAJA;
	}

	public String getFECHA_CHIPCARD() {
		return FECHA_CHIPCARD==null?"NULL":"'"+this.FECHA_CHIPCARD+"'";
	}

	public void setFECHA_CHIPCARD(String fECHA_CHIPCARD) {
		FECHA_CHIPCARD = fECHA_CHIPCARD;
	}

	private String obtenerFecha(String fecha) {
		String fechaFormato = null;
		try {
			fechaFormato = sdfSalida.format(sdfEntrada.parse(fecha));
		} catch (Exception e) {
		}

		return fechaFormato;
	}

	@Override
	public String toString() {
		return cabecera + "'" + NIF + "', " + COD_PROVE_MATRIZ + ", " + COD_MAT_OR
				+ ", " + COD_PROVE + ", '" + NRO_COLEGIADO_OMC + "', '" + ESTADO
				+ "', " + getFECHA_ENVIO() + ", " + getFECHA_BAJA() + ", " + getFECHA_CHIPCARD()
				+ ", '" + IND_VIDEO_ASISA + "', '" + IND_VIDEO_CHIPCARD + "'); \r\n";
	}
	
	
}

