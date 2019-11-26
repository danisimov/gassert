package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class CoreTests extends TestCore {

    @Test
    public void testJsonObject() {
        Gassert.verifyJsonObject(json, "object");
    }

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

    @Test
    public void testJsonArrayWithValue() {
        Gassert.verifyJsonArray(json, "primitivesArray", json.getAsJsonArray("primitivesArray"));
    }

    @Test
    public void testJsonArrayWithValueAndMessage() {
        Gassert.verifyJsonArray(json, "primitivesArray", json.getAsJsonArray("primitivesArray"),
                "Test failed!");
    }

    @Test
    public void testJsonPrimitive() {
        Gassert.verifyJsonPrimitive(json, "number");
    }

    @Test
    public void testJsonPrimitiveWithValue() {
        Gassert.verifyJsonPrimitive(json, "number", json.get("number").getAsJsonPrimitive());
    }

    @Test
    public void testJsonPrimitiveWithValueAndMessage() {
        Gassert.verifyJsonPrimitive(json, "number", json.get("number").getAsJsonPrimitive(), "Test failed!");
    }

    @Test
    public void testJsonNull() {
        Gassert.verifyJsonNull(json, "null");
    }

    @Test
    public void testJsonNullWithMessage() {
        Gassert.verifyJsonNull(json, "null", "Test failed!");
    }

    @Test
    public void testJsonElement() {
        Gassert.verifyJsonElement(json, "null");
    }
}
