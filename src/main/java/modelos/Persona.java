package modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private String nombre;
    private int edad;
    private boolean hombre;
    private LocalDate fecha;

    @Override
    public String toString() {
        if (hombre) {
            return '{' + nombre + ", " + edad + ", " + " hombre " + ", " + fecha + '}';
        } else {
            return '{' + nombre + ", " + edad + ", " + " mujer " + ", " + fecha + '}';
        }
    }
}