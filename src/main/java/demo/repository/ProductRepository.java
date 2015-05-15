package demo.repository;

import demo.model.CategoryModel;
import demo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author Petar Tahchiev
 * @since 0.6
 */
public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    Iterable<ProductModel> findByIdEquals(Long id);

    Iterable<ProductModel> findByCategoryEquals(@Param("category") CategoryModel category);
}
