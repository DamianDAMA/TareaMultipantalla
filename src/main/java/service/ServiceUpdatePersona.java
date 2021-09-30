package service;

import dao.DaoPersona;
import modelos.Persona;

public class ServiceUpdatePersona {
    DaoPersona dao = new DaoPersona();

    public boolean updatePersona(Persona person, Persona person2) {
        return dao.getListaPersona().add(person) && dao.getListaPersona().remove(person2);
    }
}