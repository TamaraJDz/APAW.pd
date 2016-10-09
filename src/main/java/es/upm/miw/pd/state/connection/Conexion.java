package es.upm.miw.pd.state.connection;

public class Conexion {
	private Estado estado;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.estado = new Cerrado();
	}

	protected void setEstado(Estado estado){
		this.estado = estado;
	}
	
	public void abrir(Conexion this){
		this.estado.abrir(this);
	}
	
	public void cerrar(Conexion this){
		this.estado.cerrar(this);
	}
	
	public void parar(Conexion this){
		this.estado.parar(this);
	}
	
	public void iniciar(Conexion this){
		this.estado.iniciar(this);
	}
	
	public void recibir(Conexion this, int respuesta){
		this.estado.recibir(this, respuesta);
	}
	
	public void enviar(Conexion conexion, String msg) {
		this.estado.enviar(this, msg);
	}
	
	public Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return this.estado;
	}

}
