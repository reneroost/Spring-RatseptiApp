package ee.reneroost.spring.springretseptiapp.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Koostisosa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kirjeldus;
    private BigDecimal kogus;

    @OneToOne(fetch = FetchType.EAGER)
    private MootUhik mootUhik;

    @ManyToOne
    private Retsept retsept;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKirjeldus() {
        return kirjeldus;
    }

    public void setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    public BigDecimal getKogus() {
        return kogus;
    }

    public void setKogus(BigDecimal kogus) {
        this.kogus = kogus;
    }

    public Retsept getRetsept() {
        return retsept;
    }

    public void setRetsept(Retsept retsept) {
        this.retsept = retsept;
    }

    public MootUhik getMootUhik() {
        return mootUhik;
    }

    public void setMootUhik(MootUhik mootUhik) {
        this.mootUhik = mootUhik;
    }
}
