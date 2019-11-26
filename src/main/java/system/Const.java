package system;

class Const {

    static final String ARRAY_TYPE_VERIFICATION_FAILED_MESSAGE = "Element [$x] is not a JsonArray";
    static final String ARRAY_CONTENT_TYPES_VERIFICATION_FAILED_MESSAGE = "JsonArray contains unexpected types.";
    static final String ARRAY_CONTENT_VERIFICATION_FAILED_MESSAGE = "JsonArray does not contains expected value.";
    static final String CONTAINS_VERIFICATION_FAILED_MESSAGE = "Json does not contains key: [$x].";
    static final String NULL_TYPE_VERIFICATION_FAILED_MESSAGE = "Element [$x] is not a JsonNull";
    static final String OBJECT_TYPE_VERIFICATION_FAILED_MESSAGE = "Element [$x] is not a JsonObject";
    static final String PRIMITIVE_TYPE_VERIFICATION_FAILED_MESSAGE = "Element [$x] is not a JsonPrimitive";
    static final String SIZE_VERIFICATION_FAILED_MESSAGE = "Element [$x] size verification failed.";
    static final String STRING_CONTAINS_VERIFICATION_FAILED_MESSAGE = "Element [$x] does not contains [$z].";
    static final String VALUE_VERIFICATION_FAILED_MESSAGE = "Element [$x] verification failed.";

    static final String X = "$x";
    static final String Z = "$z";

    private Const() {
    }
}
