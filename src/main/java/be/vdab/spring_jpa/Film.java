package be.vdab.spring_jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tywinlannister on 01/09/16.
 */
@Entity

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="film_id")
    private Integer id;

    private String title;
   // private String description;
    @Column(name="release_year")
    private int releaseYear;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="film_actor",
            joinColumns = @JoinColumn(name="film_id"), //hiermee verwijs je naar film_id van film_actor
            inverseJoinColumns = @JoinColumn(name = "actor_id")) // link met de actor tabel
    private List<Actor> actors = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString(){
        return this.title + "(" +this.releaseYear + ")";
    }
}
