package vn.codegym.bt_11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.bt_11.model.Song;


public interface ISongRepository extends JpaRepository<Song, Integer> {
}
