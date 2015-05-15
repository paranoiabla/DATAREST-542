package demo.pocessor;

import demo.model.ProductModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.Resources;

/**
 * @author Petar Tahchiev
 * @since 0.6
 */
public class ProductResourceProcessor implements ResourceProcessor<Resources<ProductModel>> {

    @Override
    public Resources<ProductModel> process(Resources<ProductModel> resource) {
        resource.add(new Link("/synchronize"));
        return resource;
    }
}
