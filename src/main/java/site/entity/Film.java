package site.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	@Column(columnDefinition = "text")
	private String description;
	private String director;

	public Film() {
		// TODO Auto-generated constructor stub
	}

	public Film(String title, String description, String director) {
		this.title = title;
		this.description = description;
		this.director = director;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Film '" + title + "', Description: "
				+ description + ", Director " + director + "";
	}

}
