package com.example.recyclerview;

public class Film {
    private final String name;
    private final int imageID;
    private final String description;
    private final String[] stars;
    private final int year;

    public static final Film[] list = {
            new Film("The Shawshank Redimption", R.drawable.shawshank,
                    "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", 1994,
                    "Tim Robbins", "Morgan Freeman", "Bob Gunton"),

            new Film("The Dark Knight", R.drawable.dark_knight,
                    "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.", 2008,
                    "Christian Bale", "Heath Ledger", "Aaron Eckhart"),

            new Film("Good Father", R.drawable.good_father,
                    "The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.", 1972,
                    "Marlon Brando", "Al Pacino", "James Caan"),

            new Film("Lord Of Rings", R.drawable.lord_of_rings,
                    "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.", 2003,
                    "Elijah Wood", "Viggo Mortensen", "Ian McKellen"),

            new Film("The Conjuring", R.drawable.the_conjuring,
                    "Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by a dark presence in their farmhouse.", 2013,
                    "Patrick Wilson", "Vera Farmiga", "Ron Livingston"),

            new Film("Jumanji: Welcome to the Jungle\n", R.drawable.jumanji,
                    "Four teenagers are sucked into a magical video game, and the only way they can escape is to work together to finish the game.", 2017,
                    "Dwayne Johnson", "Karen Gillan", "Kevin Harta"),

            new Film("Fast & Furious", R.drawable.fast_and_furious,
                    "Brian O'Conner, back working for the FBI in Los Angeles, teams up with Dominic Toretto to bring down a heroin importer by infiltrating his operation.", 2009,
                    "Vin Diesel", "Paul Walker", "Michelle Rodriguez")
    };

    public Film(String name, int imageID, String description, int year, String... stars) {
        this.name = name;
        this.imageID = imageID;
        this.description = description;
        this.stars = stars;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public String getDescription() {
        return description;
    }

    public String[] getStars() {
        return stars;
    }

    public int getYear() {
        return year;
    }
}
