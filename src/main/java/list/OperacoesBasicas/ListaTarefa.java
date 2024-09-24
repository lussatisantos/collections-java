package main.java.list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;
import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList){
            if(t.getDescricao().equals(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();

        System.out.println(listatarefa.obterNumeroTotalTarefa());
    }
}
