import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/one", (req, res) -> {
            ArrayList<String> names = new ArrayList<String>();

            RandomName randomName = new RandomName(new ArrayList<String>());
            String result = randomName.returnRandomName();


            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result.vtl");

        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            ArrayList<String> names = new ArrayList<String>();

            RandomName randomName = new RandomName(new ArrayList<String>());
            String result = randomName.returnTwoNames();


            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result2.vtl");

        }, velocityTemplateEngine);

        get("/three", (req, res) -> {
            ArrayList<String> names = new ArrayList<String>();

            RandomName randomName = new RandomName(new ArrayList<String>());
            String result = randomName.returnThreeNames();


            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result3.vtl");

        }, velocityTemplateEngine);
    }

}



