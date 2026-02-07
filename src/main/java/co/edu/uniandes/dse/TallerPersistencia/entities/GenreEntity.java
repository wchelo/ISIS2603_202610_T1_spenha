package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class GenreEntity extends BaseEntity {
    private String name;

    @ManyToMany(mappedBy = "genres", fetch =FetchType.LAZY)
    private List<MovieEntity> movies = new ArrayList<MovieEntity>();
}
