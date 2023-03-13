import crud.ClientCrudService;
import crud.PlanetCrudService;
import migrtion.DatabaseMigrationService;

public class Main {

    public static void main(String[] args) {
        new DatabaseMigrationService().initDb();
        PlanetCrudService planetCrud = new PlanetCrudService();
        planetCrud.add("AR", "Arrakis");
        planetCrud.delete("AR");

        ClientCrudService clientCrud = new ClientCrudService();
        clientCrud.add("Atreides");
        clientCrud.delete(3);

        planetCrud.add("AR16", "Arrakis");

    }
}
