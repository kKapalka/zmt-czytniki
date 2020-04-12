package pl.zmt.reader.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
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
    private CounterType types;

    public Counter(String number, String location, String description, Integer orderNumber, Integer ratio, CounterType types) {
        this.number = number;
        this.location = location;
        this.description = description;
        this.orderNumber = orderNumber;
        this.ratio = ratio;
        this.types = types;
    }
}
