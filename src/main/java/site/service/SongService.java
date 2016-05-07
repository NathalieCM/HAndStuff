package site.service;

import java.util.List;

import site.entity.Song;


public interface SongService {
	List<Song> songserviceFindSongByTitle(String title);

	List<Song> songServiceGetAllSongs();

	/* admin */
	void songServiceSaveOrUpdateSong(String id,String title, String artist);
	
	void songServiceDeleteSong(int id);
	
	Song songServiceFindSongByID(int id);
}
