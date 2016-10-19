package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {
    private int value;

    public NaturalNumber(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
    	String[] textValues = this.getTextValues();
        if (this.value < textValues.length) {
            return textValues[this.value];
        } else {
            return "???";
        }
    }

    public abstract String[] getTextValues();
    
	@Override
	public String toString() {
		return getTextValue();
	}

}
