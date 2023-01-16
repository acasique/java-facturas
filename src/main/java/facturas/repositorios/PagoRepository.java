package facturas.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import facturas.entidades.PagoEntity;

@Repository
public interface PagoRepository extends CrudRepository<PagoEntity, Long>{

}
