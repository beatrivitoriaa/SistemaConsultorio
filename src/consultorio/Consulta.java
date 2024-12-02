package consultorio;

import java.time.LocalDate;

public class Consulta {
    private LocalDate data;
    private Paciente paciente; // Composição
    private Medico medico;     // Composição

    public Consulta(LocalDate data, Paciente paciente, Medico medico) {
        this.data = data;
        this.paciente = paciente;
        this.medico = medico;
    }

    public LocalDate getData() {
        return data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void exibirInformacoes() {
        System.out.println("Data da Consulta: " + data);
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
    }
}