/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.litoral.webservices.repository;

import ec.fin.litoral.WSAdminRest.entidades.transferDto;
import ec.fin.litoral.webservices.entity.Response;
import java.util.List;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

/**
 *
 * @author kgalarza
 */
@org.springframework.stereotype.Repository
@Slf4j
public class Repository {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;//parametros nombrados
    private SimpleJdbcCall sJdbcCall;
    private Response response = new Response();
    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        sJdbcCall = new SimpleJdbcCall(dataSource);
        this.dataSource = dataSource;
    }

    public Response PUB_CRUD_AREA(List<String> parametros) {
        String prcocedimiento = "PUB_CRUD_AREA";
        try {
            DaoGeneric<transferDto> obj = new DaoGeneric<>();
            obj.setDataSource(dataSource);

            //Zona Editable
            response = obj.PUB_CRUD_GENERICO(parametros,
                    prcocedimiento,
                    "PKG_TI_APP_INFRAESTRUCTURA",
                    new transferDto());
        } catch (Exception e) {
            log.error("EXCEPTION | Procedimiento=> " + prcocedimiento + ", error=> " + e.toString());
            response.setCodResponse("99");
            response.setMsjResponse("API REST | OCURRIÓ UN ERROR AL PROCESAR LA PETICIÓN EN LA BASE");
        }

        return response;
    }
}
