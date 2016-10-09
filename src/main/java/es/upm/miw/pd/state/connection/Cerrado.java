package es.upm.miw.pd.state.connection;

public class Cerrado extends EstadoAbstract{
	
	@Override
	public void cerrar(Conexion conexion){
		conexion.setEstado(this);
	}
	
	@Override
	public void abrir(Conexion conexion){
		conexion.setEstado(new Preparado());
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Accion no permitida... ");
		
	}

	@Override
	public void parar(Conexion conexion) {
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

	@Override
	public Estado getEstado() {
		return Estado.CERRADO;
	}
}
