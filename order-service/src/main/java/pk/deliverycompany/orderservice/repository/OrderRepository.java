package pk.deliverycompany.orderservice.repository;

import pk.deliverycompany.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
