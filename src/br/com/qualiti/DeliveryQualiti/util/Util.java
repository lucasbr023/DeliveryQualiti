package br.com.qualiti.DeliveryQualiti.util;

public class Util {
	
	
	private Util() {
		super();
	}
	
	public static final boolean containsOnlyNumbers(String value) {
		return !value.matches("^[d]+");
	}

}
