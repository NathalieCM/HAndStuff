package site.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import site.entity.Film;
import site.service.FilmService;

@Controller
public class FilmController {
	@Autowired
	private FilmService filmService;

	@RequestMapping(value = "/show_all_films")
	public String show_all_films(Model model) {

		model.addAttribute("AllFilms", filmService.filmServiceGetAllFilms());

		return "film-showAllFilms";
	}

	/* !!!!!!!!!!!! */
	/* !!!!!!!!!!!!correct request for author - NOT new Author only var */
	@RequestMapping(value = "/addNewFilm", method = RequestMethod.POST)
	public String addNewFilm(@RequestParam(value = "title") String title,
			@RequestParam(value = "description") String description,
			@RequestParam(value = "director") String director,
			@RequestParam("id") String id) {

		filmService
				.filmServiceSaveOrUpdateFilm(id, title, description, director);

		return "redirect:/toAddFilm";

	}

	@RequestMapping(value = "/findFilmByTitle")
	public String findFilmByTitle(@RequestParam(value = "title") String title,
			Model model) {

		model.addAttribute("filmByTitle",
				filmService.filmserviceFindFilmByTitle(title));

		return "film-forSearchFilm";
	}

	/* modify */
	@RequestMapping(value = "/modifyFilm-{id}")
	public String modifyFilm(@PathVariable(value = "id") String id, Model model) {
		//why cast for film is needed??????
		//??????????????????
		Film film = (Film) filmService.filmServiceFindFilmByID(Integer.parseInt(id));
		model.addAttribute("film", film);
		model.addAttribute("director", film.getDirector());
		return "film-addFilm"; /* доделать реф на страницу adbook */
	}

	/* delete */
	@RequestMapping(value = "/deleteFilm-{id}")
	public String deleteFilm(@PathVariable(value = "id") String id) {
		filmService.filmServiceDeleteFilm(Integer.parseInt(id));
		return "redirect:/show_all_films";
	}

}
