package service;
import dao.DaoPersona;
import modelos.Persona;

public class ServiceAddPersona {

    DaoPersona dao = new DaoPersona();

    public boolean addPersona(Persona person) {
        return dao.getListaPersona().add(person);
    }

}