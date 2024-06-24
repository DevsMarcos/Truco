package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Jogador {

    public List<Carta> cartas;

    public String nome;



    public Jogador(String nome) {
        this.cartas = new ArrayList<>();
        this.nome = nome;
    }


    public Carta jogada(Carta cartaNaMesa){
        return jogar(cartaNaMesa);

    };

    private Carta jogar(Carta cartaNaMesa){
        if (cartas.size() == 3){
            if (cartaNaMesa == null) {
                Carta cartaAlta = cartas.stream()
                        .max(Comparator.comparingInt((c1) -> c1.valor))
                        .get();
                if(cartaAlta.valor >= 130 && cartaAlta.valor <= 130000){
                    cartaNaMesa = cartaAlta;
                    return cartaNaMesa;
                }
            }else{
                Carta caraSecundaria = cartas.stream()
                        .max(Comparator.comparingInt((c1) -> c1.numero))
                        .get();
                cartaNaMesa = caraSecundaria;
                return cartaNaMesa;
            }

        } if(cartas.size() == 2){
            Carta cartaAlta = cartas.stream()
                    .max(Comparator.comparingInt((c1) -> c1.valor))
                    .get();
            if(cartaAlta.valor >= 130 && cartaAlta.valor <= 130000){
                return cartaAlta;
            }else{
                Carta caraSecundaria = cartas.stream()
                        .max(Comparator.comparingInt((c1) -> c1.numero))
                        .get();
                return caraSecundaria;
            }
        }   if(cartas.size() == 1) {
            Carta cartaAlta = cartas.stream()
                    .max(Comparator.comparingInt((c1) -> c1.valor))
                    .get();
                if(cartaAlta.valor >= 130 && cartaAlta.valor <= 130000){
                    return cartaAlta;
                }else{
                    Carta caraSecundaria = cartas.stream()
                            .max(Comparator.comparingInt((c1) -> c1.numero))
                            .get();
                    return caraSecundaria;
                }}
        return cartaNaMesa;
    };

public void exibeCartas(){
    cartas.forEach(c -> {
        System.out.print(c + " ");
    });
    System.out.println();
}};

