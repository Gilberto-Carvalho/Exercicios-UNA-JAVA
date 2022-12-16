public class Telas {
    public int idTela = 4;
    public String nome = "4";
    public String tipo;
    public int complexidade = 4;
    public double tempo = 4;

    public double getTempo() {
        return tempo;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public int getIdTela() {
        return idTela;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    public void setIdTela(int idTela) {
        this.idTela = idTela;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int complexidade() {
        return 0;
    }

    public double tempo() {
        return 0;
    }
}
