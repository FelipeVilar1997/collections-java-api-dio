package com.fbvilar.study.list.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = contatoSet;
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
           if (c.getNome().startsWith(nome)){
               contatosPorNome.add(c);
           }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
           if (c.getNome().equalsIgnoreCase(nome)){
               c.setNumero(novoNumero);
               contatoAtualizado = c;
               break;
           }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Felipe", 123456);
        agendaContatos.adicionarContato("Felipe", 5665);
        agendaContatos.adicionarContato("Felipe Vilar", 1111111);
        agendaContatos.adicionarContato("Felipe DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();
    }

}
