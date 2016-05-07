package site.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import site.entity.Picture;


public interface PictureDAO {
	@Query(value = "select p from Picture p where p.title like :title ")
	List<Picture> pictureDAOfindPictureByTitle(@Param("title") String title);
}
