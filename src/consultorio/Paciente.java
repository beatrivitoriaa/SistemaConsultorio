package consultorio;

import java.util.ArrayList;

public class Paciente extends Pessoa {
    private String historicoMedico;
    private ArrayList<Consulta> consultas; // Agregação

    public Paciente(String nome, int idade, String historicoMedico) {
        super(nome, idade);
        this.historicoMedico = historicoMedico;
        this.consultas = new ArrayList<>();
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas; // Método para acessar a lista de consultas
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Paciente: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Histórico Médico: " + historicoMedico);
        System.out.println("Número de Consultas: " + consultas.size());
    }
}