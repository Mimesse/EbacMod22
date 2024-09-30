package Exemplos;

import java.util.List;

public class ExemplosAllMach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("México"));
        System.out.println(result);

        //Método Convencional
        Boolean re = true;
        for (Pessoa p : lista) {
            if (!p.getNacionalidade().equals("Mexico")) {
                re=false;
                break;
            }
        }

    }
}
