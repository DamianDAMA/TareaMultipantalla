package service;

import dao.DaoPersona;
import modelos.Persona;

import java.util.List;

public class ServiceReadPersona {

    DaoPersona dao = new DaoPersona();

    public List<Persona> readPersona(){
        return dao.getListaPersona();
    }

}
