package vn.codegym.bt_11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.bt_11.model.Song;
import vn.codegym.bt_11.repository.ISongRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public void create(Song song) {
        songRepository.save(song);
    }

    @Override
    public void delete(int id) {
        songRepository.deleteById(id);
    }

    @Override
    public void update(Song song) {
        songRepository.save(song);
    }

    @Override
    public Optional<Song> findById(int id) {
        return songRepository.findById(id);
    }
}
