import java.time.LocalDateTime;
import java.util.List;

public class AgendaConsultorio {
    private List<Consulta> consultas;

    // TODO: Fazer os métodos agendarConsulta(), listarConsultasPorMedico(), cancelarConsulta()

    // Métod criado para agendar uma consulta
    public boolean agendarConsulta(Paciente paciente, Medico medico, LocalDateTime dataHora, String observacoes){
        // Verifica se já existe uma consulta no mesmo horário com o mesmo medico:
        for (Consulta c : consultas){
            if (c.getMedico().equals(medico) && c.getDataHora().equals(dataHora)){
                System.out.println("Erro: O médico " + medico.getNome() + "já tem uma consulta nesse horário.");
                return false;
            }
        }
        Consulta novaConsulta = new Consulta(paciente, medico, dataHora, observacoes);
        consultas.add(novaConsulta);
        System.out.println("Consulta agendada com sucesso!");
        return true;
    }
    // Metod criado para cancelar uma consulta agendada.
    public boolean cancelarConsulta(Paciente paciente, Medico medico, LocalDateTime dataHora){
        for (Consulta c : consultas){
            if (c.getPaciente().equals(paciente) && c.getMedico().equals(medico) && c.getDataHora().equals(dataHora)){
               consultas.remove(c);
                System.out.println("Consulta cancelada com sucesso.");
                return true;
            }
        }
        System.out.println("Erro: Consulta não encontrada.");
        return false;
    }

    public void listarConsultasPorMedico(Medico medico){
        System.out.println("Consultas do Dr. " + medico.getNome() + " (" + medico.getEspecialidade() + "):");
        for (Consulta c : consultas){
            if(c.getMedico().equals(medico)){
                c.exibirDetalhes();
                System.out.println("-------------------------");
            }
        }
    }
}
