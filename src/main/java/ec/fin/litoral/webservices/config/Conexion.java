package ec.fin.litoral.webservices.config;

import javax.sql.DataSource;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author KevinGalarza
 */
@Configuration
@Getter
@Setter
public class Conexion {

//    @Value("oracle.jdbc.driver.OracleDriver")
    private String driverClassName;
//    @Value("APP_TESIS")
    private String userDb;
//    @Value("APP_TESIS")
    private String passDb;
//    @Value("xe")
    private String hostDb;
//    @Value("1521")
    private String portDb;
//    @DefaultValue("localhost")
    private String ipDb;

    @Bean
    public DataSource getDataSourceOracle() {

//inicializaar con ciclo de vida de un bean


        /* Otro ejemplo de get conection y datasource
        DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
        Connection c = ds.getConnection();
         */
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
//        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds.setUsername("APP_TESIS");
        System.out.println("passs   "+this.getPassDb());
        ds.setPassword("APP_TESIS");

        return ds;
    }
}
