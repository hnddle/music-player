package com.kosta.musicplayer;

import com.kosta.musicplayer.domain.Artist;
import com.kosta.musicplayer.domain.repository.ArtistRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class MusicPlayerApplicationTests {

    private final ArtistRepository artistRepository;
    private TestRestTemplate testRestTemplate;

    @Autowired
    public MusicPlayerApplicationTests(ArtistRepository artistRepository, TestRestTemplate testRestTemplate){
        this.artistRepository = artistRepository;
        this.testRestTemplate = testRestTemplate;
    }

    @Test
    void contextLoads() {
    }

    //@Test
    void createArtistTest(){
        Artist a = new Artist();
        a.setName("TestArtist");
        assertEquals(a.getName(), "TestArtist");
    }

    //@Test
    void setArtistRepositoryTest(){
        Artist a = new Artist();
        a.setName("TestArtist");
        //artistRepository.save(a);

        Artist result = artistRepository.findByName("TestArtist").get(0);
        assertEquals(result.getName(), a.getName());

    }

    @Test
    void createArtistApiTest(){
        Artist a = new Artist();
        a.setName("TestArtist");
        //artistRepository.save(a);

        testRestTemplate.postForEntity("/artists", a, Artist.class);

        ResponseEntity<Artist> response = testRestTemplate.getForEntity("/artists/1", Artist.class);

        // Response의 Body를 까보니 name이 같더라
        assertEquals(response.getBody().getName(), a.getName());
    }


}
