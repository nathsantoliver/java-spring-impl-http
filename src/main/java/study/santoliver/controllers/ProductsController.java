package study.santoliver.controllers;

import org.springframework.stereotype.Controller;
import study.santoliver.services.ProductService;

@Controller
public class ProductsController {

    private final ProductService productService;

    // we use DI through the controller's constructor parameters
    // to get the service bean from the Spring context
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

}
