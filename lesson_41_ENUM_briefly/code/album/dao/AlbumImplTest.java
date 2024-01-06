package album.dao;

import album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    Photo[] photo;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
         Album album = new AlbumImpl(7);
         Photo[] photo = new Photo[6];
        photo[0] = new Photo(1, 1, "t1", "url1", now.minusDays(2));
        photo[1] = new Photo(1, 2, "t2", "url2", now.minusDays(3));
        photo[2] = new Photo(1, 3, "t3", "url3", now.minusDays(5));
        photo[3] = new Photo(2, 1, "t1", "url4", now.minusDays(7));
        photo[4] = new Photo(2, 2, "t2", "url5", now.minusDays(7));
        photo[5] = new Photo(2, 3, "t3", "url6", now.minusDays(7));

        // незабыть положить эти photo в альбом методом addPhoto
        for (int i = 0; i < photo.length; i++) {
            album.addPhoto(photo[i]);

        }
    }

    @Test
    void addPhoto() {
        // нельзя добавить null
        assertFalse(album.addPhoto(null));
        // нельзя добавить имеющееся
        assertFalse(album.addPhoto(photo[1]));
        // проверить возможность добавления
        Photo photo = new Photo(3,1,"t1", "url1", now);
        assertTrue(album.addPhoto(photo));
        // проверить ожидаемое количество после добавления
        assertEquals(7, album.size());
        // нельзя превысить capacity
        Photo photo2 = new Photo(3,2,"t2", "url2", now);
        assertFalse(album.addPhoto(photo2));
    }

    @Test
    void removePhoto() {
        // удаление имеющегося фото
        assertTrue(album.removePhoto(3,1)); // удалить photo[2]
        // удаление отсутвубщего фото
        assertFalse(album.removePhoto(5, 1));
        // проверка количества
        assertEquals(5, album.size());
        // ненайдем удаленное фото
        assertNull(album.getPhotoFromAlbum(3,1));

    }

    @Test
    void updatePhoto() {
        // получилось обновить фото
        assertTrue(album.updatePhoto(1,1, "newUrl")); // обновили
        assertEquals("newUrl", album.getPhotoFromAlbum(1,1).getUrl()); // проверили
    }

    @Test
    void getPhotoFromAlbum() {
        // проверяем нахождение фото
        assertEquals(photo[0], album.getPhotoFromAlbum(1,1));
        // ищем не существующее фото
        assertNull(album.getPhotoFromAlbum(1, 3));
    }

    @Test
    void getaAllPhotoFromAlbum() {
        // метод возращает масив фото
        Photo[] expected = {photo[3], photo[4], photo[5]};
        Photo[] actual = album.getAllPhotoFromAlbum(2);
        Arrays.sort(actual); // сортируем массив
        assertArrayEquals(expected, actual);

    }

    @Test
    void getPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate(); // оставляем только дату, убираем время
        Photo[] actual = album.getPhotoBetweenDate(ld.minusDays(6), ld.minusDays(1));
        Arrays.sort(actual); // сортируем массив
        Photo[] expexted = {photo[0], photo[1], photo[2]};
        assertArrayEquals(expexted, actual);

    }

    @Test
    void sizeTest() {
        assertEquals(6, album.size());
    }
}