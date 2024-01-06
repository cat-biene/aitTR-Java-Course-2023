package album.dao;

import album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {

    // fields
    private Photo[] photos;
    private int size;

    // constructor
    public AlbumImpl(int capacity) {
        photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        if(photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
         }
        // ищем индекс куда вставить
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
        // обработка индекса
        index = index >= 0 ? index : - index - 1;
        // раздвигаем массив на одно место в право
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        // ищем фото
        for (int i = 0; i < size; i++) {
            if(photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                // надвигаем массив на найденную позицию
                System.arraycopy(photos, i + 1, photos, i, size - 1 - i);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId); // нашли фото
        if (photo == null) {
            return false;
        }
        photo.setUrl(url); // обновили url
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null);
        for (int i = 0; i < size; i++) {
            if(pattern.equals(photos[i])) {
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findPredicate(p -> albumId == p.getAlbumId());
    }

    private Photo[] findPredicate(Predicate<Photo> predicate) {
        Photo[] res = new Photo[size];
        int j = 0; // счетчик найденых фото в альбоме
        for (int i = 0; i < size; i++) {
            if(predicate.test(photos[i])) {
                res[j] = photos[i];
                j++;
            }
            // заполнили массив но в нем после j идут null
        }
        return Arrays.copyOf(res, j); // вернули обрезанный массив без элементов
    }
    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Photo pattern = new Photo(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay()); // вводим объектную переменную
        int from = -Arrays.binarySearch(photos, 0, size, pattern, comparator) -1; // находим индекс начального фото (левый край)
//        from = from >= 0 ? from : -from - 1;
        pattern = new Photo(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX)); // находим правый край
        int to = -Arrays.binarySearch(photos, 0, size, pattern, comparator) - 1;
//        to = to >= 0 ? to : -to - 1;
        return Arrays.copyOfRange(photos, from, to); // Range - диапазон, создаем новый массив с нужными фото
    }

    @Override
    public Photo[] getPhotoBetweenDate1(LocalDate dateFrom, LocalDate dateTo) {
        Photo[] docArray = new Photo[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            LocalDateTime docDate = photos[i].getDate();
            if(docDate.isAfter(dateFrom.atStartOfDay()) && docDate.isBefore(dateTo.plusDays(1).atStartOfDay())) {
                docArray[j] = photos[i];
                j++;
            }
            return Arrays.copyOf(docArray, j);
        }

        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }

    static Comparator<Photo> comparator =  (p1, p2) -> {
        int res =  p1.getDate().compareTo(p2.getDate()); // date field
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId()); // photoId field

    };
}
