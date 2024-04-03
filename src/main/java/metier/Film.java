package metier;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "films")
public class Film implements Serializable {
    
    @Id
    @Column(name = "ID_FILM")
    private Long idFilm;
    
    @Column(name = "NOM_FILM")
    private String nomFilm;
    
    private double prix;

    public Film() {
        super();
    }

    public Film(String nomFilm, double prix) {
        super();
        this.nomFilm = nomFilm;
        this.prix = prix;
    }

    public Long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Long idFilm) {
        this.idFilm = idFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
