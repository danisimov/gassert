package system;

/**
 * Error messages.
 */
class Const {

    static final String JSON_OBJECT_TYPE = "JsonObject";
    static final String JSON_ARRAY_TYPE = "JsonArray";
    static final String JSON_PRIMITIVE_TYPE = "JsonPrimitive";
    static final String JSON_NULL_TYPE = "JsonNull";

    static final String CONTAINS_VERIFICATION_FAILED_MESSAGE = "Json does not contains element: [$x].";
    static final String INNER_TYPE_VERIFICATION_FAILED_MESSAGE = "Element [$x] is not a [$z].";
    static final String TYPE_VERIFICATION_FAILED_MESSAGE = "Element is not a [$x].";
    static final String INNER_VALUE_VERIFICATION_FAILED_MESSAGE = "Element [$x] verification failed.";
    static final String VALUE_VERIFICATION_FAILED_MESSAGE = "Element verification failed.";
    static final String STRING_CONTAINS_VERIFICATION_FAILED_MESSAGE = "Element [$x] does not contains [$z].";
    static final String BY_KEY_SIZE_VERIFICATION_FAILED_MESSAGE = "Element [$x] size verification failed.";
    static final String SIZE_VERIFICATION_FAILED_MESSAGE = "Element size verification failed.";
    static final String VERIFIED_ELEMENT = "Verified element:";

    static final String ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE = "JsonArray contains unexpected types.";
    static final String ARRAY_CONTENT_VERIFICATION_FAILED_MESSAGE = "JsonArray does not contains expected value.";

    static final String X = "$x";
    static final String Z = "$z";

    private Const() {
    }
}
