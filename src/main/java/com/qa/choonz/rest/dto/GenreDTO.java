package com.qa.choonz.rest.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.qa.choonz.persistence.domain.Album;

public class GenreDTO {

    private Long id;
    private String name;
    private String description;
    private List<Album> albums = new ArrayList<>();

    public GenreDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public GenreDTO(Long id, String name, String description, List<Album> albums) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.albums = albums;
    }

    public GenreDTO(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public GenreDTO(Long id, String name) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GenreDTO [id=").append(id).append(", name=").append(name).append(", description=")
                .append(description).append(", albums=").append(albums).append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(albums, description, id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenreDTO)) {
            return false;
        }
        GenreDTO other = (GenreDTO) obj;
        return Objects.equals(albums, other.albums) && Objects.equals(description, other.description) && id == other.id
                && Objects.equals(name, other.name);
    }

}
