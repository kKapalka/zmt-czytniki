package pl.zmt.reader.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity(name = "expense")
public class Expense {

    @Id
    @GeneratedValue
    @Column(name="expense_id")
    private Long id;

    private String description;

    private String symbol;

    private Integer number;

    private Integer orderNumber;


    public Expense(String description, String symbol, Integer number, Integer orderNumber) {
        this.description = description;
        this.symbol = symbol;
        this.number = number;
        this.orderNumber = orderNumber;
    }
}
