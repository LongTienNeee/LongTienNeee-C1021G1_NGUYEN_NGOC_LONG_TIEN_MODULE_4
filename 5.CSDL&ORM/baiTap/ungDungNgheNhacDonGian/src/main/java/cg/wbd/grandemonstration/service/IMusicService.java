package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void addNew(Music music);

    void edit(int id);

    void delete(Music music);
}
