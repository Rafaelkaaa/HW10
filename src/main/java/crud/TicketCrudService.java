package crud;

import entity.Client;
import entity.Planet;
import entity.Ticket;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TicketCrudService extends CrudService{


    public void add( String fromId, String toId, long clientId) {
        init();
        Ticket ticket = new Ticket();

        ticket.setFrom(getValidPlanet(fromId, "fromId"));
        ticket.setTo(getValidPlanet(toId, "toId"));
        Client client = session.find(Client.class, clientId);
        validator(client, "clientID");
        ticket.setClient(client);

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Etc/UTC"));
        ticket.setCreatedAt(Timestamp.valueOf(zdt.toLocalDateTime()));

        persist(ticket);
        end();
    }

    private Planet getValidPlanet(String planetId, String parameterName) {
        Planet planet = session.find(Planet.class, planetId);
        validator(planet, parameterName);
        return planet;
    }

    private void validator(Object object, String nameParameter) {
        if (object == null){
            throw new IllegalArgumentException
                    ("Entered non-existent " + nameParameter +
                            " , create new row or enter another " + nameParameter);
        }
    }

    public  Ticket getByID(long id){
        init();
       Ticket ticket = session.find(Ticket.class, id);
       session.close();
       return ticket;
    }


}
