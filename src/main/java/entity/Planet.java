package entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;


@Entity
@Table(name = "planet")
@Data
@ToString(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Planet {
    @Id
    String id;
    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "from", fetch = FetchType.EAGER)
    List<Ticket> from_tickets;
    @OneToMany(mappedBy = "to", fetch = FetchType.EAGER)
    List<Ticket> to_tickets;
}