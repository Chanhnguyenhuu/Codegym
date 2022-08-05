package vn.codegym.bt_11.service;

import vn.codegym.bt_11.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {

    List<Song> findAll();
    void create(Song song);
    void delete(int id);
    void update(Song song);
    Optional<Song> findById(int id);
}
