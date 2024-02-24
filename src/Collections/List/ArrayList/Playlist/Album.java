package Collections.List.ArrayList.Playlist;

import java.util.ArrayList;

public class Album {
//    , and an ArrayList that holds objects of type Song called songs.
    String name, artist;
    ArrayList <Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }
    public boolean addSong(String title , double duration){

        for (Song song : songs){
            if (song.getTitle().equalsIgnoreCase(title)){
                Song song1 = new Song(title, duration);
                songs.add( song );
                return true;
            }
        }
        return false;
    }

}
