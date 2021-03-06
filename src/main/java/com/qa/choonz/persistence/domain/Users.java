package com.qa.choonz.persistence.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long user_id;

    @Column
    private String user_name;
    @Column
    private String password;

    @OneToMany(mappedBy = "users", fetch =  FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference(value = "users")
    private List<Playlist> playList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return user_id.equals(users.user_id) &&
                user_name.equals(users.user_name) &&
                password.equals(users.password) &&
                playList.equals(users.playList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, user_name, password, playList);
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", playlist=" + playList +
                '}';
    }

    public Users(Long user_id, String user_name, String password) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
    }
    public Users( String user_name, String password) { ;
        this.user_name = user_name;
        this.password = password;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Playlist> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Playlist> playList) {
        this.playList = playList;
    }

}
