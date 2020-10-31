package entities;

import javax.persistence.*;

@Entity
@Table(name = "realtor")
public class Realtor { //Риэлтор
    private int id;
    private String name;
    private String estateAgency;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "estateAgency")
    public String getEstateAgency() {
        return estateAgency;
    }

    public void setEstateAgency(String estateAgency) {
        this.estateAgency = estateAgency;
    }
}
