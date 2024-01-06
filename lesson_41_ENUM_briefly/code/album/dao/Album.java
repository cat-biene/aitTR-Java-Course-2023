package album.dao;

import album.model.Photo;

import java.time.LocalDate;

public interface Album {
    boolean addPhoto(Photo photo);
    boolean removePhoto(int photoId, int albumId);
    boolean updatePhoto(int photoId, int albumId, String url);
    Photo getPhotoFromAlbum(int photoId, int albumId);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    Photo[] getPhotoBetweenDate1(LocalDate dateFrom, LocalDate dateTo);
    int size(); // quantity of photos in all album


}
