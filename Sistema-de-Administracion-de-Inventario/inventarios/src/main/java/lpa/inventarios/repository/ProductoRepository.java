package lpa.inventarios.repository;

import lpa.inventarios.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
