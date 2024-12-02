package consultorio;

import java.util.ArrayList;

public class Medico extends Pessoa {
    private String especialidade;
    private String crm;
    private ArrayList<Consulta> consultas; // Agregação

    public Medico(String nome, int idade, String especialidade, String crm) {
        super(nome, idade);
        this.especialidade = especialidade;
        this.crm = crm;
        this.consultas = new ArrayList<>();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas; // Método para acessar a lista de consultas
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Médico: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + crm);
        System.out.println("Número de Consultas: " + consultas.size());
    }
}