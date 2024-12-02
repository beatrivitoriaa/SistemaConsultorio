import consultorio.Paciente;
import consultorio.Medico;
import consultorio.Consulta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       ArrayList<Paciente> pacientes = new ArrayList<>();
       ArrayList<Medico> medicos = new ArrayList<>();

       for (int i = 0; i < 3; i++) {

            // Cadastro de Pacientes
            System.out.println("Digite o nome do paciente:");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            
            scanner.nextLine(); // Consumir nova linha
            System.out.println("Digite o histórico médico:");
            
            String historicoMedico = scanner.nextLine();
            pacientes.add(new Paciente(nome, idade, historicoMedico));
        

            // Cadastro de Médicos
            System.out.println("Digite o nome do médico:");
            String nomeMedico = scanner.nextLine();

            System.out.println("Digite a idade:");
            int idadeMedico = scanner.nextInt();
            
            scanner.nextLine(); // Consumir nova linha
            System.out.println("Digite a especialidade:");
            
            String especialidade = scanner.nextLine();
            System.out.println("Digite o CRM:");
            
            String crm = scanner.nextLine();

            medicos.add(new Medico(nomeMedico, idadeMedico, especialidade, crm));
            // Cadastro de Consultas
            LocalDate dataConsulta;

           while (true) { // Loop até obter uma data válida
               try {
                   System.out.println("Digite a data da consulta (YYYY-MM-DD):");
                   dataConsulta = LocalDate.parse(scanner.nextLine());
                   
                   break; // Sai do loop se a data for válida
               } catch (Exception e) {
                   System.out.println("Data inválida! Tente novamente.");
               }
           }

           // Escolher paciente e médico para a consulta
           /*
           int indicePaciente;
           while (true) { // Loop até obter um índice válido para paciente
               try {
                   System.out.println("Escolha o índice do paciente (0 a " + (pacientes.size() - 1) + "):");
                   indicePaciente = scanner.nextInt();
                   if (indicePaciente < 0 || indicePaciente >= pacientes.size()) throw new IndexOutOfBoundsException();
                   break; // Sai do loop se o índice for válido
               } catch (Exception e) {
                   System.out.println("Índice inválido! Tente novamente.");
                   scanner.nextLine(); // Limpa o buffer
               }
           }

           int indiceMedico;
           while (true) { // Loop até obter um índice válido para médico
               try {
                   System.out.println("Escolha o índice do médico (0 a " + (medicos.size() - 1) + "):");
                   indiceMedico = scanner.nextInt();
                   if (indiceMedico < 0 || indiceMedico >= medicos.size()) throw new IndexOutOfBoundsException();
                   break; // Sai do loop se o índice for válido
               } catch (Exception e) {
                   System.out.println("Índice inválido! Tente novamente.");
                   scanner.nextLine(); // Limpa o buffer
               }
           }*/

           Consulta consulta = new Consulta(dataConsulta, pacientes.get(i), medicos.get(i));

           // Adicionando consulta ao paciente e médico
           pacientes.get(i).adicionarConsulta(consulta);
           medicos.get(i).adicionarConsulta(consulta);

           System.out.println("Consulta agendada com sucesso!\n");
       }

       // Exibindo Informações dos Pacientes
       for (Paciente paciente : pacientes) {
           paciente.exibirInformacoes();
           for (Consulta consulta : paciente.getConsultas()) { // Exibindo informações da consulta
               consulta.exibirInformacoes();
               System.out.println();
           }
           System.out.println();
       }

       // Exibindo Informações dos Médicos
       for (Medico medico : medicos) {
           medico.exibirInformacoes();
           for (Consulta consulta : medico.getConsultas()) { // Exibindo informações da consulta
               consulta.exibirInformacoes();
               System.out.println();
           }
           System.out.println();
       }

       scanner.close();
   }
}