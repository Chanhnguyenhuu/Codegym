package vn.codegym.repository;

import vn.codegym.model.Song;

import java.util.List;

public interface ISongRepository {
    void create(Song song);
    void delete(int id);
    List<Song> findAll();
    Song listen(Song song);
    void update(Song song);
    Song findOne(int id);
}
