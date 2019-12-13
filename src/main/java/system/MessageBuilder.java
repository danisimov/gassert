package system;

import org.testng.internal.collections.Pair;

/**
 * Error messages builder.
 */
class MessageBuilder {

    private MessageBuilder() {
    }

    static String buildMessage(String template, String substitution) {
        return template.replace(Const.X, substitution);
    }

    static String buildMessage(String template, Pair<String, String> substitutions) {
        return template.replace(Const.X, substitutions.first()).replace(Const.Z, substitutions.second());
    }
}
