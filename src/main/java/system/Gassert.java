package system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.testng.Assert;
import org.testng.internal.collections.Pair;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Gassert {

    private Gassert() {
    }

    //----------------------------------------------elements----------------------------------------------//
    public static void verifyJsonObject(JsonElement element) {
        Assert.assertTrue(element.isJsonObject(), Const.OBJECT_TYPE_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonObject(JsonElement element, String message) {
        Assert.assertTrue(element.isJsonObject(),
                Const.OBJECT_TYPE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    public static void verifyJsonObject(JsonElement element, JsonObject value) {
        verifyJsonObject(element);
        Assert.assertEquals(element.getAsJsonObject(), value,
                Const.VALUE_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonObject(JsonElement element, JsonObject value, String message) {
        verifyJsonObject(element, message);
        Assert.assertEquals(element.getAsJsonObject(), value,
                Const.VALUE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    public static void verifyJsonObject(JsonObject json, String key) {
        verifyJsonElement(json, key);
        Assert.assertTrue(json.get(key).isJsonObject(),
                MessageBuilder.buildMessage(Const.INNER_OBJECT_TYPE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonObject(JsonObject json, String key, String message) {
        verifyJsonElement(json, key, message);
        Assert.assertTrue(json.get(key).isJsonObject(),
                MessageBuilder.buildMessage(Const.INNER_OBJECT_TYPE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyJsonArray(JsonElement element) {
        Assert.assertTrue(element.isJsonArray(), Const.ARRAY_TYPE_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonArray(JsonElement element, String message) {
        Assert.assertTrue(element.isJsonArray(),
                Const.ARRAY_TYPE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    public static void verifyJsonArray(JsonElement element, JsonArray value) {
        verifyJsonArray(element);
        Assert.assertEquals(element.getAsJsonArray(), value, Const.VALUE_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonArray(JsonElement element, JsonArray value, String message) {
        verifyJsonArray(element, message);
        Assert.assertEquals(element.getAsJsonArray(), value,
                Const.VALUE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    public static void verifyJsonArray(JsonObject json, String key) {
        verifyJsonElement(json, key);
        Assert.assertTrue(json.get(key).isJsonArray(),
                MessageBuilder.buildMessage(Const.INNER_ARRAY_TYPE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonArray(JsonObject json, String key, String message) {
        verifyJsonElement(json, key, message);
        Assert.assertTrue(json.get(key).isJsonArray(),
                MessageBuilder.buildMessage(Const.INNER_ARRAY_TYPE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyJsonPrimitive(JsonElement element) {
        Assert.assertTrue(element.isJsonPrimitive(), Const.PRIMITIVE_TYPE_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonPrimitive(JsonElement element, String message) {
        Assert.assertTrue(element.isJsonPrimitive(),
                Const.PRIMITIVE_TYPE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    public static void verifyJsonPrimitive(JsonElement element, JsonPrimitive value) {
        verifyJsonPrimitive(element);
        Assert.assertEquals(element.getAsJsonPrimitive(), value, Const.VALUE_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonPrimitive(JsonElement element, JsonPrimitive value, String message) {
        verifyJsonPrimitive(element, message);
        Assert.assertEquals(element.getAsJsonPrimitive(), value,
                Const.VALUE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    public static void verifyJsonPrimitive(JsonObject json, String key) {
        verifyJsonElement(json, key);
        Assert.assertTrue(json.get(key).isJsonPrimitive(),
                MessageBuilder.buildMessage(Const.INNER_PRIMITIVE_TYPE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonPrimitive(JsonObject json, String key, String message) {
        verifyJsonElement(json, key, message);
        Assert.assertTrue(json.get(key).isJsonPrimitive(),
                MessageBuilder.buildMessage(Const.INNER_PRIMITIVE_TYPE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyJsonPrimitive(JsonObject json, String key, JsonPrimitive value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsJsonPrimitive(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonPrimitive(JsonObject json, String key, JsonPrimitive value, String message) {
        verifyJsonPrimitive(json, key, message);
        Assert.assertEquals(json.get(key).getAsJsonPrimitive(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyJsonNull(JsonElement element) {
        Assert.assertTrue(element.isJsonNull(), Const.NULL_TYPE_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonNull(JsonElement element, String message) {
        Assert.assertTrue(element.isJsonNull(),
                Const.NULL_TYPE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    public static void verifyJsonNull(JsonObject json, String key) {
        verifyJsonElement(json, key);
        Assert.assertTrue(json.get(key).isJsonNull(),
                MessageBuilder.buildMessage(Const.INNER_NULL_TYPE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonNull(JsonObject json, String key, String message) {
        verifyJsonElement(json, key, message);
        Assert.assertTrue(json.get(key).isJsonNull(),
                MessageBuilder.buildMessage(Const.INNER_NULL_TYPE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyJsonElement(JsonObject json, String key) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonElement(JsonObject json, String key, String message) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    //----------------------------------------------objects----------------------------------------------//
    public static void verifyJsonObject(JsonObject json, String key, int size) {
        verifyJsonObject(json, key);
        Assert.assertEquals(json.getAsJsonObject(key).size(), size,
                MessageBuilder.buildMessage(Const.SIZE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonObject(JsonObject json, String key, JsonObject value) {
        verifyJsonObject(json, key);
        Assert.assertEquals(json.get(key).getAsJsonObject(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonObject(JsonObject json, String key, JsonObject value, String message) {
        verifyJsonObject(json, key, message);
        Assert.assertEquals(json.get(key).getAsJsonObject(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    //----------------------------------------------primitives----------------------------------------------//
    public static void verifyNumber(JsonObject json, String key, Number value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsNumber(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyBigInteger(JsonObject json, String key, BigInteger value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBigInteger(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyLong(JsonObject json, String key, long value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsLong(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyInteger(JsonObject json, String key, int value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsInt(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyInteger(JsonObject json, String key, int value, String message) {
        verifyJsonPrimitive(json, key, message);
        Assert.assertEquals(json.get(key).getAsInt(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyShort(JsonObject json, String key, short value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsShort(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyByte(JsonObject json, String key, byte value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsByte(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyBigDecimal(JsonObject json, String key, BigDecimal value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBigDecimal(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyDouble(JsonObject json, String key, double value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsDouble(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyFloat(JsonObject json, String key, float value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsFloat(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyString(JsonObject json, String key, String value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsString(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyString(JsonObject json, String key, String value, String message) {
        verifyJsonPrimitive(json, key, message);
        Assert.assertEquals(json.get(key).getAsString(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyStringContains(JsonObject json, String key, String value) {
        verifyJsonPrimitive(json, key);
        Assert.assertTrue(json.get(key).getAsString().contains(value),
                MessageBuilder.buildMessage(Const.STRING_CONTAINS_VERIFICATION_FAILED_MESSAGE,
                        new Pair<>(key, value)));
    }

    public static void verifyBoolean(JsonObject json, String key, boolean value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBoolean(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyBoolean(JsonObject json, String key, boolean value, String message) {
        verifyJsonPrimitive(json, key, message);
        Assert.assertEquals(json.get(key).getAsBoolean(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    //----------------------------------------------arrays----------------------------------------------//
    public static void verifyJsonArray(JsonObject json, String key, int size) {
        verifyJsonArray(json, key);
        Assert.assertEquals(json.getAsJsonArray(key).size(), size,
                MessageBuilder.buildMessage(Const.SIZE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonArray(JsonObject json, String key, int size, String message) {
        verifyJsonArray(json, key, message);
        Assert.assertEquals(json.getAsJsonArray(key).size(), size,
                MessageBuilder.buildMessage(Const.SIZE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyJsonArray(JsonObject json, String key, JsonArray value) {
        verifyJsonArray(json, key);
        Assert.assertEquals(json.get(key).getAsJsonArray(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    public static void verifyJsonArray(JsonObject json, String key, JsonArray value, String message) {
        verifyJsonArray(json, key, message);
        Assert.assertEquals(json.get(key).getAsJsonArray(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    public static void verifyJsonObjectsInJsonArray(JsonArray array) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonObject(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE);
        }
    }

    public static void verifyJsonObjectsInJsonArray(JsonArray array, String message) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonObject(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE + "\n" + message);
        }
    }

    public static void verifyJsonObjectInJsonArray(JsonArray array, JsonObject value) {
        for (JsonElement json : array) {
            try {
                verifyJsonObject(json, value);
                return;
            } catch (AssertionError ignored) {
                // ignored
            }
        }
        throw new AssertionError(Const.ARRAY_CONTENT_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonObjectInJsonArray(JsonArray array, JsonObject value, int index) {
        verifyJsonObject(array.get(index), value);
    }

    public static void verifyJsonObjectInJsonArray(JsonArray array, JsonObject value, int index, String message) {
        verifyJsonObject(array.get(index), value, message);
    }

    public static void verifyJsonArrayInJsonArray(JsonArray array, JsonArray value) {
        for (JsonElement json : array) {
            try {
                verifyJsonArray(json, value);
                return;
            } catch (AssertionError ignored) {
                // ignored
            }
        }
        throw new AssertionError(Const.ARRAY_CONTENT_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonArrayInJsonArray(JsonArray array, JsonArray value, int index) {
        verifyJsonArray(array.get(index), value);
    }

    public static void verifyJsonArrayInJsonArray(JsonArray array, JsonArray value, int index, String message) {
        verifyJsonArray(array.get(index), value, message);
    }

    public static void verifyJsonPrimitiveInJsonArray(JsonArray array, JsonPrimitive value) {
        for (JsonElement json : array) {
            try {
                verifyJsonPrimitive(json, value);
                return;
            } catch (AssertionError ignored) {
                // ignored
            }
        }
        throw new AssertionError(Const.ARRAY_CONTENT_VERIFICATION_FAILED_MESSAGE);
    }

    public static void verifyJsonPrimitiveInJsonArray(JsonArray array, JsonPrimitive value, int index) {
        verifyJsonPrimitive(array.get(index), value);
    }

    public static void verifyJsonPrimitiveInJsonArray(JsonArray array, JsonPrimitive value, int index, String message) {
        verifyJsonPrimitive(array.get(index), value, message);
    }

    public static void verifyJsonArraysInJsonArray(JsonArray array) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonArray(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE);
        }
    }

    public static void verifyJsonPrimitivesInJsonArray(JsonArray array) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonPrimitive(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE);
        }
    }

    public static void verifyJsonNullInJsonArray(JsonArray array, int index) {
        verifyJsonNull(array.get(index));
    }

    public static void verifyJsonNullInJsonArray(JsonArray array, int index, String message) {
        verifyJsonNull(array.get(index), message);
    }

    public static void verifyJsonNullsInJsonArray(JsonArray array) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonNull(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE);
        }
    }
}
