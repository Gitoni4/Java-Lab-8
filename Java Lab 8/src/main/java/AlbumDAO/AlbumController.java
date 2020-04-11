package AlbumDAO;

import MainePackage.Database;

import java.sql.SQLException;
import java.sql.Statement;

public class AlbumController implements AlbumDAOPattern
{
    Database db;
    public AlbumController()
    {
        db = Database.getInstance();

    }

    public void create(String name, int artistId, int releaseYear)
    {
        try {
            Statement statement = db.dbConnection.createStatement();
            String query = String.format("INSERT INTO albums (name, artist_id, release_year) VALUES ('%s', %d, %d)", name, artistId, releaseYear);
            int rowsInserted = statement.executeUpdate(query);
            System.out.println(String.format("Number of rows inserted: %d", rowsInserted));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
