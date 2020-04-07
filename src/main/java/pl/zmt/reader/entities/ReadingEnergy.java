package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "readingenergy")
public class ReadingEnergy {

    @Id
    @GeneratedValue
    @Column(name="reading_energy_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="counter_id")
    private Counter counter;

    private Long counterValue; // energia czynna

    private Long plusQ;  //bierna indukcyjna

    private Long minusQ; //bierna pojemnościowa

    private Integer pMax;  //moc maksymalna

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="sheet_id")
    private Sheet sheet;

    private Boolean modified; //jeśli modyfikowany to data modyfikacji, else - data zapisu

    private Date date;

}
