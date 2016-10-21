package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextComposite extends Componente{
	
	List<Componente> componentes;
	
	
	public TextComposite(){
		super(true);
		componentes = new ArrayList<Componente>();
	}
	
	public void add(Componente componente){
		componentes.add(componente);
	}
	
	@Override
	public String dibujar(boolean mayuscula){
		String dibujarComponentes = "";
		
		for(Componente componente: componentes){
			dibujarComponentes += componente.dibujar(mayuscula);
		}
		dibujarComponentes += fin();
		
		return dibujarComponentes;
	}
	
	@Override
	public void remove(Componente c) {
        componentes.remove(c);
    }
	
	public abstract String fin();
}
