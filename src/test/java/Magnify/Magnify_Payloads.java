package Magnify;

import java.util.HashMap;
import java.util.Map;

public class Magnify_Payloads {

    public static Map<String,Object> getSyncPayLoadMapCreateUser(String iss, String sub, String name, String email, String access_level) {
        Map<String,Object> payload = new HashMap<>();
        payload.put("iss",iss);
        payload.put("sub",sub);
        payload.put("name",name);
        payload.put("email",email);
        payload.put("access_level",access_level);
        return payload;
    }

}
