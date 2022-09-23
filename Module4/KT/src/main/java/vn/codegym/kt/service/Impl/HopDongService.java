package vn.codegym.kt.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.kt.repository.IE1Repository;
import vn.codegym.kt.service.IE1Service;

import java.util.List;
import java.util.Optional;

@Service
public class E1Service implements IE1Service {

    @Autowired
    private IE1Repository e1Repository;

    @Override
    public Page<A> findAll(Pageable pageable) {
        return e1Repository.findAll(pageable);
    }

    @Override
    public List<A> findAll() {
        return e1Repository.findAll();
    }

    @Override
    public void delete(int id) {
        e1Repository.deleteById(id);
    }

    @Override
    public void create(A a) {
        e1Repository.save(a);
    }

    @Override
    public void edit(A a) {
        e1Repository.save(a);
    }

    @Override
    public Optional<A> findById(int id) {
        return e1Repository.findById(id);
    }
}
