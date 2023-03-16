package entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "TICKET")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "created_at")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Timestamp createdAt;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "from_planet_id")
    @NotNull
    Planet from;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "to_planet_id")
    @NotNull
    Planet to;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    @NotNull
    Client client;

}