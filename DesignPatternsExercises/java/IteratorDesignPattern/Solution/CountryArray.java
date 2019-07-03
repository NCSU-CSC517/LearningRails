import java.util.Arrays;
import java.util.Iterator;

public class CountryArray implements CountryIterable {
	private Country[] countryArray = new Country[3];

	public CountryArray() {
		countryArray[0] = new Country("Australia",297,23);
		countryArray[1] = new Country("Germany",14,81);
		countryArray[2] = new Country("France",25,66);
	}

	@Override
	public Iterator getIterator() {
		// return __________(3)__________.asList(countryArray).iterator();
		return Arrays.asList(countryArray).iterator();
	}
}
