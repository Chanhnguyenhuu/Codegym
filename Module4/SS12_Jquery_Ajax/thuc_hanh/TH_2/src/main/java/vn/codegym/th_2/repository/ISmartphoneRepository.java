package vn.codegym.th_2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.th_2.model.Smartphone;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}
