package TarefaMod22;

import Exemplos.Pessoa;

import java.util.List;
import java.util.Objects;

public class Pessoas {

    private String id;

    private String nome;

    private String nacionalidade;

    private int idade;

    private String sexo;

    public Pessoas() {

    }

    public Pessoas (String id, String nome, String nacionalidade, int idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.sexo = sexo;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Pessoas> HomensxMulheres(){
        Pessoas pessoas1 = new Pessoas("n1", "Cristiano Ronaldo", "Português", 39, "M");
        Pessoas pessoas2 = new Pessoas("n2", "Marta Vieira", "Brasileira", 38, "F");
        Pessoas pessoas3 = new Pessoas("n3", "Lionel Messi", "Argentino", 37, "M");
        Pessoas pessoas4 = new Pessoas("n4", "Alexia Putellas", "Espanhola", 30, "F");
        Pessoas pessoas5 = new Pessoas("n5", "Neymar Junior", "Brasileiro", 32, "M");
        Pessoas pessoas6 = new Pessoas("n6", "Athenea Del Castillo", "Espanhola", 23, "F");
        return List.of(pessoas1, pessoas2, pessoas3, pessoas4, pessoas5, pessoas6);
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}

