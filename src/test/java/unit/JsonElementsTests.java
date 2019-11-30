package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class JsonElementsTests extends Core {

    @Test
    public void testJsonObject() {
        Gassert.verifyJsonObject(json, "object");
    }

    @Test
    public void testJsonObjectWithMessage() {
        Gassert.verifyJsonObject(json, "object", "Test failed!");
    }

    @Test
    public void testJsonArray() {
        Gassert.verifyJsonArray(json, "primitivesArray");
    }

    @Test
    public void testJsonArrayWithMessage() {
        Gassert.verifyJsonArray(json, "primitivesArray", "Test failed!");
    }

    @Test
    public void testJsonPrimitive() {
        Gassert.verifyJsonPrimitive(json, "number");
    }

    @Test
    public void testJsonPrimitiveWithMessage() {
        Gassert.verifyJsonPrimitive(json, "number", "Test failed!");
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

    @Test
    public void testJsonElementWithMessage() {
        Gassert.verifyJsonElement(json, "null", "Test failed!");
    }
}
