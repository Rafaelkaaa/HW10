package crud;

import entity.Client;


public class ClientCrudService extends CrudService {
    public ClientCrudService() {
        CrudService.clas = Client.class;
    }

    public void add(String name) {
        init();
        Client client = new Client();
        client.setName(name);
        persist(client);
        end();
    }

    public void delete(long id) {
        deleteRow(id);
    }
}
