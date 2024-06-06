package Magnify;

import Utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Magnify_Base {
    public static Map<String,Object> dataFromJsonFile;
    static {
        try {
            dataFromJsonFile= JsonUtils.getJsonDataAsMap("JsonFiles/magnify.dev.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
