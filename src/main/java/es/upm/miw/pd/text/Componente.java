package es.upm.miw.pd.text;

public abstract class Componente{
	
	private boolean textComposite;
	
	public Componente(boolean textComposite){
		this.textComposite = textComposite;
	}
	
	public abstract String dibujar(boolean mayuscula);
	
	public abstract void add(Componente c);
	
	public abstract void remove(Componente c);
	
	public boolean textComposite(){
		return textComposite;
	}

}
