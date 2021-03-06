import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UKPostCode implements PostCode {
    private String postalCode;

    public UKPostCode(String postalCode) {
        // if (!__________(7)__________(postalCode)) {
        if (!isValidPostalCode(postalCode)) {
            throw new IllegalArgumentException("Invalid postcode");
        }
        this.postalCode = postalCode;
        System.out.println("Creating instance of UKPostCode:");
    }

    @Override
    public boolean isValidPostalCode(String postalCode) {
        String pattern = "^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) [0-9][ABD-HJLNP-UW-Z]{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(postalCode);
        return m.matches();
    }

    @Override
    public String getPostalCode() {
        return postalCode;
    }
}
