package site.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import site.entity.Song;

public interface SongDAO extends JpaRepository<Song, Integer> {
	@Query(value = "select s from Song s where s.title like :title ")
	List<Song> songDAOfindSongByTitle(@Param("title") String title);
}
