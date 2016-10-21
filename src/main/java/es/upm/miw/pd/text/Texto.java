package es.upm.miw.pd.text;

public class Texto extends TextComposite{

	@Override
	public void add(Componente c) {
		if(c.textComposite())
			super.add(c);
		else
			throw new UnsupportedOperationException();
		
	}

	@Override
	public String dibujar(boolean mayuscula) {
		return super.dibujar(mayuscula);
	}

	@Override
	public void remove(Componente c) {
		if(!c.textComposite())
			super.remove(c);
		
	}

	@Override
	public String fin(){
		return "---o---\n";
	}

}
