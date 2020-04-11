package ArtistDAO;

import Lab8.Artist;

public interface ArtistDAOPattern
{
    void create(String name, String country);
    Artist findByName(String name);
}
