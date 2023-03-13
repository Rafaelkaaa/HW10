package crud;


import entity.Planet;

public class PlanetCrudService extends CrudService{
    public PlanetCrudService() {
        CrudService.clas = Planet.class;
    }

    public void add(String id, String name) {
        init();
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        persist(planet);
        end();
    }

    public void delete(String id) {
        init();
        Planet entity = session.find(Planet.class, id);
        transaction = session.beginTransaction();
        transaction.commit();
        session.remove(entity);
        session.close();
    }


}
