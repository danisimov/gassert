package system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.testng.Assert;
import org.testng.internal.collections.Pair;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Assertions main class.
 */
public class Gassert {

    private Gassert() {
    }

    //----------------------------------------------JsonElement----------------------------------------------//
    /**
     * Verify that JsonObject contains JsonElement found by key.
     * @param json testable JsonObject
     * @param key expected JsonElement key value
     */
    public static void verifyJsonElement(JsonObject json, String key) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonElement found by key.
     * @param json testable JsonObject
     * @param key expected JsonElement key value
     * @param message custom error message
     */
    public static void verifyJsonElement(JsonObject json, String key, String message) {
        Assert.assertTrue(json.has(key), MessageBuilder.buildMessage(Const.CONTAINS_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    //----------------------------------------------JsonNull----------------------------------------------//
    /**
     * Verify that JsonElement is JsonNull.
     * @param element testable JsonElement
     */
    public static void verifyJsonNull(JsonElement element) {
        Assert.assertTrue(element.isJsonNull(), MessageBuilder.buildMessage(Const.TYPE_VERIFICATION_FAILED_MESSAGE, Const.JSON_NULL_TYPE));
    }

    /**
     * Verify that JsonElement is JsonNull.
     * @param element testable JsonElement
     * @param message custom error message
     */
    public static void verifyJsonNull(JsonElement element, String message) {
        Assert.assertTrue(element.isJsonNull(),
                MessageBuilder.buildMessage(Const.TYPE_VERIFICATION_FAILED_MESSAGE, Const.JSON_NULL_TYPE) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonNull found by key.
     * @param json testable JsonObject
     * @param key expected JsonNull key value
     */
    public static void verifyJsonNull(JsonObject json, String key) {
        verifyJsonElement(json, key);
        Assert.assertTrue(json.get(key).isJsonNull(),
                MessageBuilder.buildMessage(Const.INNER_TYPE_VERIFICATION_FAILED_MESSAGE, new Pair<>(key, Const.JSON_NULL_TYPE)));
    }

    /**
     * Verify that JsonObject contains JsonNull found by key.
     * @param json testable JsonObject
     * @param key expected JsonNull key value
     * @param message custom error message
     */
    public static void verifyJsonNull(JsonObject json, String key, String message) {
        verifyJsonElement(json, key, message);
        Assert.assertTrue(json.get(key).isJsonNull(),
                MessageBuilder.buildMessage(Const.INNER_TYPE_VERIFICATION_FAILED_MESSAGE, new Pair<>(key, Const.JSON_NULL_TYPE)) + "\n" + message);
    }

    //----------------------------------------------JsonObject----------------------------------------------//
    /**
     * Verify that JsonElement is JsonObject.
     * @param element testable JsonElement
     */
    public static void verifyJsonObject(JsonElement element) {
        Assert.assertTrue(element.isJsonObject(), MessageBuilder.buildMessage(Const.TYPE_VERIFICATION_FAILED_MESSAGE, Const.JSON_OBJECT_TYPE));
    }

    /**
     * Verify that JsonElement is JsonObject.
     * @param element testable JsonElement
     * @param message custom error message
     */
    public static void verifyJsonObject(JsonElement element, String message) {
        Assert.assertTrue(element.isJsonObject(),
                MessageBuilder.buildMessage(Const.TYPE_VERIFICATION_FAILED_MESSAGE, Const.JSON_OBJECT_TYPE) + "\n" + message);
    }

    /**
     * Verify that JsonElement value equals to specific JsonObject.
     * @param element testable JsonElement
     * @param value expected JsonObject value
     */
    public static void verifyJsonObject(JsonElement element, JsonObject value) {
        verifyJsonObject(element);
        Assert.assertEquals(element.getAsJsonObject(), value,
                Const.VALUE_VERIFICATION_FAILED_MESSAGE);
    }

    /**
     * Verify that JsonElement value equals to specific JsonObject.
     * @param element testable JsonElement
     * @param value expected JsonObject value
     * @param message custom error message
     */
    public static void verifyJsonObject(JsonElement element, JsonObject value, String message) {
        verifyJsonObject(element, message);
        Assert.assertEquals(element.getAsJsonObject(), value,
                Const.VALUE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonObject found by key.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     */
    public static void verifyJsonObject(JsonObject json, String key) {
        verifyJsonElement(json, key);
        Assert.assertTrue(json.get(key).isJsonObject(),
                MessageBuilder.buildMessage(Const.INNER_TYPE_VERIFICATION_FAILED_MESSAGE, new Pair<>(key, Const.JSON_OBJECT_TYPE)));
    }

    /**
     * Verify that JsonObject contains JsonObject found by key.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param message custom error message
     */
    public static void verifyJsonObject(JsonObject json, String key, String message) {
        verifyJsonElement(json, key, message);
        Assert.assertTrue(json.get(key).isJsonObject(),
                MessageBuilder.buildMessage(Const.INNER_TYPE_VERIFICATION_FAILED_MESSAGE, new Pair<>(key, Const.JSON_OBJECT_TYPE)) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonObject found by key.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected JsonObject value
     */
    public static void verifyJsonObject(JsonObject json, String key, JsonObject value) {
        verifyJsonObject(json, key);
        Assert.assertEquals(json.get(key).getAsJsonObject(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonObject found by key, and it's value equals to specific JsonObject.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected JsonObject value
     * @param message custom error message
     */
    public static void verifyJsonObject(JsonObject json, String key, JsonObject value, String message) {
        verifyJsonObject(json, key, message);
        Assert.assertEquals(json.get(key).getAsJsonObject(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonObject found by key, and it's value equals to specific JsonObject.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param size expected JsonObject size
     */
    public static void verifyJsonObject(JsonObject json, String key, int size) {
        verifyJsonObject(json, key);
        Assert.assertEquals(json.getAsJsonObject(key).size(), size,
                MessageBuilder.buildMessage(Const.BY_KEY_SIZE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonObject found by key, and it's value equals to specific JsonObject.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param size expected JsonObject size
     * @param message custom error message
     */
    public static void verifyJsonObject(JsonObject json, String key, int size, String message) {
        verifyJsonObject(json, key);
        Assert.assertEquals(json.getAsJsonObject(key).size(), size,
                MessageBuilder.buildMessage(Const.BY_KEY_SIZE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    //----------------------------------------------JsonPrimitive----------------------------------------------//
    /**
     * Verify that JsonElement is JsonPrimitive.
     * @param element testable JsonElement
     */
    public static void verifyJsonPrimitive(JsonElement element) {
        Assert.assertTrue(element.isJsonPrimitive(), MessageBuilder.buildMessage(Const.TYPE_VERIFICATION_FAILED_MESSAGE, Const.JSON_PRIMITIVE_TYPE));
    }

    /**
     * Verify that JsonElement is JsonPrimitive.
     * @param element testable JsonElement
     * @param message custom error message
     */
    public static void verifyJsonPrimitive(JsonElement element, String message) {
        Assert.assertTrue(element.isJsonPrimitive(),
                MessageBuilder.buildMessage(Const.TYPE_VERIFICATION_FAILED_MESSAGE, Const.JSON_PRIMITIVE_TYPE) + "\n" + message);
    }

    /**
     * Verify that JsonElement value equals to specific JsonPrimitive.
     * @param element testable JsonElement
     * @param value expected JsonPrimitive value
     */
    public static void verifyJsonPrimitive(JsonElement element, JsonPrimitive value) {
        verifyJsonPrimitive(element);
        Assert.assertEquals(element.getAsJsonPrimitive(), value, Const.VALUE_VERIFICATION_FAILED_MESSAGE);
    }

    /**
     * Verify that JsonElement value equals to specific JsonPrimitive.
     * @param element testable JsonElement
     * @param value expected JsonPrimitive value
     * @param message custom error message
     */
    public static void verifyJsonPrimitive(JsonElement element, JsonPrimitive value, String message) {
        verifyJsonPrimitive(element, message);
        Assert.assertEquals(element.getAsJsonPrimitive(), value,
                Const.VALUE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     */
    public static void verifyJsonPrimitive(JsonObject json, String key) {
        verifyJsonElement(json, key);
        Assert.assertTrue(json.get(key).isJsonPrimitive(),
                MessageBuilder.buildMessage(Const.INNER_TYPE_VERIFICATION_FAILED_MESSAGE, new Pair<>(key, Const.JSON_PRIMITIVE_TYPE)));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param message custom error message
     */
    public static void verifyJsonPrimitive(JsonObject json, String key, String message) {
        verifyJsonElement(json, key, message);
        Assert.assertTrue(json.get(key).isJsonPrimitive(),
                MessageBuilder.buildMessage(Const.INNER_TYPE_VERIFICATION_FAILED_MESSAGE, new Pair<>(key, Const.JSON_PRIMITIVE_TYPE)) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific JsonPrimitive.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected JsonPrimitive value
     */
    public static void verifyJsonPrimitive(JsonObject json, String key, JsonPrimitive value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsJsonPrimitive(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific JsonPrimitive.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected JsonPrimitive value
     * @param message custom error message
     */
    public static void verifyJsonPrimitive(JsonObject json, String key, JsonPrimitive value, String message) {
        verifyJsonPrimitive(json, key, message);
        Assert.assertEquals(json.get(key).getAsJsonPrimitive(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific Number.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected Number value
     */
    public static void verifyNumber(JsonObject json, String key, Number value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsNumber(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific BigInteger.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected BigInteger value
     */
    public static void verifyBigInteger(JsonObject json, String key, BigInteger value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBigInteger(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific long.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected long value
     */
    public static void verifyLong(JsonObject json, String key, long value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsLong(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific int.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected int value
     */
    public static void verifyInteger(JsonObject json, String key, int value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsInt(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to int int.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected int value
     * @param message custom error message
     */
    public static void verifyInteger(JsonObject json, String key, int value, String message) {
        verifyJsonPrimitive(json, key, message);
        Assert.assertEquals(json.get(key).getAsInt(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific short.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected short value
     */
    public static void verifyShort(JsonObject json, String key, short value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsShort(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific byte.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected byte value
     */
    public static void verifyByte(JsonObject json, String key, byte value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsByte(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific BigDecimal.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected BigDecimal value
     */
    public static void verifyBigDecimal(JsonObject json, String key, BigDecimal value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBigDecimal(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific double.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected double value
     */
    public static void verifyDouble(JsonObject json, String key, double value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsDouble(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific float.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected float value
     */
    public static void verifyFloat(JsonObject json, String key, float value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsFloat(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific String.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected String value
     */
    public static void verifyString(JsonObject json, String key, String value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsString(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific String.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected String value
     * @param message custom error message
     */
    public static void verifyString(JsonObject json, String key, String value, String message) {
        verifyJsonPrimitive(json, key, message);
        Assert.assertEquals(json.get(key).getAsString(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value contains specific String.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected contained String value
     */
    public static void verifyStringContains(JsonObject json, String key, String value) {
        verifyJsonPrimitive(json, key);
        Assert.assertTrue(json.get(key).getAsString().contains(value),
                MessageBuilder.buildMessage(Const.STRING_CONTAINS_VERIFICATION_FAILED_MESSAGE,
                        new Pair<>(key, value)));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value contains specific String.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected contained String value
     * @param message custom error message
     */
    public static void verifyStringContains(JsonObject json, String key, String value, String message) {
        verifyJsonPrimitive(json, key);
        Assert.assertTrue(json.get(key).getAsString().contains(value),
                MessageBuilder.buildMessage(Const.STRING_CONTAINS_VERIFICATION_FAILED_MESSAGE,
                        new Pair<>(key, value)) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific boolean.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected boolean value
     */
    public static void verifyBoolean(JsonObject json, String key, boolean value) {
        verifyJsonPrimitive(json, key);
        Assert.assertEquals(json.get(key).getAsBoolean(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonPrimitive found by key, and it's value equals to specific boolean.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected boolean value
     * @param message custom error message
     */
    public static void verifyBoolean(JsonObject json, String key, boolean value, String message) {
        verifyJsonPrimitive(json, key, message);
        Assert.assertEquals(json.get(key).getAsBoolean(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    //----------------------------------------------JsonArray----------------------------------------------//
    /**
     * Verify that JsonElement is JsonArray.
     * @param element testable JsonElement
     */
    public static void verifyJsonArray(JsonElement element) {
        Assert.assertTrue(element.isJsonArray(), MessageBuilder.buildMessage(Const.TYPE_VERIFICATION_FAILED_MESSAGE, Const.JSON_ARRAY_TYPE));
    }

    /**
     * Verify that JsonElement is JsonArray.
     * @param element testable JsonElement
     * @param message custom error message
     */
    public static void verifyJsonArray(JsonElement element, String message) {
        Assert.assertTrue(element.isJsonArray(),
                MessageBuilder.buildMessage(Const.TYPE_VERIFICATION_FAILED_MESSAGE, Const.JSON_ARRAY_TYPE) + "\n" + message);
    }

    /**
     * Verify that JsonElement is JsonArray.
     * @param element testable JsonElement
     * @param size expected JsonObject size
     */
    public static void verifyJsonArray(JsonElement element, int size) {
        verifyJsonArray(element);
        Assert.assertEquals(element.getAsJsonArray().size(), size, Const.SIZE_VERIFICATION_FAILED_MESSAGE);
    }

    /**
     * Verify that JsonElement is JsonArray.
     * @param element testable JsonElement
     * @param size expected JsonObject size
     * @param message custom error message
     */
    public static void verifyJsonArray(JsonElement element, int size, String message) {
        verifyJsonArray(element);
        Assert.assertEquals(element.getAsJsonArray().size(), size,
                Const.SIZE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    /**
     * Verify that JsonElement value equals to specific JsonArray.
     * @param element testable JsonElement
     * @param value expected JsonArray value
     */
    public static void verifyJsonArray(JsonElement element, JsonArray value) {
        verifyJsonArray(element);
        Assert.assertEquals(element.getAsJsonArray(), value, Const.VALUE_VERIFICATION_FAILED_MESSAGE);
    }

    /**
     * Verify that JsonElement value equals to specific JsonArray.
     * @param element testable JsonElement
     * @param value expected JsonArray value
     * @param message custom error message
     */
    public static void verifyJsonArray(JsonElement element, JsonArray value, String message) {
        verifyJsonArray(element, message);
        Assert.assertEquals(element.getAsJsonArray(), value,
                Const.VALUE_VERIFICATION_FAILED_MESSAGE + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonArray found by key.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     */
    public static void verifyJsonArray(JsonObject json, String key) {
        verifyJsonElement(json, key);
        Assert.assertTrue(json.get(key).isJsonArray(),
                MessageBuilder.buildMessage(Const.INNER_TYPE_VERIFICATION_FAILED_MESSAGE, new Pair<>(key, Const.JSON_ARRAY_TYPE)));
    }

    /**
     * Verify that JsonObject contains JsonArray found by key.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param message custom error message
     */
    public static void verifyJsonArray(JsonObject json, String key, String message) {
        verifyJsonElement(json, key, message);
        Assert.assertTrue(json.get(key).isJsonArray(),
                MessageBuilder.buildMessage(Const.INNER_TYPE_VERIFICATION_FAILED_MESSAGE, new Pair<>(key, Const.JSON_ARRAY_TYPE)) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonArray found by key, and it's value equals to specific JsonArray.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected JsonArray value
     */
    public static void verifyJsonArray(JsonObject json, String key, JsonArray value) {
        verifyJsonArray(json, key);
        Assert.assertEquals(json.get(key).getAsJsonArray(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonArray found by key, and it's value equals to specific JsonArray.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param value expected JsonArray value
     * @param message custom error message
     */
    public static void verifyJsonArray(JsonObject json, String key, JsonArray value, String message) {
        verifyJsonArray(json, key, message);
        Assert.assertEquals(json.get(key).getAsJsonArray(), value,
                MessageBuilder.buildMessage(Const.INNER_VALUE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    /**
     * Verify that JsonObject contains JsonArray found by key and it's size.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param size expected JsonObject size
     */
    public static void verifyJsonArray(JsonObject json, String key, int size) {
        verifyJsonArray(json, key);
        Assert.assertEquals(json.getAsJsonArray(key).size(), size,
                MessageBuilder.buildMessage(Const.BY_KEY_SIZE_VERIFICATION_FAILED_MESSAGE, key));
    }

    /**
     * Verify that JsonObject contains JsonArray found by key and it's size.
     * @param json testable JsonObject
     * @param key expected JsonObject key value
     * @param size expected JsonObject size
     * @param message custom error message
     */
    public static void verifyJsonArray(JsonObject json, String key, int size, String message) {
        verifyJsonArray(json, key, message);
        Assert.assertEquals(json.getAsJsonArray(key).size(), size,
                MessageBuilder.buildMessage(Const.BY_KEY_SIZE_VERIFICATION_FAILED_MESSAGE, key) + "\n" + message);
    }

    /**
     * Verify that JsonArray contains only JsonObject type elements.
     * @param array testable JsonArray
     */
    public static void verifyJsonObjectsInJsonArray(JsonArray array) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonObject(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE);
        }
    }

    /**
     * Verify that JsonArray contains only JsonObject type elements.
     * @param array testable JsonArray
     * @param message custom error message
     */
    public static void verifyJsonObjectsInJsonArray(JsonArray array, String message) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonObject(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE + "\n" + message);
        }
    }

    /**
     * Verify that JsonArray contains specific JsonObject.
     * @param array testable JsonArray
     * @param value expected JsonObject value
     */
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

    /**
     * Verify that JsonArray contains specific JsonObject on specific index.
     * @param array testable JsonArray
     * @param value expected JsonObject value
     * @param index expected JsonObject index
     */
    public static void verifyJsonObjectInJsonArray(JsonArray array, JsonObject value, int index) {
        verifyJsonObject(array.get(index), value);
    }

    /**
     * Verify that JsonArray contains specific JsonObject on specific index.
     * @param array testable JsonArray
     * @param value expected JsonObject value
     * @param index expected JsonObject index
     * @param message custom error message
     */
    public static void verifyJsonObjectInJsonArray(JsonArray array, JsonObject value, int index, String message) {
        verifyJsonObject(array.get(index), value, message);
    }

    /**
     * Verify that JsonArray contains only JsonArray type elements.
     * @param array testable JsonArray
     */
    public static void verifyJsonArraysInJsonArray(JsonArray array) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonArray(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE);
        }
    }

    /**
     * Verify that JsonArray contains only JsonArray type elements.
     * @param array testable JsonArray
     * @param message custom error message
     */
    public static void verifyJsonArraysInJsonArray(JsonArray array, String message) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonArray(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE + "\n" + message);
        }
    }

    /**
     * Verify that JsonArray contains specific JsonArray.
     * @param array testable JsonArray
     * @param value expected JsonArray value
     */
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

    /**
     * Verify that JsonArray contains specific JsonArray on specific index.
     * @param array testable JsonArray
     * @param value expected JsonArray value
     * @param index expected JsonArray index
     */
    public static void verifyJsonArrayInJsonArray(JsonArray array, JsonArray value, int index) {
        verifyJsonArray(array.get(index), value);
    }

    /**
     * Verify that JsonArray contains specific JsonArray on specific index.
     * @param array testable JsonArray
     * @param value expected JsonArray value
     * @param index expected JsonArray index
     * @param message custom error message
     */
    public static void verifyJsonArrayInJsonArray(JsonArray array, JsonArray value, int index, String message) {
        verifyJsonArray(array.get(index), value, message);
    }

    /**
     * Verify that JsonArray contains only JsonArray type elements.
     * @param array testable JsonArray
     */
    public static void verifyJsonPrimitivesInJsonArray(JsonArray array) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonPrimitive(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE);
        }
    }

    /**
     * Verify that JsonArray contains only JsonArray type elements.
     * @param array testable JsonArray
     * @param message custom error message
     */
    public static void verifyJsonPrimitivesInJsonArray(JsonArray array, String message) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonPrimitive(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE + "\n" + message);
        }
    }

    /**
     * Verify that JsonArray contains specific JsonPrimitive.
     * @param array testable JsonArray
     * @param value expected JsonPrimitive value
     */
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

    /**
     * Verify that JsonArray contains specific JsonPrimitive on specific index.
     * @param array testable JsonArray
     * @param value expected JsonPrimitive value
     * @param index expected JsonPrimitive index
     */
    public static void verifyJsonPrimitiveInJsonArray(JsonArray array, JsonPrimitive value, int index) {
        verifyJsonPrimitive(array.get(index), value);
    }

    /**
     * Verify that JsonArray contains specific JsonPrimitive on specific index.
     * @param array testable JsonArray
     * @param value expected JsonPrimitive value
     * @param index expected JsonPrimitive index
     * @param message custom error message
     */
    public static void verifyJsonPrimitiveInJsonArray(JsonArray array, JsonPrimitive value, int index, String message) {
        verifyJsonPrimitive(array.get(index), value, message);
    }

    /**
     * Verify that JsonArray contains only JsonNull type elements.
     * @param array testable JsonArray
     */
    public static void verifyJsonNullsInJsonArray(JsonArray array) {
        for (JsonElement json : array) {
            Assert.assertTrue(json.isJsonNull(), Const.ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE);
        }
    }

    /**
     * Verify that JsonArray contains specific JsonNull on specific index.
     * @param array testable JsonArray
     * @param index expected JsonNull index
     */
    public static void verifyJsonNullInJsonArray(JsonArray array, int index) {
        verifyJsonNull(array.get(index));
    }

    /**
     * Verify that JsonArray contains specific JsonNull on specific index.
     * @param array testable JsonArray
     * @param index expected JsonNull index
     * @param message custom error message
     */
    public static void verifyJsonNullInJsonArray(JsonArray array, int index, String message) {
        verifyJsonNull(array.get(index), message);
    }
}
