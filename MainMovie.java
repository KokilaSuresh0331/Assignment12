package assignment12;

abstract class Movie {
    private String title;
    private int duration;
    private String genre;

    public Movie(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    
    public abstract double calculateRevenue();
    public abstract String getDirector();
    @Override
    public String toString() {
        return "Title: " + getTitle() + "\nDirector: " + getDirector() + "\nGenre: " + getGenre()
                + "\nDuration: " + getDuration() + " minutes" + "\nRevenue: " + calculateRevenue();
    }
}

class ActionMovie extends Movie {
    private String director;
    private double boxOffice;

    public ActionMovie(String title, int duration, String genre, String director, double boxOffice) {
        super(title, duration, genre);
        this.director = director;
        this.boxOffice = boxOffice;
    }

    @Override
    public double calculateRevenue() {

        return boxOffice;
    }

    @Override
    public String getDirector() {
        return director;
    }
}

class ComedyMovie extends Movie {
    private String director;
    private double boxOffice;

    public ComedyMovie(String title, int duration, String genre, String director, double boxOffice) {
        super(title, duration, genre);
        this.director = director;
        this.boxOffice = boxOffice;
    }

    @Override
    public double calculateRevenue() {
     
        return boxOffice;
    }

    @Override
    public String getDirector() {
        return director;
    }
}

public class MainMovie {
    public static void main(String[] args) {
        
        ActionMovie actionMovie = new ActionMovie("Vikram", 150, "Action", "LogeshKanagaraj", 500000000);
        ComedyMovie comedyMovie = new ComedyMovie("kalakalappu", 120, "Comedy", "Suder C", 300000000);
        System.out.println(actionMovie);
        System.out.println();
        System.out.println(comedyMovie);
          }
}