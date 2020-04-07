package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "sheet")
public class Sheet {

    @Id
    @GeneratedValue
    private Long id;

    private Long user_id;  //dodać relację

    private Boolean confirmed;  //czy zablokowany do edycji

    private Date sheetDate;

}
