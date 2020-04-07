package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "readingair")
public class ReadingAir {

    @Id
    @GeneratedValue
    private Long id;

    private Long compressor_id;  //dodać relację

    private Long counterValue;  //energia czynna

    private Long workingHours;  //godziny pracy

    private Long loadHours;  //godziny pod obciążeniem

    private Long deliveredAir;  //wyprodukowane powietrze w m3

    private Long user_id;  //dodać relację

    private Long sheet_id;  //dodać relację

    private Boolean modified;  //czy modyfikowany po pierwszym zapisie

    private Date date;

}
