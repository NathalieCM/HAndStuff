package site.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.dao.FilmDAO;
import site.entity.Film;
import site.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService{
	@Autowired
	private FilmDAO filmDAO;

	public List<Film> filmserviceFindFilmByTitle(String title) {
		return filmDAO.filmDAOfindFilmByTitle(title);
	}

	public List<Film> filmServiceGetAllFilms() {
		
		return filmDAO.findAll();
	}

	public void filmServiceSaveOrUpdateFilm(String id, String title,
			String description, String director) {
		Film film = new Film(title, description, director);
		
		if (id != null && !id.isEmpty()) {
			film.setId(Integer.parseInt(id));
		}
		filmDAO.save(film);
		
	}

	public void filmServiceDeleteFilm(int id) {

		filmDAO.delete(id);
		
	}

	public Film filmServiceFindFilmByID(int id) {

		return filmDAO.findOne(id);
	}

	
}
