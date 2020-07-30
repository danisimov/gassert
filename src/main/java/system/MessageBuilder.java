package system;

import com.google.gson.*;
import org.testng.internal.collections.Pair;

/**
 * Error messages builder.
 */
class MessageBuilder {

    private MessageBuilder() {
    }

    static String buildMessage(JsonElement jsonElement, String template) {
        return template + "\n" + Const.VERIFIED_ELEMENT + "\n" + prettifyJson(jsonElement) + "\n";
    }

    static String buildMessage(JsonElement jsonElement, String template, String substitution) {
        return template.replace(Const.X, substitution) + "\n" + Const.VERIFIED_ELEMENT + "\n" +
                prettifyJson(jsonElement) + "\n";
    }

    static String buildMessage(JsonElement jsonElement, String template, Pair<String, String> substitutions) {
        return template.replace(Const.X, substitutions.first()).replace(Const.Z, substitutions.second()) +
                "\n" + Const.VERIFIED_ELEMENT + "\n" + prettifyJson(jsonElement) + "\n";
    }

    static String prettifyJson(JsonElement jsonElement) {
        return new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().serializeNulls().create().toJson(jsonElement);
    }
}
