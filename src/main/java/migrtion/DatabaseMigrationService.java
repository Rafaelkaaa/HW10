package migrtion;

import org.flywaydb.core.Flyway;

public class DatabaseMigrationService {

    public void initDb()  {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:~/HW10", "sa", "")
                .load();

        flyway.migrate();
    }
}