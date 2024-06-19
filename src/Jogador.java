package src;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    public List<Carta> cartas;

    public String nome;

    public Jogador(String nome) {
        this.cartas = new ArrayList<>();
        this.nome = nome;
    }

    public Carta jogada(Carta cartaNaMesa){
        //PRIMEIRA MÃO
    if (cartas.get(0).valor > cartaNaMesa.valor ){
        return cartas.get(0);

    } else if (cartas.get(0).valor < cartaNaMesa.valor+1 && cartas.get(1).valor > cartas.get(3).valor) {
        return cartas.get(1);

    } else if (cartas.get(0).valor < cartas.get(3).valor && cartas.get(1).valor < cartas.get(3).valor) {
        return cartas.get(2);

        //SEGUNDA MÃO
    } else if (cartas.get(1).valor == cartaNaMesa.valor+1) {
        return cartas.get(1);

    } else if (cartas.get(1).valor < cartaNaMesa.valor+1 && cartas.get(0).valor > cartas.get(4).valor) {
        return cartas.get(0);

    } else if (cartas.get(1).valor < cartaNaMesa.valor+1 && cartas.get(1).valor < cartas.get(4).valor && cartas.get(0).numero < cartas.get(4).valor) {
        return cartas.get(2);

        //TERCEIRA MÃO
    }else if (cartas.get(2).valor == cartaNaMesa.valor+1) {
        return cartas.get(2);

    }else if (cartas.get(2).valor< cartaNaMesa.valor+1 && cartas.get(0).valor > cartas.get(5).valor){
        return  cartas.get(0);
    }else {
        return cartas.get(1);
        }
    }

    public void exibeCartas(){
        cartas.forEach(c -> {
            System.out.print(c + " ");
        });
        System.out.println();
    }
}
