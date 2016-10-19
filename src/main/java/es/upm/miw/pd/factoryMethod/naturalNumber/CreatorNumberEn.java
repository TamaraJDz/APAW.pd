package es.upm.miw.pd.factoryMethod.naturalNumber;

public class CreatorNumberEn extends CreatorNumber{

	
	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEn(value);
	}

}
