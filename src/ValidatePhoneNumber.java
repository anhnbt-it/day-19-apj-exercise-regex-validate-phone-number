import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/31/2020
 * Time: 7:15 AM
 */
public class ValidatePhoneNumber {
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile("\\(\\d{2}\\)-\\(\\d{10}\\)");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
