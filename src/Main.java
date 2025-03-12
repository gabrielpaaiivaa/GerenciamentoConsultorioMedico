import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criando pacientes
        Paciente paciente1 = new Paciente();
        paciente1.setNome("João Silva");
        paciente1.setCpf("123.456.789-00");

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Maria Oliveira");
        paciente2.setCpf("987.654.321-00");

        // Criando médicos
        Medico medico1 = new Medico();
        medico1.setNome("Dr. Carlos Souza");
        medico1.setEspecialidade("Cardiologista");
        medico1.setCrm(12345);

        Medico medico2 = new Medico();
        medico2.setNome("Dr. Ana Mendes");
        medico2.setEspecialidade("Dermatologista");
        medico2.setCrm(67890);

        // Criando a agenda do consultório
        AgendaConsultorio agenda = new AgendaConsultorio();

        // Agendando algumas consultas
        LocalDateTime data1 = LocalDateTime.of(2025, 3, 10, 14, 0);
        LocalDateTime data2 = LocalDateTime.of(2025, 3, 12, 10, 0);
        LocalDateTime data3 = LocalDateTime.of(2025, 3, 15, 16, 30);

        //Importante entender essas linhas
        agenda.agendarConsulta(paciente1, medico1, data1, "Rotina");
        agenda.agendarConsulta(paciente1, medico2, data2, "Alergia na pele");
        agenda.agendarConsulta(paciente2, medico1, data3, "Exame de rotina");

        // Testando listar consultas por médico
        System.out.println("\n--- Listando consultas do Dr. Carlos Souza ---");
        agenda.listarConsultasPorMedico(medico1);

        // Testando listar consultas por paciente
        System.out.println("\n--- Listando consultas de João Silva ---");
        agenda.listarConsultasPorPaciente(paciente1);

        System.out.println("\n--- Listando consultas de Maria Oliveira ---");
        agenda.listarConsultasPorPaciente(paciente2);

        // Testando cancelar uma consulta
        System.out.println("\n--- Cancelando uma consulta ---");
        agenda.cancelarConsulta(paciente1, medico1, data1);

        // Verificando se a consulta foi cancelada
        System.out.println("\n--- Listando consultas de João Silva após cancelamento ---");
        agenda.listarConsultasPorPaciente(paciente1);
    }
}
