/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.fin.litoral.webservices.entity;

/**
 *
 * @author KevinGalarza
 */
public class Response {

    private String CodResponse;
    private String MsjResponse;
    private Object data;

    public String getCodResponse() {
        return CodResponse;
    }

    public void setCodResponse(String CodResponse) {
        this.CodResponse = CodResponse;
    }

    public String getMsjResponse() {
        return MsjResponse;
    }

    public void setMsjResponse(String MsjResponse) {
        this.MsjResponse = MsjResponse;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" + "CodResponse=> " + CodResponse + ", MsjResponse=> " + MsjResponse + '}';
    }

}
