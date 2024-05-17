package dev.lpa.music;

import jakarta.persistence.*;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private int songId;

    @Column(name = "song_title")
    private String songTitle;

    @Column(name = "track_number")
    private int trackNumber;

    public Song () {
    }

    public Song(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public String getSongTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songTitle='" + songTitle + '\'' +
                ", trackNumber=" + trackNumber +
                '}';
    }
}
