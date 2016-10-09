package es.upm.miw.pd.state.connection;

public class Esperando extends Estado{

	
	@Override
	public void recibir(Conexion conexion, int respuesta) {
		conexion.getLink().recibir(respuesta);
		if(respuesta == 0)
			conexion.setEstado(new Preparado());
		else if(respuesta >= 0)
			conexion.setEstado(new Cerrado());
		else
			assert false : "estado imposible";
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


}
