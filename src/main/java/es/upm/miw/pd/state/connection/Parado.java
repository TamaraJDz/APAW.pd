package es.upm.miw.pd.state.connection;

public class Parado extends EstadoAbstract{

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new Preparado());
		
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(this);
		
	}
	
	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Accion no permitida... ");
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Accion no permitida... ");
		
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Accion no permitida... ");
		
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Accion no permitida... ");
		
	}

	

}
