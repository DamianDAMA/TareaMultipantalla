package service;

import dao.DaoPersona;
import modelos.Persona;

public class ServiceDeletePersona {

    DaoPersona dao = new DaoPersona();

    public boolean deletePersona(Persona person) {
        if (dao.getListaPersona().remove(person)) {
            return true;
        } else {
            return false;
        }

    }
}