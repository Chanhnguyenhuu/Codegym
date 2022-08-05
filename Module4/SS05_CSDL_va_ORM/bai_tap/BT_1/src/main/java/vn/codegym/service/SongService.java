package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Song;
import vn.codegym.repository.ISongRepository;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository songRepository;

    @Override
    public void create(Song song) {
        songRepository.create(song);
    }

    @Override
    public void delete(int id) {
        songRepository.delete(id);
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song listen(Song song) {
        return null;
    }

    @Override
    public void update(Song song) {
        songRepository.update(song);
    }

    @Override
    public Song findOne(int id) {
        return songRepository.findOne(id);
    }
}
