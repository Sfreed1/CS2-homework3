/**
 * Album.java
 * A program that creates an object Album. Each Album is composed of an album and artist
 * Part of Homework 4, Part 1
 */

public class Album{

    private String album, artist;
    
    /**
     * Function that creates Album based off full string
     * @param String full
     */
    public Album(String full){
        String [] albArt = full.split(" - ");
        if (albArt.length > 1){
            artist = albArt[0];
            album = albArt[1];
        }
    }

    /**
     * Function that creates Album based off seperate album and artist inputs
     * @param art
     * @param alb
     */
    public Album(String art, String alb){
        album = alb;
        artist = art;
    }

    /**
     * Function that gets an Album
     * @return album
     */
    public String getAlbum(){
        return album;
    }

    /**
     * Function that gets an Artist
     * @return artist
     */
    public String getArtist(){
        return artist;
    }

    /**
     * Function that creates a full string of Artist + Album
     * @return String str
     */
    public String toString(){
        String str = artist + " - " + album;
        return str;
    }

    /**
     * Function to see if there are 2 instances of the same album.
     * @return false if there is no instance, true if there is an instance
     */
    public boolean equals(Object alb){
        if (!(alb instanceof Album)){
            return false;
        }else{
            Album a = (Album) alb;
            return this.artist.equalsIgnoreCase(a.artist) && this.album.equalsIgnoreCase(a.album);
        }
    }
}