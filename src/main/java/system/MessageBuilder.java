package system;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MessageBuilder {

    private MessageBuilder() {
    }

    static String buildMessage(String template, String substitution) {
        Matcher matcher = Pattern.compile("\\$x").matcher(template);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, substitution);
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
