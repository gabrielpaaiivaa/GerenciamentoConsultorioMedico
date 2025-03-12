import java.time.LocalDateTime;
import java.util.List;
import java.time.LocalDateTime;
public class Paciente extends Pessoa {
    private int telefone;
    private String endereco;
    private String historicoMedico;

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    // Metodo criado para exibir o historico de consultas passadas do paciente.

    public void exibirHistorico(List<Consulta> consultas){
        System.out.println("Histórico de Consultas de "+ this.getNome());
        boolean encontrou = false;
        LocalDateTime agora =  LocalDateTime.now();

        for (Consulta c : consultas){
            // O this representa o objeto atual que chamou o método.
            if (c.getPaciente().equals(this) && c.getDataHora().isBefore(agora)){
                c.exibirDetalhes();
                System.out.println("----------------------------");
                encontrou = true;
            }
        }
        if (!encontrou){
            System.out.println("Nenhuma consulta passada encontrada para "+this.getNome());
        }
    }
}
