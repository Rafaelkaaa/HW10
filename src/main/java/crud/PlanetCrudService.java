package crud;


import entity.Client;
import entity.Planet;

public class PlanetCrudService extends CrudService {
    public PlanetCrudService() {
        clazz = Planet.class;
    }

    @Override
    public void add(String id, String name) {
        init();
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        persist(planet);
        end();
    }
}
