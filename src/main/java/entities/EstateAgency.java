package entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "estateAgency")
@NoArgsConstructor
@EqualsAndHashCode
public class EstateAgency { //Агенство недвижимости
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
    @Column(name = "region")
    private String region;

    @Basic
    @Getter
    @Setter
    @Column(name = "county")
    private String country;

    @Basic
    @Getter
    @Setter
    @Column(name = "city")
    private String city;
}
