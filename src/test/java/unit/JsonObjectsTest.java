package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class JsonObjectsTest extends Core {

    @Test
    public void testJsonObjectSize() {
        Gassert.verifyJsonObject(json, "object", 1);
    }

    @Test
    public void testJsonObjectWithValue() {
        Gassert.verifyJsonObject(json, "object", json.getAsJsonObject("object"));
    }

    @Test
    public void testJsonObjectWithValueAndMessage() {
        Gassert.verifyJsonObject(json, "object", json.getAsJsonObject("object"), "Test failed!");
    }
}
