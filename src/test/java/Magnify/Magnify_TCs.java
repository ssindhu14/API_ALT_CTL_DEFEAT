package Magnify;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class Magnify_TCs extends Magnify_APIs {
    @Test
    public void Create_User()throws IOException {
        Map<String,Object> payLoad = Magnify_Payloads.getSyncPayLoadMapCreateUser("magmutual-develop.auth0.com", "775897","sindhu","sindhu@mmic.com","1");
        Response response = createuser(payLoad);
        Assert.assertEquals(response.statusCode(),201);
    }
    @Test
    public void Flat_Hirearchy() throws IOException{
        Response response = createflathirearchy();
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void Get_Secure() throws IOException{
        Response response = creategetsecure();
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void Search_all() throws IOException{
        Response response = createsearchall();
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void Create_Search() throws IOException{
        Response response = createsearch();
        Assert.assertEquals(response.statusCode(),200);
    }

}
