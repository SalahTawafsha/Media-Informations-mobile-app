package com.example.recyclerview;

public class TVShow {
    private final String name;
    private final int imageID;
    private final String description;
    private final String[] stars;
    private final int year;
    private final int episodeDuration;
    private final int numOfEpisodes;

    public static final TVShow[] list = {
            new TVShow("Breaking Bad", R.drawable.breaking_bad,
                    "A chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine with a former student in order to secure his family's future.", 2008, 49, 62,

                    "Bryan Cranston", "Aaron Paul", "Anna Gunn"
            ),

            new TVShow("Game of Thrones", R.drawable.game_of_thrones,
                    "Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia.", 2011, 57, 73,

                    " Emilia Clarke", "Peter Dinklage", "Kit Harington"),


            new TVShow("Sherlock", R.drawable.sherlock,
                    "A modern update finds the famous sleuth and his doctor partner solving crime in 21st-century London.", 2010, 88, 13,

                    "Benedict Cumberbatch", "Martin Freeman", "Una Stubbs"
            ),

            new TVShow("SOZ", R.drawable.the_oath,
                    "Yavuz, a well-trained Turkish soldier, is in Istanbul with his fiance where a terrorist operation takes place. Bahar, who is not a surgeon, tries to save his fiance. After this incident, Yavuz goes back to Karabayir and Bahar follows him all the way to give him something that belongs to him.", 2017, 140, 84,
                    "Tolga Saritas", "Meric Aral", "Nihat Altinkaya"
            ),

    };

    public TVShow(String name, int imageID, String description, int year, int episodeDuration, int numOfEpisodes, String... stars) {
        this.name = name;
        this.imageID = imageID;
        this.description = description;
        this.stars = stars;
        this.year = year;
        this.episodeDuration = episodeDuration;
        this.numOfEpisodes = numOfEpisodes;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public int getNumOfEpisodes() {
        return numOfEpisodes;
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
