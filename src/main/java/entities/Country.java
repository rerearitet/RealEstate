package entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "country")
@NoArgsConstructor
@EqualsAndHashCode
public class Country { //Страна(область)
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
}
