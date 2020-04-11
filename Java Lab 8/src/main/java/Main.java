import AlbumDAO.*;
import ArtistDAO.*;

public class Main {

    public static void main(String[] args) {
        AlbumDAOPattern albumDAO = new AlbumController();
        ArtistDAOPattern artistDAO = new ArtistController();

        artistDAO.create("Michael Jackson", "USA");

        albumDAO.create("Dangerous", artistDAO.findByName("Michael Jackson").getId(), 1991);
        albumDAO.create("Thriller", artistDAO.findByName("Michael Jackson").getId(), 1982);
    }
}

