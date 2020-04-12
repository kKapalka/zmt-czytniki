package pl.zmt.reader.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "readingair")
public class ReadingAir {

    @Id
    @GeneratedValue
    @Column(name="reading_air_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="compressor_id")
    private Compressor compressor;

    private Long counterValue;  //energia czynna

    private Long workingHours;  //godziny pracy

    private Long loadHours;  //godziny pod obciążeniem

    private Long deliveredAir;  //wyprodukowane powietrze w m3

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="sheet_id")
    private Sheet sheet;

    private Boolean modified;  //czy modyfikowany po pierwszym zapisie

    private Date date;

    public ReadingAir(Compressor compressor, Long counterValue, Long workingHours, Long loadHours, Long deliveredAir, User user, Sheet sheet, Boolean modified, Date date) {
        this.compressor = compressor;
        this.counterValue = counterValue;
        this.workingHours = workingHours;
        this.loadHours = loadHours;
        this.deliveredAir = deliveredAir;
        this.user = user;
        this.sheet = sheet;
        this.modified = modified;
        this.date = date;
    }
}
