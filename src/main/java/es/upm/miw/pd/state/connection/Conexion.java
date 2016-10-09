package es.upm.miw.pd.state.connection;

public class Conexion {
	private IEstado estado;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.estado = new Cerrado();
	}

	protected void setEstado(IEstado estado){
		this.estado = estado;
	}
	
	public void abrir(){
		this.estado.abrir(this);
	}
	
	public void cerrar(){
		this.estado.cerrar(this);
	}
	
	public void parar(){
		this.estado.parar(this);
	}
	
	public void iniciar(){
		this.estado.iniciar(this);
	}
	
	public void recibir(int respuesta){
		this.estado.recibir(this, respuesta);
	}
	
	public void enviar(String msg) {
		this.estado.enviar(this, msg);
	}
	
	public Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return estado.getEstado();
	}


}
