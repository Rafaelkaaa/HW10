import crud.ClientCrudService;
import crud.PlanetCrudService;
import crud.TicketCrudService;
import migrtion.DatabaseMigrationService;

public class Main {

    public static void main(String[] args) {
        new DatabaseMigrationService().initDb();
    /*    TicketCrudService ticketCrud = new TicketCrudService();
        ticketCrud.add("55", "AR16", 11 );
        */


       PlanetCrudService planetCrud = new PlanetCrudService();
        planetCrud.add("AR1", null);
        planetCrud.delete("508");

        ClientCrudService clientCrud = new ClientCrudService();
        clientCrud.add("Atreides");
        clientCrud.delete(3);

        planetCrud.add("AR16", "Arrakis");
    }
}
