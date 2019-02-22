package system;

import com.google.gson.*;
import org.testng.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Asserts {

    //----------------------------------------------json----------------------------------------------//
    public static void verifyJsonObject(JsonObject json, String key, JsonObject value) {
        verifyObject(json, key);
        Assert.assertEquals(json.get(key).getAsJsonObject(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonArray(JsonObject json, String key, JsonArray value) {
        verifyArray(json, key);
        Assert.assertEquals(json.get(key).getAsJsonArray(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonPrimitive(JsonObject json, String key, JsonPrimitive value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsJsonPrimitive(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonNull(JsonObject json, String key, JsonNull value) {
        verifyNull(json, key);
        Assert.assertEquals(json.get(key).getAsJsonNull(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    //----------------------------------------------elements----------------------------------------------//
    public static void verifyNumber(JsonObject json, String key, Number value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsNumber(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyBigInteger(JsonObject json, String key, BigInteger value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBigInteger(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyLong(JsonObject json, String key, long value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsLong(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyInteger(JsonObject json, String key, int value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsInt(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyShort(JsonObject json, String key, short value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsShort(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyBigDecimal(JsonObject json, String key, BigDecimal value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBigDecimal(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyDouble(JsonObject json, String key, double value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsDouble(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyFloat(JsonObject json, String key, float value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsFloat(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyString(JsonObject json, String key, String value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsString(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyChar(JsonObject json, String key, char value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsCharacter(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyBoolean(JsonObject json, String key, boolean value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBoolean(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyByte(JsonObject json, String key, byte value) {
        verifyPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsByte(), value,
                MessageBuilder.buildMessage(Const.VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    //----------------------------------------------general----------------------------------------------//
    public static void verifyObject(JsonObject json, String key) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key));
        Assert.assertTrue(json.get(key).isJsonObject(),
                MessageBuilder.buildMessage(Const.OBJECT_TYPE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyObjectsInArray(JsonObject response, String name, int size) {
        verifyArray(response, name, size);
        for (JsonElement json : response.getAsJsonArray(name)) {
            json.isJsonObject();
        }
    }

    public static void verifyArray(JsonObject json, String key, int size) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key));
        Assert.assertTrue(json.get(key).isJsonArray(),
                MessageBuilder.buildMessage(Const.ARRAY_TYPE_VERIFICATION_FAILED_MESSAGE, key));
        Assert.assertEquals(json.getAsJsonArray(key).size(), size,
                MessageBuilder.buildMessage(Const.SIZE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyArray(JsonObject json, String key) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key));
        Assert.assertTrue(json.get(key).isJsonArray(),
                MessageBuilder.buildMessage(Const.ARRAY_TYPE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyPrimitive(JsonObject json, String key) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key));
        Assert.assertTrue(json.get(key).isJsonPrimitive(),
                MessageBuilder.buildMessage(Const.PRIMITIVE_TYPE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyNull(JsonObject json, String key) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key));
        Assert.assertTrue(json.get(key).isJsonNull(),
                MessageBuilder.buildMessage(Const.NULL_TYPE_VERIFICATION_FAILED_MESSAGE, key));
    }
}
