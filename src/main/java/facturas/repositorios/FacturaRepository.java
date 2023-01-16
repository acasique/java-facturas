package facturas.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import facturas.entidades.ContribuyenteEntity;
import facturas.entidades.FacturaEntity;

@Repository
public interface FacturaRepository extends CrudRepository<FacturaEntity, Long>{

}
