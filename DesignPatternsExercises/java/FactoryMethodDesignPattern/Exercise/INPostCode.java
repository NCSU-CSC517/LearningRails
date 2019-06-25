public class INPostCode implements PostCode{
	private String postalCode;

	public INPostCode(String postalCode) {
		if(!__________(5)__________(postalCode)) {
    		throw new IllegalArgumentException("Invalid postcode");
    	}
    	this.postalCode = postalCode;
    }

	@Override
	public boolean isValidPostalCode(String postalCode) {
		return postalCode.matches("[0-9]{6}");
	}

	@Override
	public String getPostalCode() {
		return  postalCode;
	}
}
