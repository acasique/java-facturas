package facturas.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import facturas.entidades.ContribuyenteEntity;

@Repository
public interface ContribuyenteRepository extends CrudRepository<ContribuyenteEntity, Long>{

}
