package com.qa.choonz.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.qa.choonz.persistence.domain.Album;
import com.qa.choonz.persistence.domain.Playlist;

public class TrackDTO {

    private Long id;
    private String name;
    private Album album;

	public List<Playlist> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Playlist> playlist) {
		this.playlist = playlist;
	}

	private List<Playlist> playlist = new ArrayList<>();

	public TrackDTO(Long id, String name, Album album, List<Playlist> playlist, int duration, String lyrics) {
		this.id = id;
		this.name = name;
		this.album = album;
		this.playlist = playlist;
		this.duration = duration;
		this.lyrics = lyrics;
	}

	public TrackDTO(Long id, String name, List<Playlist> playlist) {
		super();
		this.id = id;
		this.name = name;
		this.playlist = playlist;
	}

	private int duration;
    private String lyrics;

    public TrackDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

//	public TrackDTO(Long id, String name, Album album, Playlist playlist, int duration, String lyrics) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.album = album;
//		this.playlist = playlist;
//		this.duration = duration;
//		this.lyrics = lyrics;
//	}

	public TrackDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

//	public Playlist getPlaylist() {
//		return playlist;
//	}
//
//	public void setPlaylist(Playlist playlist) {
//		this.playlist = playlist;
//	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	@Override
	public String toString() {
//		return "TrackDTO [id=" + id + ", name=" + name + ", album=" + album + ", playlist=" + playlist + ", duration="
//				+ duration + ", lyrics=" + lyrics + "]";
	
	
	StringBuilder builder = new StringBuilder();
    builder.append("TrackDTO [id=").append(id).append(", name=").append(name).append(", album=")
            .append(album).append(", playlist=").append(playlist).append(", duration=").append(duration).append(", lyrics=").append(lyrics)
            .append("]");
    return builder.toString();
    
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((album == null) ? 0 : album.hashCode());
		result = prime * result + duration;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lyrics == null) ? 0 : lyrics.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((playlist == null) ? 0 : playlist.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrackDTO other = (TrackDTO) obj;
		if (album == null) {
			if (other.album != null)
				return false;
		} else if (!album.equals(other.album))
			return false;
		if (duration != other.duration)
			return false;
		if (id != other.id)
			return false;
		if (lyrics == null) {
			if (other.lyrics != null)
				return false;
		} else if (!lyrics.equals(other.lyrics))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (playlist == null) {
			if (other.playlist != null)
				return false;
		} else if (!playlist.equals(other.playlist))
			return false;
		return true;
	}
    
    

}
