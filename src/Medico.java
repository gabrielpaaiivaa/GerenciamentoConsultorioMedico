import java.util.ArrayList;

public class Medico extends Pessoa{
    private int crm;
    private String especialidade;
    private ArrayList<String> listaDeConsultas = new ArrayList<>();

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<String> getListaDeConsultas() {
        return listaDeConsultas;
    }

    public void setListaDeConsultas(ArrayList<String> listaDeConsultas) {
        this.listaDeConsultas = listaDeConsultas;
    }
}
