package pl.zmt.reader.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity(name = "calculation")
public class Calculation {

    @Id
    @GeneratedValue
    @Column(name="calculation_id")
    private Long id;

    //relacja
    private Long expense_id;

    //relacja
    private Long counter_id;

    @Enumerated(EnumType.STRING)
    private CalculationType types;

    public Calculation(Long expense_id, Long counter_id, CalculationType types) {
        this.expense_id = expense_id;
        this.counter_id = counter_id;
        this.types = types;
    }
}
