package gt.edu.umg.solidPrinciplesHt1.model.service;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProductJsonWriter implements  IProductService{


    @Override
    public String saveProduct(String product) {
        JSONObject sampleObject = new JSONObject();
        sampleObject.put("product", product);

        try {
            Files.write(Paths.get("docs\\JsonFilesExamples\\product.json"),
                    sampleObject.toJSONString().getBytes());
            return "Product saved success";
        } catch (IOException e) {
            return "Opss, an error ocurred, try again";
        }
    }
}
