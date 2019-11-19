import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
        pool = new ArrayList<Movie>();
        for (int i=0; i<movies.length; i++)
        {
            pool.add(movies[i]);
        }
    }

    public ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    {
        ArrayList<Movie> studioworks= new ArrayList<Movie>();
        for (int i=0; i<pool.size(); i++)
        {
            if (studio.equals(pool.get(i).getStudio()))
            {
                studioworks.add(pool.get(i));
            }
        }
        return studioworks;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestrating(ArrayList<Movie> movies)
    {
        Movie tim= movies.get(0);
        double rating=movies.get(0).getRating();
        for (int i=1; i<movies.size(); i++)
        {
            if (movies.get(i).getRating()> rating)
            {
                tim= movies.get(i);
                rating= movies.get(i).getRating();
            }
        }
        
        return tim;
        
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        highestRated.add(getHighestrating(getByStudio("Disney")));
        highestRated.add(getHighestrating(getByStudio("Ghibli")));
        highestRated.add(getHighestrating(getByStudio("Indy")));
        // Your code goes here
         return highestRated;
        // return highestRated;
        
    }

}
