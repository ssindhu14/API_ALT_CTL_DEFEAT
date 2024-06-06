package Magnify;

import Restutils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class Magnify_APIs {
        public Response createuser(Map<String,Object> createPayload){
            String endPoint =(String) Magnify_Base.dataFromJsonFile.get("user_post");
            String token =(String) Magnify_Base.dataFromJsonFile.get("token");
            System.out.println(token);
            return RestUtils.performPost(endPoint,token,createPayload,new HashMap<>());
        }
    public Response createflathirearchy(){
        String endPoint =(String) Magnify_Base.dataFromJsonFile.get("user_get");
        String token =(String) Magnify_Base.dataFromJsonFile.get("token");
        System.out.println(token);
        return RestUtils.performGet(endPoint,token,new HashMap<>());
    }
    public Response creategetsecure(){
        String endPoint =(String) Magnify_Base.dataFromJsonFile.get("user_get");
        String token =(String) Magnify_Base.dataFromJsonFile.get("token");
        System.out.println(token);
        return RestUtils.performGet(endPoint,token,new HashMap<>());
    }
    public Response createsearchall(){
        String endPoint =(String) Magnify_Base.dataFromJsonFile.get("user_get");
        String token =(String) Magnify_Base.dataFromJsonFile.get("token");
        System.out.println(token);
        return RestUtils.performGet(endPoint,token,new HashMap<>());
    }
    public Response createsearch(){
        String endPoint =(String) Magnify_Base.dataFromJsonFile.get("user_get");
        String token =(String) Magnify_Base.dataFromJsonFile.get("token");
        System.out.println(token);
        return RestUtils.performGet(endPoint,token,new HashMap<>());
    }

    }


