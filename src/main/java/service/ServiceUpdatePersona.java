package service;

import dao.DaoPersona;
import modelos.Persona;

public class ServiceUpdatePersona {
    DaoPersona dao = new DaoPersona();

    public boolean updatePersona(Persona person) {
        return dao.getListaPersona().get(Integer.parseInt(person.toString()))

    }
}