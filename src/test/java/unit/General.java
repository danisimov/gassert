package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class General extends Base {
    @Test
    public void testJsonObject() {
        Gassert.verifyJsonObject(json, "object");
    }

    @Test
    public void testJsonArray() {
        Gassert.verifyJsonArray(json, "primitivesArray");
    }

    @Test
    public void testJsonPrimitive() {
        Gassert.verifyJsonPrimitive(json, "number");
    }

    @Test
    public void testJsonNull() {
        Gassert.verifyJsonNull(json, "null");
    }
}
