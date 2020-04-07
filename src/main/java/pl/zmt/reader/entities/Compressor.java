package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "compressor")
public class Compressor {

    @Id
    @GeneratedValue
    private Long id;

    private String serialNumber;

    private String name;

    private String location;

    private Integer orderNumber;

    private Integer hourEfficiency;  //wydajność w m3/h

    private Integer energyEfficiency; //wydajność w m3/kWh


    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<CompressorType> roles;

}
