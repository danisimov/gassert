package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class Json extends Base{

    @Test
    public void testJsonObject() {
        Gassert.verifyJsonObject(json, "object", json.getAsJsonObject("object"));
    }

    @Test
    public void testJsonObjectSize() {
        Gassert.verifyJsonObject(json, "object", 1);
    }

    @Test
    public void testJsonArraySize() {
        Gassert.verifyJsonArray(json, "primitivesArray", 2);
    }

    @Test
    public void testJsonArray() {
        Gassert.verifyJsonArray(json, "primitivesArray", json.getAsJsonArray("primitivesArray"));
    }

    @Test
    public void testJsonPrimitive() {
        Gassert.verifyJsonPrimitive(json, "number", json.get("number").getAsJsonPrimitive());
    }

    @Test
    public void testJsonNull() {
        Gassert.verifyJsonNull(json, "null", json.get("null").getAsJsonNull());
    }

    @Test
    public void testJsonObjectsInJsonArray() {
        Gassert.verifyJsonArray(json, "objectsArray", json.getAsJsonArray("objectsArray"));
        Gassert.verifyJsonObjectsInJsonArray(json.getAsJsonArray("objectsArray"));
    }

    @Test
    public void testJsonArraysInJsonArray() {
        Gassert.verifyJsonArray(json, "arraysArray", json.getAsJsonArray("arraysArray"));
        Gassert.verifyJsonArraysInJsonArray(json.getAsJsonArray("arraysArray"));
    }

    @Test
    public void testJsonPrimitivesInJsonArray() {
        Gassert.verifyJsonArray(json, "primitivesArray", json.getAsJsonArray("primitivesArray"));
        Gassert.verifyJsonPrimitivesInJsonArray(json.getAsJsonArray("primitivesArray"));
    }

    @Test
    public void testJsonNullsInJsonArray() {
        Gassert.verifyJsonArray(json, "nullsArray", json.getAsJsonArray("nullsArray"));
        Gassert.verifyJsonNullsInJsonArray(json.getAsJsonArray("nullsArray"));
    }
}
