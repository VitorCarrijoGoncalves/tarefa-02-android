package br.com.senaigo.mobile.tarefa02.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Album implements Serializable {

    private Integer id;

    private Integer userId;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserIdId() {
        return id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(id, album.id) &&
                Objects.equals(title, album.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title);
    }
}
