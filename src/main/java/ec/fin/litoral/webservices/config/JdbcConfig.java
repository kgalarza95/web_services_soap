/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.litoral.webservices.config;

import javax.sql.DataSource;

/**
 *
 * @author kgalarza
 */
public class JdbcConfig {

    public DataSource dataSourceOracle() {


        /* Otro ejemplo de get conection y datasource
        DataSource ds = (DataSource)ApplicationContextProvider.getApplicationContext().getBean("dataSource");
        Connection c = ds.getConnection();
         */
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//        ds.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
////        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
//        ds.setUsername("APP_TESIS");
//        ds.setPassword("APP_TESIS");
        Conexion cnx = new Conexion();
        cnx.setPassDb("si cambia oe");
        return cnx.getDataSourceOracle();
    }

}
