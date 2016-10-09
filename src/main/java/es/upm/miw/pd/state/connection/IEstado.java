package es.upm.miw.pd.state.connection;

public interface IEstado {
	
	
	public void abrir(Conexion conexion);
	
	public void cerrar(Conexion conexion);

	public void iniciar(Conexion conexion);

	public void parar(Conexion conexion);

	public void enviar(Conexion conexion, String msg);

	public void recibir(Conexion conexion, int respuesta);

	public Estado getEstado();
}
