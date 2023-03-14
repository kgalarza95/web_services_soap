/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.litoral.webservices.services;

import ec.fin.litoral.webservices.config.JdbcConfig;
import ec.fin.litoral.webservices.entity.Response;
import ec.fin.litoral.webservices.repository.Repository;
import java.util.List;

/**
 *
 * @author kgalarza
 */
@org.springframework.stereotype.Service
public class Service {

    private JdbcConfig cnx = new JdbcConfig();
    private Response response = new Response();
    private Repository repository = new Repository();

    public Response PUB_CRUD_AREA(List<String> parametros) {
        repository.setDataSource(cnx.dataSourceOracle());
        //validar parametros, cant de parametros, etc
        return response = repository.PUB_CRUD_AREA(parametros);
    }
}
