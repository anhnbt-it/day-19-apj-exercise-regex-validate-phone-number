import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/31/2020
 * Time: 7:16 AM
 */
class ValidatePhoneNumberTest {
    @Test
    @DisplayName("(84)-(0978489648)")
    void testCaseOne() {
        String regex = "(84)-(0978489648)";
        boolean actual = ValidatePhoneNumber.validate(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("(a8)-22222222")
    void testCaseTwo() {
        String regex = "(a8)-22222222";
        boolean actual = ValidatePhoneNumber.validate(regex);
        assertFalse(actual);
    }
}