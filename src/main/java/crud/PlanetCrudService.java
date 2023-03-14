package crud;


import entity.Planet;

public class PlanetCrudService extends CrudService{


    public void add(String id, String name) {
        init();
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        persist(planet);
        end();
    }

    public void delete(String id) {
      deleteRow(id, new Planet());
    }


}
