package Monocle;

import Magnify.Magnify_Payloads;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class Monocle_TCs extends Monocle_APIs {
    @Test
    public void flat_hirearchy() throws IOException {
        Response response = createflathirearchy();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test
    public void nested_hirearchy() throws IOException {
        Response response = createnestedhirearchy();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test
    public void hirearchy() throws IOException {
        Response response = createhirearchy();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test
    public void available() throws IOException {
        Response response = createavailable();
        Assert.assertEquals(response.statusCode(), 200);
    }

}
