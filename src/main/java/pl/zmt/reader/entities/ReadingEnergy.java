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
    private Long id;

    private Long counter_id; //dodać relację

    private Long counterValue; // energia czynna

    private Long plusQ;  //bierna indukcyjna

    private Long minusQ; //bierna pojemnościowa

    private Integer pMax;  //moc maksymalna

    private Long user_id;  //dodać relację

    private Long sheet_id;  //dodać relację

    private Boolean modified; //jeśli modyfikowany to data modyfikacji, else - data zapisu

    private Date date;

}
