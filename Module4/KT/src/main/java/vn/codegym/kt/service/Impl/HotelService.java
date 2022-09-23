package vn.codegym.kt.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.kt.model.Hotel;
import vn.codegym.kt.repository.IE2Repository;
import vn.codegym.kt.service.IE2Service;

import java.util.List;
import java.util.Optional;

@Service
public class E2Service implements IE2Service {

    @Autowired
    private IE2Repository e2Repository;

    @Override
    public Page<Hotel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Hotel> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void create(Hotel customer) {

    }

    @Override
    public void edit(Hotel customer) {

    }

    @Override
    public Optional<Hotel> findById(int id) {
        return Optional.empty();
    }
}
