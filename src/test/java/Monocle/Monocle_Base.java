package Monocle;

import Utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Monocle_Base {
    public static Map<String,Object> dataFromJsonFile;
    static {
        try {
            dataFromJsonFile= JsonUtils.getJsonDataAsMap("JsonFiles/monocle.dev.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
