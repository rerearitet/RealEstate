package entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "realtor")
@NoArgsConstructor
@EqualsAndHashCode
public class Realtor { //Риэлтор
    @Id
    @Getter
    @Setter
    @Column(name = "id")
    private int id;

    @Basic
    @Getter
    @Setter
    @Column(name = "name")
    private String name;

    @Basic
    @Getter
    @Setter
    @Column(name = "estateAgency")
    private String estateAgency;
}
