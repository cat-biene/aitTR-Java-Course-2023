package album.model;

import java.time.LocalDateTime;

public class Photo implements Comparable<Photo> {

    //fields
    private int albumId;
    private int photoId;
    private String title;
    private String url;
    private LocalDateTime date;

    //constructor
    public Photo(int albumId, int photoId, String title, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    // getter
    public int getAlbumId() {
        return albumId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    // setter

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    // method toString
    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", photoId=" + photoId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Photo photo = (Photo) object;
        return albumId == photo.albumId && photoId == photo.photoId;
    }

    @Override
    public int hashCode() {
        int result = albumId;
        result = 31 * result + photoId;
        return result;
    }

    // method compareTo
    @Override
    public int compareTo(Photo o) {
        // надо определить как сортировать объекты в массиве Photo по двум полям albumId и photoId
        int res = Integer.compare(albumId, o.albumId);
        return res != 0 ? res : Integer.compare(photoId, o.photoId); // тернарный оператор
    }
}
