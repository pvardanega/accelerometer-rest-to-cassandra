package fr.duchess;

import javax.validation.constraints.NotNull;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Acceleration {

    @PrimaryKey
    @NotNull
    private Long timestamp;

    @Column
    @NotNull
    private Double x;

    @Column
    @NotNull
    private Double y;

    @Column
    @NotNull
    private Double z;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "[timestamp: " + timestamp + ", x: " + x + ", y: " + y + ", z: " + z + ']';
    }
}
