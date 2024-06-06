package Restutils;


import Reporting.ExtentReporting;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

import java.util.Map;

public class RestUtils {

    private static RequestSpecification getRequestSpecificationPost(String endPoint,String token, Object requestPayload, Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .auth().oauth2(token)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestPayload);
    }
    private static RequestSpecification getRequestSpecificationGet(String endPoint,String token,Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .auth().oauth2(token)
                .header("Content-Type", "application/json")
                .headers(headers)
                .contentType(ContentType.JSON);

    }
    private static void printRequestLogInReport(RequestSpecification requestSpecification) {
        QueryableRequestSpecification queryableRequestSpecification = SpecificationQuerier.query(requestSpecification);
        ExtentReporting.logInfoDetails("Endpoint is " + queryableRequestSpecification.getBaseUri());
        ExtentReporting.logInfoDetails("Method is " + queryableRequestSpecification.getMethod());
        ExtentReporting.logInfoDetails("Headers are " + queryableRequestSpecification.getHeaders().asList().toString());
        ExtentReporting.logInfoDetails("Request body is " + queryableRequestSpecification.getBaseUri());

    }

    private static void printResponseLogInReport(Response response) {
        ExtentReporting.logInfoDetails("Response status is " + response.getStatusCode());
        ExtentReporting.logInfoDetails("Response Headers are " + response.getHeaders().asList().toString());
        ExtentReporting.logInfoDetails("Response body is " + response.getBody());
        ExtentReporting.logJson(response.getBody().prettyPrint());
    }

    public static Response performPost(String endPoint,String token, Map<String, Object> requestPayload, Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationPost(endPoint,token, requestPayload, headers);
        Response response = requestSpecification.post();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }

    public static Response performPost(String endPoint, String token,String requestPayload, Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationPost(endPoint, token,requestPayload, headers);
        Response response = requestSpecification.post();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }

    public static Response performGet(String endPoint, String token,Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationGet(endPoint,token,headers);
        Response response = requestSpecification.get();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }
 }





