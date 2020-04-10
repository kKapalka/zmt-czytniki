package pl.zmt.reader.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "compressor")
public class Compressor {

    @Id
    @GeneratedValue
    @Column(name="compressor_id")
    private Long id;

    private String serialNumber;

    private String name;

    private String location;

    private Integer orderNumber;

    private Integer hourEfficiency;  //wydajność w m3/h

    private Integer energyEfficiency; //wydajność w m3/kWh

    @Enumerated(EnumType.STRING)
    private CompressorType types;

    public Compressor(String serialNumber, String name, String location, Integer orderNumber, Integer hourEfficiency, Integer energyEfficiency, CompressorType types) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.location = location;
        this.orderNumber = orderNumber;
        this.hourEfficiency = hourEfficiency;
        this.energyEfficiency = energyEfficiency;
        this.types = types;
    }
}
