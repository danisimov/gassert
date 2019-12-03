package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class JsonArraysTests extends Core {

    @Test
    public void testJsonArraySize() {
        Gassert.verifyJsonArray(json, "primitivesArray", 2);
    }

    @Test
    public void testJsonArraySizeWithMessage() {
        Gassert.verifyJsonArray(json, "primitivesArray", 2, "Test failed!");
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
    public void testJsonObjectsInJsonArray() {
        Gassert.verifyJsonObjectsInJsonArray(json.getAsJsonArray("objectsArray"));
    }

    @Test
    public void testJsonObjectsInJsonArrayWithMessage() {
        Gassert.verifyJsonObjectsInJsonArray(json.getAsJsonArray("objectsArray"), "Test failed!");
    }

    @Test
    public void testJsonObjectInJsonArray() {
        Gassert.verifyJsonObjectInJsonArray(json.getAsJsonArray("objectsArray"),
                json.getAsJsonArray("objectsArray").get(0).getAsJsonObject());
    }

    @Test
    public void testJsonObjectInJsonArrayByIndex() {
        Gassert.verifyJsonObjectInJsonArray(json.getAsJsonArray("objectsArray"),
                json.getAsJsonArray("objectsArray").get(0).getAsJsonObject(), 0);
    }

    @Test
    public void testJsonObjectInJsonArrayByIndexWithKey() {
        Gassert.verifyJsonObjectInJsonArray(json.getAsJsonArray("objectsArray"),
                json.getAsJsonArray("objectsArray").get(0).getAsJsonObject(), 0, "Test failed!");
    }

    @Test
    public void testJsonArrayInJsonArray() {
        Gassert.verifyJsonArrayInJsonArray(json.getAsJsonArray("arraysArray"),
                json.getAsJsonArray("arraysArray").get(0).getAsJsonArray());
    }

    @Test
    public void testJsonArrayInJsonArrayByIndex() {
        Gassert.verifyJsonArrayInJsonArray(json.getAsJsonArray("arraysArray"),
                json.getAsJsonArray("arraysArray").get(0).getAsJsonArray(), 0);
    }

    @Test
    public void testJsonArrayInJsonArrayByIndexWithKey() {
        Gassert.verifyJsonArrayInJsonArray(json.getAsJsonArray("arraysArray"),
                json.getAsJsonArray("arraysArray").get(0).getAsJsonArray(), 0, "Test failed!");
    }

    @Test
    public void testJsonPrimitiveInJsonArray() {
        Gassert.verifyJsonPrimitiveInJsonArray(json.getAsJsonArray("primitivesArray"),
                json.getAsJsonArray("primitivesArray").get(0).getAsJsonPrimitive());
    }

    @Test
    public void testJsonPrimitiveInJsonArrayByIndex() {
        Gassert.verifyJsonPrimitiveInJsonArray(json.getAsJsonArray("primitivesArray"),
                json.getAsJsonArray("primitivesArray").get(0).getAsJsonPrimitive(), 0);
    }

    @Test
    public void testJsonPrimitiveInJsonArrayByIndexWithKey() {
        Gassert.verifyJsonPrimitiveInJsonArray(json.getAsJsonArray("primitivesArray"),
                json.getAsJsonArray("primitivesArray").get(0).getAsJsonPrimitive(), 0, "Test failed!");
    }

    @Test
    public void testJsonArraysInJsonArray() {
        Gassert.verifyJsonArraysInJsonArray(json.getAsJsonArray("arraysArray"));
    }

    @Test
    public void testJsonPrimitivesInJsonArray() {
        Gassert.verifyJsonPrimitivesInJsonArray(json.getAsJsonArray("primitivesArray"));
    }

    @Test
    public void testJsonNullsInJsonArrayByIndex() {
        Gassert.verifyJsonNullInJsonArray(json.getAsJsonArray("nullsArray"), 0);
    }

    @Test
    public void testJsonNullsInJsonArrayByIndexWithMessage() {
        Gassert.verifyJsonNullInJsonArray(json.getAsJsonArray("nullsArray"), 0, "Test failed!");
    }

    @Test
    public void testJsonNullsInJsonArray() {
        Gassert.verifyJsonNullsInJsonArray(json.getAsJsonArray("nullsArray"));
    }
}
