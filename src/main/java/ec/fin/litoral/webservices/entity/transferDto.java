package ec.fin.litoral.WSAdminRest.entidades;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author KevinGalarza
 */
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class transferDto implements Serializable {

    @JsonProperty("ID")
    private String ID;
    @JsonProperty("MARCA")
    private String MARCA;
    @JsonProperty("MODELO")
    private String MODELO;
    @JsonProperty("SERIE")
    private String SERIE;
    @JsonProperty("EXTENSION")
    private String EXTENSION;
    @JsonProperty("IP")
    private String IP;
    @JsonProperty("USUARIO")
    private String USUARIO;
    @JsonProperty("CLAVE")
    private String CLAVE;
    @JsonProperty("DESCRIPCION")
    private String DESCRIPCION;
    @JsonProperty("ESTADO")
    private String ESTADO;
    @JsonProperty("FECHA_INGRESO")
    private String FECHA_INGRESO;
    @JsonProperty("USUARIO_INGRESO")
    private String USUARIO_INGRESO;
    @JsonProperty("FECHA_MODIFICACION")
    private String FECHA_MODIFICACION;
    @JsonProperty("USUARIO_MODIFICACION")
    private String USUARIO_MODIFICACION;
    @JsonProperty("ID_CARGO")
    private String ID_CARGO;
    @JsonProperty("ID_AREA")
    private String ID_AREA;
    @JsonProperty("ID_TELEFONO")
    private String ID_TELEFONO;
    @JsonProperty("NOMBRES")
    private String NOMBRES;
    @JsonProperty("APELLIDOS")
    private String APELLIDOS;
    @JsonProperty("DOMINIO")
    private String DOMINIO;
    @JsonProperty("CORREO")
    private String CORREO;
    @JsonProperty("AGENCIA")
    private String AGENCIA;
    @JsonProperty("SEGMENTO")
    private String SEGMENTO;
    @JsonProperty("AREA")
    private String AREA;
    @JsonProperty("DEPARTAMENTO")
    private String DEPARTAMENTO;
    @JsonProperty("NOMECLATURA")
    private String NOMECLATURA;
    @JsonProperty("CARGO")
    private String CARGO;
    @JsonProperty("STAR1")
    private String STAR1;
    @JsonProperty("ID_MANTENIMIENTO")
    private String ID_MANTENIMIENTO;
    @JsonProperty("CALIFICACION")
    private String CALIFICACION;
    @JsonProperty("OBSERVACION")
    private String OBSERVACION;
    @JsonProperty("ID_OPERADOR")
    private String ID_OPERADOR;
    @JsonProperty("ID_COLABORADOR")
    private String ID_COLABORADOR;
    @JsonProperty("ID_HARDWARE")
    private String ID_HARDWARE;
    @JsonProperty("ENCIENDE")
    private String ENCIENDE;
    @JsonProperty("OBSERVACION_1")
    private String OBSERVACION_1;
    @JsonProperty("PUERTOS")
    private String PUERTOS;
    @JsonProperty("OBSERVACION_2")
    private String OBSERVACION_2;
    @JsonProperty("BOTONES")
    private String BOTONES;
    @JsonProperty("OBSERVACION_3")
    private String OBSERVACION_3;
    @JsonProperty("MONITOR")
    private String MONITOR;
    @JsonProperty("OBSERVACION_4")
    private String OBSERVACION_4;
    @JsonProperty("TECLADO")
    private String TECLADO;
    @JsonProperty("OBSERVACION_5")
    private String OBSERVACION_5;
    @JsonProperty("MOUSE")
    private String MOUSE;
    @JsonProperty("OBSERVACION_6")
    private String OBSERVACION_6;
    @JsonProperty("DURACION")
    private String DURACION;
    @JsonProperty("OBSERVACION_GEN")
    private String OBSERVACION_GEN;
    @JsonProperty("ADICIONAL")
    private String ADICIONAL;
    @JsonProperty("ID_HARDWAR")
    private String ID_HARDWAR;
    @JsonProperty("DOMINIO_HOST")
    private String DOMINIO_HOST;
    @JsonProperty("CAPACIDAD_DD")
    private String CAPACIDAD_DD;
    @JsonProperty("TIPO_DD")
    private String TIPO_DD;
    @JsonProperty("RAM")
    private String RAM;
    @JsonProperty("SO")
    private String SO;
    @JsonProperty("PROCESADOR")
    private String PROCESADOR;
    @JsonProperty("DISPOSITIVO")
    private String DISPOSITIVO;
    @JsonProperty("VALOR")
    private String VALOR;
    @JsonProperty("IP_VAL")
    private String IP_VAL;
    @JsonProperty("ORDEN")
    private String ORDEN;
    @JsonProperty("ID_IP")
    private String ID_IP;
    @JsonProperty("INF_ADICIONAL")
    private String INF_ADICIONAL;
    @JsonProperty("NOMBRE_AGENCIA")
    private String NOMBRE_AGENCIA;

    @JsonProperty("NOM_SOLICITUD")
    private String NOM_SOLICITUD;
    @JsonProperty("RUTA_ADJUNTO")
    private String RUTA_ADJUNTO;
    @JsonProperty("DETALLE")
    private String DETALLE;
    @JsonProperty("NUM_SOLICITUD")
    private String NUM_SOLICITUD;
    @JsonProperty("DETALLE_OP")
    private String DETALLE_OP;
    @JsonProperty("FECHA_INGRESO_OP")
    private String FECHA_INGRESO_OP;
    @JsonProperty("COD_ACTA")
    private String COD_ACTA;
    @JsonProperty("RUTA_SCAN")
    private String RUTA_SCAN;
    @JsonProperty("ID_RESPONSABLE")
    private String ID_RESPONSABLE;
    @JsonProperty("NOM_USUARIO")
    private String NOM_USUARIO;
    @JsonProperty("IDENTIFICADOR_ACTA")
    private String IDENTIFICADOR_ACTA;
    @JsonProperty("FECHA_ACTA")
    private String FECHA_ACTA;
    @JsonProperty("NOMBRE_FILE")
    private String NOMBRE_FILE;
    @JsonProperty("RUTA_FILE")
    private String RUTA_FILE;
    @JsonProperty("NOMBRE_SCAN")
    private String NOMBRE_SCAN;
    @JsonProperty("DISPONIBILIDAD")
    private String DISPONIBILIDAD;
    
    

}
