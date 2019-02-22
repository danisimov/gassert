package unit;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Base {
    static JsonObject json;

    @BeforeSuite
    public void start() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(Objects.requireNonNull(classLoader.getResource("Reference.json")).getFile());
            JsonElement jsonElement = new JsonParser().parse(new FileReader(file));
            json = jsonElement.getAsJsonObject();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            System.exit(0);
        }
    }
}
