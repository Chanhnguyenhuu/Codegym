package vn.codegym.th_1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import vn.codegym.th_1.model.Province;

public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
