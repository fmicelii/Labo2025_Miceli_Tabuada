package TratamientoModificacionSangre;

import Personas.Genero;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaTratamiento {
    private HashMap<Tratable,Integer> pacienteDiasTratandose;
    private HashSet<Paciente> pacientes;

    public SistemaTratamiento(HashMap<Tratable, Integer> pacienteDiasTratandose, HashSet<Paciente> pacientes) {
        this.pacienteDiasTratandose = pacienteDiasTratandose;
        this.pacientes = pacientes;
    }

    public HashMap<Tratable, Integer> getPacienteDiasTratandose() {
        return pacienteDiasTratandose;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void comprobacionDiaria(){
        for (Map.Entry<Tratable,Integer> t : pacienteDiasTratandose.entrySet()){
            if (t.getKey().puedeRecibirTratamiento()) {
                t.setValue(t.getValue() + 1);
            }
        }
    }

    public int pacientesNoTratables(){
        return pacientes.size() - pacienteDiasTratandose.size();
    }

    public static void main(String[] args) {
        HashSet<Paciente> todos = new HashSet<>();
        HashMap<Tratable, Integer> enTratamiento = new HashMap<>();

        Nino n1 = new Nino("Juan", "Seisjas", LocalDate.of(2020, 5, 10), Genero.HOMBRE, TipoSangre.A_POSITIVO, 5);
        Joven j1 = new Joven("Lucas", "Gomez", LocalDate.of(1998, 3, 15), Genero.HOMBRE, TipoSangre.O_NEGATIVO, new HashSet<>());
        Adulto a1 = new Adulto("Maria", "Lopez", LocalDate.of(1985, 7, 20), Genero.MUJER, TipoSangre.B_POSITIVO);
        Geronte g1 = new Geronte("Lolo", "Taborda", LocalDate.of(1940, 1, 1), Genero.HOMBRE, TipoSangre.AB_NEGATIVO);

        todos.add(n1);
        todos.add(j1);
        todos.add(a1);
        todos.add(g1);

        enTratamiento.put(n1, 0);
        enTratamiento.put(j1, 0);

        SistemaTratamiento sistema = new SistemaTratamiento(enTratamiento, todos);

        System.out.println("Pacientes NO tratables: " + sistema.pacientesNoTratables());

        System.out.println("\n--- Comprobación diaria ---");
        sistema.comprobacionDiaria();

        System.out.println("\nDías de tratamiento actualizados:");
        sistema.getPacienteDiasTratandose().forEach((paciente, dias) ->
                System.out.println(paciente.getClass().getSimpleName() + " -> " + dias + " días")
        );
    }
}
