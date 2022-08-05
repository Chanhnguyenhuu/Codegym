package vn.codegym.service;

import vn.codegym.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongService implements ISongService {

    private final List<Song> songList = new ArrayList<>();
    @Override
    public void create(Song song) {
        songList.add(song);
    }

    @Override
    public List<Song> findAll() {
        return songList;
    }
}
