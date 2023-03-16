import crud.ClientCrudService;
import crud.PlanetCrudService;
import crud.TicketCrudService;
import migrtion.DatabaseMigrationService;

public class Main {

    public static void main(String[] args) {
        new DatabaseMigrationService().initDb();
       TicketCrudService ticketCrud = new TicketCrudService();
        System.out.println("ticketCrud.getByID(5).toString() = " + ticketCrud.getByID(2).toString());
      ticketCrud.add("AR16", null, 2);

//       PlanetCrudService planetCrud = new PlanetCrudService();
//        planetCrud.add("AR2", "Arrakis");
//        planetCrud.delete("40");
//
//        ClientCrudService clientCrud = new ClientCrudService();
//        clientCrud.add("Atreides");
//        clientCrud.delete(4);
//
//        planetCrud.add("AR17", "Arrakis");
    }
}
