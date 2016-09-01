package be.vdab.spring_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by tywinlannister on 01/09/16.
 */
public interface ActorRepository extends JpaRepository <Actor, Integer> { //integer komt van primary key,

    List<Actor> findByFirstName(String fn);

}
