package unit;

import org.testng.annotations.Test;
import system.Gassert;

public class PrimitivesTests extends TestCore {

    @Test
    public void testNumber() {
        Gassert.verifyNumber(json, "number", json.get("number").getAsNumber());
    }

    @Test
    public void testBigInteger() {
        Gassert.verifyBigInteger(json, "bigInteger", json.get("bigInteger").getAsBigInteger());
    }

    @Test
    public void testLong() {
        Gassert.verifyLong(json, "long", json.get("long").getAsLong());
    }

    @Test
    public void testInteger() {
        Gassert.verifyInteger(json, "integer", json.get("integer").getAsInt());
    }

    @Test
    public void testIntegerWithMessage() {
        Gassert.verifyInteger(json, "integer", json.get("integer").getAsInt(), "Test failed!");
    }

    @Test
    public void testShort() {
        Gassert.verifyShort(json, "short", json.get("short").getAsShort());
    }

    @Test
    public void testByte() {
        Gassert.verifyByte(json, "byte", json.get("byte").getAsByte());
    }

    @Test
    public void testBigDecimal() {
        Gassert.verifyBigDecimal(json, "bigDecimal", json.get("bigDecimal").getAsBigDecimal());
    }

    @Test
    public void testDouble() {
        Gassert.verifyDouble(json, "double", json.get("double").getAsDouble());
    }

    @Test
    public void testFloat() {
        Gassert.verifyFloat(json, "float", json.get("float").getAsFloat());
    }

    @Test
    public void testBoolean() {
        Gassert.verifyBoolean(json, "boolean", json.get("boolean").getAsBoolean());
    }

    @Test
    public void testBooleanWithMessage() {
        Gassert.verifyBoolean(json, "boolean", json.get("boolean").getAsBoolean(), "Test failed!");
    }

    @Test
    public void testString() {
        Gassert.verifyString(json, "string", json.get("string").getAsString());
    }

    @Test
    public void testStringWithMessage() {
        Gassert.verifyString(json, "string", json.get("string").getAsString(), "Test failed!");
    }

    @Test
    public void testStringContains() {
        Gassert.verifyStringContains(json, "string", "string");
    }
}