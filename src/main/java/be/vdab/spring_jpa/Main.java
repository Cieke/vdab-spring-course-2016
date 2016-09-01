package be.vdab.spring_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by tywinlannister on 01/09/16.
 */

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(Main.class);

        ActorRepository ar = context.getBean(ActorRepository.class);
        System.out.println(ar.count());
        List<Actor> actors = ar.findByFirstName("John");
        for (Actor actor : actors){
            System.out.println(actor);
        }



//        FilmRepository fr = context.getBean(FilmRepository.class);
//        List<Film> films = fr.findAll();
//        for(Film film : films){
//            System.out.println(film);
//            for (Actor actor: film.getActors()){
//                System.out.println("\t- " + actor);
//            }
//        }
    }

    @Bean
    //datasource
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
    @Bean
    //jpa vendor adaptor
    public JpaVendorAdapter jpaVendorAdaptor(){
        HibernateJpaVendorAdapter jva = new HibernateJpaVendorAdapter();
                jva.setDatabase(Database.MYSQL);
                jva.setShowSql(true);
                jva.setGenerateDdl(false);
                return jva;

    }


    @Bean
    //local container entity manager factory ben
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
                                             JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource(dataSource);
        emfb.setJpaVendorAdapter(jpaVendorAdapter);
        emfb.setPackagesToScan("be.vdab.spring_jpa");
        return emfb;
    }
}
