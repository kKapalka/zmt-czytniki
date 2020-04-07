package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "sheet")
public class Sheet {

    @Id
    @GeneratedValue
    @Column(name="sheet_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    private Boolean confirmed;  //czy zablokowany do edycji

    private Date sheetDate;

}
