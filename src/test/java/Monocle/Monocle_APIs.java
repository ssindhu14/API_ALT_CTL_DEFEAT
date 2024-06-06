package Monocle;

import Magnify.Magnify_Base;
import Restutils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class Monocle_APIs {
    public Response createflathirearchy(){
        String endPoint =(String) Monocle_Base.dataFromJsonFile.get("user_get");
        String token =(String) Monocle_Base.dataFromJsonFile.get("token");
        System.out.println(token);
        return RestUtils.performGet(endPoint,token,new HashMap<>());
    }
    public Response createnestedhirearchy(){
        String endPoint =(String) Monocle_Base.dataFromJsonFile.get("user_get");
        String token =(String) Monocle_Base.dataFromJsonFile.get("token");
        System.out.println(token);
        return RestUtils.performGet(endPoint,token,new HashMap<>());
    }
    public Response createhirearchy(){
        String endPoint =(String) Monocle_Base.dataFromJsonFile.get("user_get");
        String token =(String) Monocle_Base.dataFromJsonFile.get("token");
        System.out.println(token);
        return RestUtils.performGet(endPoint,token,new HashMap<>());
    }
    public Response createavailable(){
        String endPoint =(String) Monocle_Base.dataFromJsonFile.get("user_get");
        String token =(String) Monocle_Base.dataFromJsonFile.get("token");
        System.out.println(token);
        return RestUtils.performGet(endPoint,token,new HashMap<>());
    }
}
