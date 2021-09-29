package dao;

import modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class DaoPersona {

    private static List<Persona> ListaPersona;

    public DaoPersona(){
        ListaPersona = new ArrayList<>();
    }

    public List<Persona> getListaPersona() {
        return ListaPersona;
    }


}
