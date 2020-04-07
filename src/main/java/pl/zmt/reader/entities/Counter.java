package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "counter")
public class Counter {

    @Id
    @GeneratedValue
    @Column(name="counter_id")
    private Long id;

    private String number;

    private String location;

    private String description;

    private Integer orderNumber;

    private Integer ratio;   //przekładnia (mnożnik)

    @Enumerated(EnumType.STRING)
    private CounterType roles;

}
