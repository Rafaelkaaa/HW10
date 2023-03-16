package crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.id.IdentifierGenerationException;
import util.HibernateUtil;

public class CrudService <T> {

    Class<T> clazz;
    Session session;
    Transaction transaction;
    void init() {
        session = HibernateUtil.getInstance().getSessionFactory().openSession();
    }
    void persist(Object entity) {
        try {
            transaction = session.beginTransaction();
            session.persist(entity);
        }catch (IllegalArgumentException ex){
            System.out.println("Entered invalid value");
        }catch (IdentifierGenerationException ex){
            System.out.println("Field id can't be null");
        }catch (ConstraintViolationException ex){
            System.out.println("Entered not unique value in field id");
        }
    }

    void deleteRow(Object id) {
        init();
        T entity = session.find(clazz, id);
        transaction = session.beginTransaction();
        session.remove(entity);
        end();
    }

    void end(){
        transaction.commit();
        session.close();
    }
}
