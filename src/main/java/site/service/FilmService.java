package site.service;

import java.util.List;

import site.entity.Film;

public interface FilmService {
	List<Film> filmserviceFindFilmByTitle(String title);

	List<Film> filmServiceGetAllFilms();

	/* admin */
	void filmServiceSaveOrUpdateFilm(String id, String title,
			String description, String director);

	void filmServiceDeleteFilm(int id);

	Film filmServiceFindFilmByID(int id);
}
