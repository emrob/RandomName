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
            names.add("Emma");
            names.add("Derek");
            names.add("Mark");
            names.add("Darrell");
            names.add("Rosemary");
            names.add("Will");
            names.add("Herbie");
            Collections.shuffle(names);

            String result = names.get(0);

            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "results.vtl");


        }, velocityTemplateEngine);


    }

}



