package es.upm.miw.pd.factoryMethod.naturalNumber;


public class NumbersManager {
	private NaturalNumber naturalNumber;
	
	private CreatorNumber creatorNumber;
	
	
    public void setCreator(CreatorNumber creator) {
        this.creatorNumber = creator;
    }

    public void createNaturalNumber(int value) {
        this.naturalNumber = this.creatorNumber.createNaturalNumber(value);
    }

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }
}
