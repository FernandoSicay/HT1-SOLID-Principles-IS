package gt.edu.umg.solidPrinciplesHt1.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class ProductController {

    @GetMapping("/saveProduct")
    public String saveProduct(@RequestParam String product){
        return saveProductOnJson(product);
    }



    public String saveProductOnJson(String product){
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
