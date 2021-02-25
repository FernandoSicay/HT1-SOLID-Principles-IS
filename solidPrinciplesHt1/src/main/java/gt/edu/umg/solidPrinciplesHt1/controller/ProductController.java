package gt.edu.umg.solidPrinciplesHt1.controller;

import gt.edu.umg.solidPrinciplesHt1.model.service.IProductService;
import gt.edu.umg.solidPrinciplesHt1.model.service.ProductJsonWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {

    @GetMapping("/saveProduct")
    public String saveProduct(@RequestParam String product){
        IProductService productService = new ProductJsonWriter();
        try{
            return productService.saveProduct(product);
        }catch (Exception e){
            return "Opss, producto no ingresado";
        }
    }

}
