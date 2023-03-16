import crud.ClientCrudService;
import crud.CrudService;
import crud.PlanetCrudService;
import crud.TicketCrudService;
import entity.Client;
import entity.Planet;
import migrtion.DatabaseMigrationService;

public class Main {

    public static void main(String[] args) {
        new DatabaseMigrationService().initDb();

        CrudService<Planet> planetCrud = new PlanetCrudService();
        planetCrud.add("AR5", "Arrakis");
        planetCrud.delete("40");

        CrudService<Client> clientCrud = new ClientCrudService();
        clientCrud.add("Atreides");
        clientCrud.delete(4);

        planetCrud.add("AR17", "Arrakis");

        TicketCrudService ticketCrud = new TicketCrudService();
        ticketCrud.add("AR17", "AR5", 2);
    }
}
