package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class JsonNull extends Core {

    @Test
    public void testJsonNull() {
        Gassert.verifyJsonNull(json.get("null"));
    }

    @Test
    public void testJsonNullWithMessage() {
        Gassert.verifyJsonNull(json.get("null"), "Test Failed!");
    }

    @Test
    public void testJsonNullByKey() {
        Gassert.verifyJsonNull(json, "null");
    }

    @Test
    public void testJsonNullByKeyWithMessage() {
        Gassert.verifyJsonNull(json, "null", "Test failed!");
    }
}
