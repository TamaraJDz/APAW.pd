package es.upm.miw.pd.composite.expression;

public class Suma extends ExpresionCompuesta{
	
	public Suma (Expresion expresion1, Expresion expresion2){
		super(expresion1, expresion2);
	}
	
	@Override
	public int operar(){
		return getExpresion1().operar() + getExpresion2().operar();
	}
	
	@Override
	public char operando() {
		return '+';
	}
}
