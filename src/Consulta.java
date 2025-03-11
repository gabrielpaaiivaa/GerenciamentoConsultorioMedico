import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;
    private String observacoes;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora, String observacoes) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.observacoes = observacoes;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void exibirDetalhes(){
        System.out.println("Data e Hora: "+ dataHora);
        System.out.println("Paciente:  "+ paciente.getNome());
        System.out.println("Médico: "+ medico.getNome());
        System.out.println("Observações: "+ observacoes);
    }
}
