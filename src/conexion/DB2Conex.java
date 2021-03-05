package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB2Conex {

	private String nom_server;
	private String puerto;
	private String BD;
	private String user;
	private String pass;
	ResultSet resultado = null;
	Connection conn = null;
	Statement stmt = null;
	boolean verbose = false;

	public void miLog(String cad) {
		if (verbose)
			System.out.println(cad);
	}

	public DB2Conex(String nserv, String pu, String BaseD, String usuario,
			String passw) {
		nom_server = nserv;
		puerto = pu;
		BD = BaseD;
		user = usuario;
		pass = passw;
	}

	public DB2Conex(String usuario, String passw) {
		nom_server = "10.28.120.1";
		puerto = "446";
		BD = "LOC1";
		user = usuario;
		pass = passw;
	}

	public void cierraConex() throws SQLException {
		resultado.close();
		stmt.close();
		conn.close();
	}

	public void ejecutaSQLNoConex(String sentencia)
			throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:db2://" + nom_server + ":" + puerto + "/"
				+ BD;

		miLog("Ejecutando " + sentencia + "en " + databaseURL);

		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Properties properties = new Properties();
		properties.put("user", user);
		properties.put("password", pass);
		properties.put("retreiveMessagesFromServerOnGetMessage", "true");
		if (conn == null)
			conn = DriverManager.getConnection(databaseURL, properties);
		stmt = null;
		stmt = conn.createStatement();
		String sql;
		sql = sentencia;
		resultado = stmt.executeQuery(sql);
	}

	public void ejecutaSQL(String sentencia) throws ClassNotFoundException,
			SQLException {
		String databaseURL = "jdbc:db2://" + nom_server + ":" + puerto + "/"
				+ BD;

		miLog("Ejecutando " + sentencia + "en " + databaseURL);

		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Properties properties = new Properties();
		properties.put("user", user);
		properties.put("password", pass);
		properties.put("retreiveMessagesFromServerOnGetMessage", "true");
		conn = DriverManager.getConnection(databaseURL, properties);
		stmt = null;
		stmt = conn.createStatement();
		String sql;
		sql = sentencia;
		resultado = stmt.executeQuery(sql);

	}

	public void ejecutaUpdateSQL(String sentencia)
			throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:db2://" + nom_server + ":" + puerto + "/"
				+ BD;

		miLog("Ejecutando " + sentencia + "en " + databaseURL);

		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Properties properties = new Properties();
		properties.put("user", user);
		properties.put("password", pass);
		properties.put("retreiveMessagesFromServerOnGetMessage", "true");
		conn = DriverManager.getConnection(databaseURL, properties);
		stmt = null;
		stmt = conn.createStatement();
		String sql;
		sql = sentencia;

		stmt.executeUpdate(sql);
		// resultado = stmt.executeQuery(sql);

	}

	public void ejecutaUpdateSQLNoConex(String sentencia)
			throws ClassNotFoundException, SQLException {
		String databaseURL = "jdbc:db2://" + nom_server + ":" + puerto + "/"
				+ BD;

		miLog("Ejecutando " + sentencia + "en " + databaseURL);

		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Properties properties = new Properties();
		properties.put("user", user);
		properties.put("password", pass);
		properties.put("retreiveMessagesFromServerOnGetMessage", "true");
		if (conn == null)
			conn = DriverManager.getConnection(databaseURL, properties);
		stmt = null;
		stmt = conn.createStatement();
		String sql;
		sql = sentencia;

		
		//stmt.executeUpdate(sql);
		 stmt.executeUpdate(sql);
		//System.out.println(resultado);
	}
	
	

	public String getNom_server() {
		return this.nom_server;
	}

	public void setNom_server(String _nom_server) {
		this.nom_server = _nom_server;
	}

	public String getPuerto() {
		return this.puerto;
	}

	public void setPuerto(String _puerto) {
		this.puerto = _puerto;
	}

	public String getBD() {
		return this.BD;
	}

	public void setBD(String _bD) {
		this.BD = _bD;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String _user) {
		this.user = _user;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String _pass) {
		this.pass = _pass;
	}

	public ResultSet getResultado() {
		return this.resultado;
	}

	public void setResultado(ResultSet _resultado) {
		this.resultado = _resultado;
	}

	public boolean isVerbose() {
		return this.verbose;
	}

	public void setVerbose(boolean _verbose) {
		this.verbose = _verbose;
	}

}
