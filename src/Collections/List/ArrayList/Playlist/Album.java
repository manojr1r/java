package Collections.List.ArrayList.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
//    , and an ArrayList that holds objects of type Song called songs.
    private String name, artist;
    ArrayList <Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title , double duration){
        if(findSong(title) == null){
            Song song = new Song(title, duration);
            songs.add( song );
            return true;
        }
        return false;
    }

    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
//        int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song
        //if song exist
        int index = trackNumber - 1;
        if ((index >= 0) && (index < playlist.size())){
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
//        , has two parameters of type String (title of song) and LinkedList (the playlist) that
        Song checkSong = findSong(title);
        if (checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        return false;
    }

}
