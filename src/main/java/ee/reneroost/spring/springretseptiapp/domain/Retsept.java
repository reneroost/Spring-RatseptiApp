package ee.reneroost.spring.springretseptiapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Retsept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kirjeldus;
    private Integer ettevalmistusAeg;
    private Integer valmistusAeg;
    private Integer portsjonid;
    private String allikas;
    private String url;
    private String juhised;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "retsept")
    private Set<Koostisosa> koostisosad;

    @Lob
    private Byte[] pilt;

    @Enumerated(value = EnumType.STRING)
    private RaskusAste raskusaste;

    @OneToOne(cascade = CascadeType.ALL)
    private Markmed markmed;

    @ManyToMany
    @JoinTable(name = "retsept_kategooria",
            joinColumns = @JoinColumn(name = "retsept_id"),
            inverseJoinColumns = @JoinColumn(name = "kategooria_id")
    )
    private Set<Kategooria> kategooriad;

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

    public Integer getEttevalmistusAeg() {
        return ettevalmistusAeg;
    }

    public void setEttevalmistusAeg(Integer ettevalmistusAeg) {
        this.ettevalmistusAeg = ettevalmistusAeg;
    }

    public Integer getValmistusAeg() {
        return valmistusAeg;
    }

    public void setValmistusAeg(Integer valmistusAeg) {
        this.valmistusAeg = valmistusAeg;
    }

    public Integer getPortsjonid() {
        return portsjonid;
    }

    public void setPortsjonid(Integer portsjonid) {
        this.portsjonid = portsjonid;
    }

    public String getAllikas() {
        return allikas;
    }

    public void setAllikas(String allikas) {
        this.allikas = allikas;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJuhised() {
        return juhised;
    }

    public void setJuhised(String juhised) {
        this.juhised = juhised;
    }

    public Byte[] getPilt() {
        return pilt;
    }

    public void setPilt(Byte[] pilt) {
        this.pilt = pilt;
    }

    public Markmed getMarkmed() {
        return markmed;
    }

    public void setMarkmed(Markmed markmed) {
        this.markmed = markmed;
    }

    public Set<Koostisosa> getKoostisosad() {
        return koostisosad;
    }

    public void setKoostisosad(Set<Koostisosa> koostisosad) {
        this.koostisosad = koostisosad;
    }

    public RaskusAste getRaskusaste() {
        return raskusaste;
    }

    public void setRaskusaste(RaskusAste raskusaste) {
        this.raskusaste = raskusaste;
    }

    public Set<Kategooria> getKategooriad() {
        return kategooriad;
    }

    public void setKategooriad(Set<Kategooria> kategooriad) {
        this.kategooriad = kategooriad;
    }
}
