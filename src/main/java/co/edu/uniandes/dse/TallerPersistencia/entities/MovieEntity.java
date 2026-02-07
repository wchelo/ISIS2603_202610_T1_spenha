package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class MovieEntity extends BaseEntity {
    private String title;
    private Integer releaseYear;

    @ManyToOne(fetch = FetchType.LAZY)
    private DirectorEntity director;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<GenreEntity> genres = new ArrayList<GenreEntity>();

    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private ScriptEntity script;
}
