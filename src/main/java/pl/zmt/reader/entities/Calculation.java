package pl.zmt.reader.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.zmt.reader.entities.enums.CalculationType;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity(name = "calculation")
public class Calculation {

    @Id
    @GeneratedValue
    @Column(name="calculation_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "expense_id")
    private Expense expense;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "counter_id")
    private Counter counter;

    @Enumerated(EnumType.STRING)
    private CalculationType types;

    public Calculation(Expense expense, Counter counter, CalculationType types) {
        this.expense = expense;
        this.counter = counter;
        this.types = types;
    }
}
