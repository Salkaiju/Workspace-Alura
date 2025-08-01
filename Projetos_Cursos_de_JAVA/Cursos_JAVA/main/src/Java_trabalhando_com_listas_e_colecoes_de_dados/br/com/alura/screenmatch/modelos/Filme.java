package Java_trabalhando_com_listas_e_colecoes_de_dados.br.com.alura.screenmatch.modelos;


import Java_trabalhando_com_listas_e_colecoes_de_dados.br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
