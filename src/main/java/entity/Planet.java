package entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name = "planet")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Planet extends EntityTable {
    @Id
    String id;
    @Column(name = "name")
    String name;
}