/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.fin.litoral.webservices.repository;

import ec.fin.litoral.webservices.entity.Response;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

/**
 *
 * @author KevinGalarza
 */
@Slf4j
public class DaoGeneric<T> {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;//parametros nombrados
    private SimpleJdbcCall sJdbcCall;
    private Response response = new Response();

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        sJdbcCall = new SimpleJdbcCall(dataSource);
    }

    public Response PUB_CRUD_GENERICO(List<String> parametros, String procedimiento, String paquete, T clase) {
        try {
            List<T> listMapper = null;
            sJdbcCall.withProcedureName(procedimiento)
                    .withCatalogName(paquete)
                    .returningResultSet("OC_CONSULTA", BeanPropertyRowMapper.newInstance(clase.getClass()));

            String[] entradas = parametros.toArray(new String[0]);
            Map<String, Object> result = sJdbcCall.execute( entradas);

            listMapper = (List) result.get("OC_CONSULTA");
            response.setData(listMapper);
            response.setCodResponse(result.get("OV_COD_RESPONSE").toString());
            response.setMsjResponse((String) result.get("OV_MSJ_RESPONSE"));
        } catch (NoClassDefFoundError | Exception e) {
            log.error("Error generico => " + e);
            response.setCodResponse("99");
            response.setMsjResponse("EXECPTION | OCURRIÓ UN ERROR AL PROCESAR LA PETICIÓN "+e);
        }

        return response;
    }

}
