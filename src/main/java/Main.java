import crud.ClientCrudService;
import crud.CrudService;
import crud.PlanetCrudService;
import crud.TicketCrudService;
import entity.Client;
import entity.Planet;
import entity.Ticket;
import migrtion.DatabaseMigrationService;

public class Main {

    public static void main(String[] args) {
        new DatabaseMigrationService().initDb();

//        CrudService<Planet> planetCrud = new PlanetCrudService();
//        planetCrud.add("AR5", "Arrakis");
//        planetCrud.delete("40");
//
//        CrudService<Client> clientCrud = new ClientCrudService();
//        clientCrud.add("Atreides");
//        clientCrud.delete(4);
//
//        planetCrud.add("AR17", "Arrakis");
//
//        CrudService<Ticket> ticketCrud = new TicketCrudService();
//        ticketCrud.add("AR17", "AR5", 2);

        CrudService<Planet> planetCrud = new PlanetCrudService();
        planetCrud.init();
        Planet planet = planetCrud.session.find(Planet.class, "219134");
        planetCrud.session.close();
        for (Ticket ticket :
                planet.getFrom_tickets()) {
            System.out.println(ticket);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        CrudService<Client> clientCrud = new ClientCrudService();
        clientCrud.init();
        Client client = clientCrud.session.find(Client.class, 2);
        clientCrud.session.close();
        for (Ticket ticket :
                client.getTickets()) {
            System.out.println(ticket);
        }
    }
}