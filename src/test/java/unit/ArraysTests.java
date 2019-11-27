package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class ArraysTests extends TestCore {
    @Test
    public void testJsonObjectsInJsonArray() {
        Gassert.verifyJsonObjectsInJsonArray(json.getAsJsonArray("objectsArray"));
    }

    @Test
    public void testJsonObjectInJsonArray() {
        Gassert.verifyJsonObjectInJsonArray(json.getAsJsonArray("objectsArray"),
                json.getAsJsonArray("objectsArray").get(0).getAsJsonObject());
    }

    @Test
    public void testJsonArrayInJsonArray() {
        Gassert.verifyJsonArrayInJsonArray(json.getAsJsonArray("arraysArray"),
                json.getAsJsonArray("arraysArray").get(0).getAsJsonArray());
    }

    @Test
    public void testJsonPrimitiveInJsonArray() {
        Gassert.verifyJsonPrimitiveInJsonArray(json.getAsJsonArray("primitivesArray"),
                json.getAsJsonArray("primitivesArray").get(0).getAsJsonPrimitive());
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
    public void testJsonNullsInJsonArray() {
        Gassert.verifyJsonNullsInJsonArray(json.getAsJsonArray("nullsArray"));
    }
}
