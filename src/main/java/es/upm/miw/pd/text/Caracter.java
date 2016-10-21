package es.upm.miw.pd.text;

public class Caracter extends Componente {

	private char valor;

	public Caracter(char valor) {
		super(false);
		this.valor = valor;
	}

	@Override
	public String dibujar(boolean mayuscula) {
		String caracter = String.valueOf(valor);
		if (mayuscula) {
			caracter = caracter.toUpperCase();
		}
		return caracter;
	}

	@Override
	public void add(Componente c) {
	}

	@Override
	public void remove(Componente c) {
	}
}
