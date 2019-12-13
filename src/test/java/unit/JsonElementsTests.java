package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class JsonElementsTests extends Core {

    @Test
    public void testJsonElement() {
        Gassert.verifyJsonElement(json, "nul1l");
    }

    @Test
    public void testJsonElementWithMessage() {
        Gassert.verifyJsonElement(json, "null", "Test failed!");
    }
}
