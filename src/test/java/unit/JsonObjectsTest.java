package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class JsonObjectsTest extends Core {

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
    public void testJsonObjectWithValue() {
        Gassert.verifyJsonObject(json, "object", json.getAsJsonObject("object"));
    }

    @Test
    public void testJsonObjectWithValueAndMessage() {
        Gassert.verifyJsonObject(json, "object", json.getAsJsonObject("object"), "Test failed!");
    }

    @Test
    public void testJsonObjectSize() {
        Gassert.verifyJsonObject(json, "object", 1);
    }

    @Test
    public void testJsonObjectSizeWithMessage() {
        Gassert.verifyJsonObject(json, "object", 1, "Test failed!");
    }
}
