package ee.reneroost.spring.springretseptiapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Kategooria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String kirjeldus;

    @ManyToMany(mappedBy = "kategooriad")
    private Set<Retsept> retseptid;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getKirjeldus() {
        return kirjeldus;
    }

    public void setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    public Set<Retsept> getRetseptid() {
        return retseptid;
    }

    public void setRetseptid(Set<Retsept> retseptid) {
        this.retseptid = retseptid;
    }
}
