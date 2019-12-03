package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class JsonElementsTests extends Core {

    @Test
    public void testJsonObject() {
        Gassert.verifyJsonObject(json);
    }

    @Test
    public void testJsonObjectWithMessage() {
        Gassert.verifyJsonObject(json.get("object"), "Test Failed!");
    }

    @Test
    public void testJsonObjectAgainstJsonObject() {
        Gassert.verifyJsonObject(json, json);
    }

    @Test
    public void testJsonObjectAgainstJsonObjectWithMessage() {
        Gassert.verifyJsonObject(json, json, "Test failed!");
    }

    @Test
    public void testJsonObjectByKey() {
        Gassert.verifyJsonObject(json, "object");
    }

    @Test
    public void testJsonObjectByKeyWithMessage() {
        Gassert.verifyJsonObject(json, "object", "Test failed!");
    }

    @Test
    public void testJsonArray() {
        Gassert.verifyJsonArray(json.getAsJsonArray("objectsArray"));
    }

    @Test
    public void testJsonArrayWithMessage() {
        Gassert.verifyJsonArray(json.getAsJsonArray("objectsArray"), "Test failed!");
    }

    @Test
    public void testJsonArrayAgainstJsonArray() {
        Gassert.verifyJsonArray(json.getAsJsonArray("objectsArray"),
                json.getAsJsonArray("objectsArray"));
    }

    @Test
    public void testJsonArrayAgainstJsonArrayWithMessage() {
        Gassert.verifyJsonArray(json.getAsJsonArray("objectsArray"),
                json.getAsJsonArray("objectsArray"),"Test failed!");
    }

    @Test
    public void testJsonArrayByKey() {
        Gassert.verifyJsonArray(json, "primitivesArray");
    }

    @Test
    public void testJsonArrayByKeyWithMessage() {
        Gassert.verifyJsonArray(json, "primitivesArray", "Test failed!");
    }

    @Test
    public void testJsonPrimitive() {
        Gassert.verifyJsonPrimitive(json.getAsJsonPrimitive("number"));
    }

    @Test
    public void testJsonPrimitiveWithMessage() {
        Gassert.verifyJsonPrimitive(json.getAsJsonPrimitive("number"), "Test failed!");
    }

    @Test
    public void testJsonPrimitiveAgainstJsonPrimitive() {
        Gassert.verifyJsonPrimitive(json.getAsJsonPrimitive("number"),
                json.getAsJsonPrimitive("number"));
    }

    @Test
    public void testJsonPrimitiveAgainstJsonPrimitiveWithMessage() {
        Gassert.verifyJsonPrimitive(json.getAsJsonPrimitive("number"),
                json.getAsJsonPrimitive("number"),"Test failed!");
    }

    @Test
    public void testJsonPrimitiveByKey() {
        Gassert.verifyJsonPrimitive(json, "number");
    }

    @Test
    public void testJsonPrimitiveByKeyWithMessage() {
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

    @Test
    public void testJsonElement() {
        Gassert.verifyJsonElement(json, "null");
    }

    @Test
    public void testJsonElementWithMessage() {
        Gassert.verifyJsonElement(json, "null", "Test failed!");
    }
}
