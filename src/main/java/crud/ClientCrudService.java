package crud;

import entity.Client;


public class ClientCrudService extends CrudService {

    public ClientCrudService() {
        clazz = Client.class;
    }

    @Override
    public void add(String name) {
        init();
        Client client = new Client();
        client.setName(name);
        persist(client);
        end();
    }
}
