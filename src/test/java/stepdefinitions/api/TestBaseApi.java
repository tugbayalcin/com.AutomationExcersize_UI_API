package stepdefinitions.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
//import com.microstone.app.util.html2json.api.Params;
//import com.microstone.app.util.html2json.core.HtmlToJson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.scalajs.npm.htmltojson.HtmlToJson;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class TestBaseApi {
    protected RequestSpecification spec;
    public void setup(){
        spec=new RequestSpecBuilder().setBaseUri("https://automationexercise.com/api").build();
    }





}
