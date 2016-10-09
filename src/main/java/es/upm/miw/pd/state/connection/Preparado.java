package es.upm.miw.pd.state.connection;

public class Preparado implements IEstado{

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(this);
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new Cerrado());
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(this);
		
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new Esperando());
		
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new Parado());
		
	}


	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Accion no permitida... ");
		
	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}
	
	

}
