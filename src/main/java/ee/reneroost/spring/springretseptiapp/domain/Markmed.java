package ee.reneroost.spring.springretseptiapp.domain;

import javax.persistence.*;

@Entity
public class Markmed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Retsept retsept;

    @Lob
    private String retseptiMarkmed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Retsept getRetsept() {
        return retsept;
    }

    public void setRetsept(Retsept retsept) {
        this.retsept = retsept;
    }

    public String getRetseptiMarkmed() {
        return retseptiMarkmed;
    }

    public void setRetseptiMarkmed(String retseptiMarkmed) {
        this.retseptiMarkmed = retseptiMarkmed;
    }
}
