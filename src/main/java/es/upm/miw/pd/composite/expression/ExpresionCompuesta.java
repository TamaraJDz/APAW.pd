package es.upm.miw.pd.composite.expression;


public abstract class ExpresionCompuesta extends Expresion{
	
	private Expresion expresion1;
	
	private Expresion expresion2;
	

	public ExpresionCompuesta(Expresion expresion1, Expresion expresion2) {
		super();
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}
	
	protected Expresion getExpresion1(){
		return this.expresion1;
	}

	protected Expresion getExpresion2(){
		return this.expresion2;
	}

	public abstract char operando();
	
	@Override
	public String toString(){
		return "(" + this.expresion1.toString() + operando() + this.expresion2.toString() + ")";
	}
	
	

}
