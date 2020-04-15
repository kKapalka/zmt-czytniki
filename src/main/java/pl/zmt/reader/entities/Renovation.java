package pl.zmt.reader.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity(name = "renovation")
public class Renovation {

    @Id
    @GeneratedValue
    @Column(name="renovation_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "compressor_id")
    private Compressor compressor;

    private Long workingHours;

    private Long loadHours;

    private Date date;

    public Renovation(Compressor compressor, Long workingHours, Long loadHours, Date date) {
        this.compressor = compressor;
        this.workingHours = workingHours;
        this.loadHours = loadHours;
        this.date = date;
    }
}
