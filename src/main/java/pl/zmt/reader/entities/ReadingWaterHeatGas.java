package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "reading")
public class ReadingWaterHeatGas {

    @Id
    @GeneratedValue
    private Long id;

    private Long counter_id;  //dodać relację

    private Long counterValue;

    private Long user_id;  //dodać relację

    private Long sheet_id;  //dodać relację

    private Boolean modified; //czy modyfikowany po pierwszym zapisie

    private Date date;  //jeśli modyfikowany to data modyfikacji, else - data zapisu

}
