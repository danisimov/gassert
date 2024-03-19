package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class JsonElementsTests extends Core {

    @Test
    public void testJsonElement() {
        Gassert.verifyJsonElement(json, "null");
    }

    @Test
    public void testJsonElementWithMessage() {
        Gassert.verifyJsonElement(json, "null", "Test failed!");
    }

    @Test
    public void testObjectJsonElementWithValue() {
        Gassert.verifyJsonElement(json, "object", json.get("object"));
    }

    @Test
    public void testObjectJsonElementWithValueAndMessage() {
        Gassert.verifyJsonElement(json, "object", json.get("object"), "Test failed!");
    }

    @Test
    public void testArrayJsonElementWithValue() {
        Gassert.verifyJsonElement(json, "objectsArray", json.get("objectsArray"));
    }

    @Test
    public void testArrayJsonElementWithValueAndMessage() {
        Gassert.verifyJsonElement(json, "objectsArray", json.get("objectsArray"), "Test failed!");
    }

    @Test
    public void testPrimitiveJsonElementWithValue() {
        Gassert.verifyJsonElement(json, "number", json.get("number"));
    }

    @Test
    public void testPrimitiveJsonElementWithValueAndMessage() {
        Gassert.verifyJsonElement(json, "number", json.get("number"), "Test failed!");
    }

    @Test
    public void testNullJsonElementWithValue() {
        Gassert.verifyJsonElement(json, "null", json.get("null"));
    }

    @Test
    public void testNullJsonElementWithValueAndMessage() {
        Gassert.verifyJsonElement(json, "null", json.get("null"), "Test failed!");
    }
}
