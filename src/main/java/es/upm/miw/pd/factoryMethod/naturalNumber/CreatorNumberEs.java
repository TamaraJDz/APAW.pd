package es.upm.miw.pd.factoryMethod.naturalNumber;

public class CreatorNumberEs extends CreatorNumber{

	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEs(value);
	}

}
