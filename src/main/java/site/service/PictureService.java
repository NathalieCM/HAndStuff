package site.service;

import java.util.List;

import site.entity.Picture;



public interface PictureService {
	List<Picture> pictureserviceFindPictureByTitle(String title);

	List<Picture> pictureServiceGetAllPictures();

	/* admin */
	void pictureServiceSaveOrUpdatePicture(String id,String title, String artist);
	
	void pictureServiceDeletePicture(int id);
	
	Picture pictureServiceFindPictureByID(int id);
}
