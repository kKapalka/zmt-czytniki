package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "reading")
public class ReadingWaterHeatGas {

    @Id
    @GeneratedValue
    @Column(name="reading_whg_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="counter_id")
    private Counter counter;

    private Long counterValue;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="sheet_id")
    private Sheet sheet;

    private Boolean modified; //czy modyfikowany po pierwszym zapisie

    private Date date;  //jeśli modyfikowany to data modyfikacji, else - data zapisu

}
