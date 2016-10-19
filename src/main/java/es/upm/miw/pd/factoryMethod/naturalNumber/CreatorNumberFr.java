package es.upm.miw.pd.factoryMethod.naturalNumber;

public class CreatorNumberFr extends CreatorNumber{

	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberFr(value);
	}

}
