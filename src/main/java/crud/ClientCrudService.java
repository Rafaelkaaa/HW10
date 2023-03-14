package crud;

import entity.Client;


public class ClientCrudService extends CrudService {

    public void add(String name) {
        init();
        Client client = new Client();
        client.setName(name);
        persist(client);
        end();
    }

    public void delete(long id) {
        deleteRow(id, new Client());
    }
}
