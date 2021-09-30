package service;

import dao.DaoPersona;
import modelos.Persona;

import java.util.List;

public class ServiceGetData {

    DaoPersona dao = new DaoPersona();

    public List<Persona> getData() {
        return dao.getListaPersona();
    }
}
