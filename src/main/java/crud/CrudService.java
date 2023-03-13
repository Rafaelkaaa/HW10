package crud;

import entity.EntityTable;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class CrudService {

    static Class clas;
    Session session;
    Transaction transaction;
    void init() {
        session = HibernateUtil.getInstance().getSessionFactory().openSession();
    }
    void persist(EntityTable entity) {
        transaction = session.beginTransaction();
        session.persist(entity);
    }

    void deleteRow(Object id) {
        init();
        EntityTable entity = (EntityTable) session.find(clas, id);
        transaction = session.beginTransaction();
        session.remove(entity);
        end();
    }

    void end(){
        transaction.commit();
        session.close();
    }
}
