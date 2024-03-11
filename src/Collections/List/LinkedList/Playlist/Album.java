package Collections.List.LinkedList.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name ;
    private String artist ;
    private ArrayList  <Song> songs = new ArrayList<>();
    private LinkedList <Song> playlist =new LinkedList<>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public  boolean addSong(String title, double duration) {
        if (! songs.contains (new Song(title , duration))){
            songs.add(new Song(title , duration) );
            return true;
        }
        return false;
    }
    public Song findSong(String title){
        for (Song song : songs){
            if (song.getTitle().equalsIgnoreCase(title)){
             return song;
            }
        }
        return null;
    }

    public void addToPlayList(int trackNumber, LinkedList Song ){

    }
}
