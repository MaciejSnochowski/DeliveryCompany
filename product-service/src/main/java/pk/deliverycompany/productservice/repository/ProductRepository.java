package pk.deliverycompany.productservice.repository;

import pk.deliverycompany.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
