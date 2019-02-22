package system;

public class Const {

    static final String ARRAY_TYPE_VERIFICATION_FAILED_MESSAGE = "Element '$x' is not a JsonArray";
    static final String CONTAINS_VERIFICATION_FAILED_MESSAGE = "Json does not contains key: '$x'.";
    static final String NULL_TYPE_VERIFICATION_FAILED_MESSAGE = "Element '$x' is not a JsonNull";
    static final String OBJECT_TYPE_VERIFICATION_FAILED_MESSAGE = "Element '$x' is not a JsonObject";
    static final String PRIMITIVE_TYPE_VERIFICATION_FAILED_MESSAGE = "Element '$x' is not a JsonPrimitive";
    static final String SIZE_VERIFICATION_FAILED_MESSAGE = "JsonArray '$x' size verification failed.";
    static final String VALUE_VERIFICATION_FAILED_MESSAGE = "Element '$x' verification failed.";

    private Const() {
    }
}
