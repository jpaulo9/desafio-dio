import java.util.*;

public class Linguagens {

    public static void main(String[] args) {

        //conjunto de linguagens
        Set<LinguagemFavorita> hash = new HashSet<LinguagemFavorita>(){
            {
                add(new LinguagemFavorita("Java", "1991", "Intellij"));
                add(new LinguagemFavorita("Python", "1989", "PyCharm"));
                add(new LinguagemFavorita("PHP", "1994", "Visual Code"));
            }
        };

        Set<LinguagemFavorita> ordConj = new LinkedHashSet<LinguagemFavorita>(){
            {
                add(new LinguagemFavorita("Java", "1991", "Intellij"));
                add(new LinguagemFavorita("Python", "1989", "PyCharm"));
                add(new LinguagemFavorita("PHP", "1994", "Visual Code"));
            }
        };

        //ordem de inserção
        System.out.println("Ordem de Inserção");
        for (LinguagemFavorita l: ordConj) System.out.println("Nome: "+l.getNome()+" Ano: "+l.getAnoCriacao()+" IDE: "+l.getIde());

        //ordem alfabética nome
        System.out.println("\nOrdem Nome");
        Set<LinguagemFavorita> linguagensNome= new TreeSet<>();
        linguagensNome.addAll(hash);
        for (LinguagemFavorita l: linguagensNome) System.out.println("Nome: "+l.getNome()+" Ano: "+l.getAnoCriacao()+" IDE: "+l.getIde());


        Set<LinguagemFavorita> lingIde = new TreeSet<>( new Ide());
        lingIde.addAll(hash);

        System.out.println("\nOrdem IDE");
        for (LinguagemFavorita l: lingIde) System.out.println("IDE: "+l.getIde()+" Nome: "+l.getNome()+" Ano: "+l.getAnoCriacao());

        Set<LinguagemFavorita> linguagens = new TreeSet<>( new AnoNome());
        linguagens.addAll(hash);

        System.out.println("\nOrdem Ano-Nome");
        for (LinguagemFavorita l: linguagens) System.out.println("Ano: "+l.getAnoCriacao()+" Nome: "+l.getNome()+" IDE: "+l.getIde());

        Set<LinguagemFavorita> lingOrdemGeral = new TreeSet<>( new NomeAnoIde());
        lingOrdemGeral.addAll(hash);

        System.out.println("\nOrdem Nome-Ano-Ide");
        for (LinguagemFavorita l: lingOrdemGeral) System.out.println("Nome: "+l.getNome()+" Ano: "+l.getAnoCriacao()+" IDE: "+l.getIde());


    }


}
class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    String nome, anoCriacao, Ide;

    public LinguagemFavorita() {
    }

    public LinguagemFavorita(String nome, String anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        Ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoCriacao.equals(that.anoCriacao) && Ide.equals(that.Ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, Ide);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(String anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getIde() {
        return Ide;
    }

    public void setIde(String ide) {
        Ide = ide;
    }


    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.getNome().compareTo(linguagem.getNome());
    }
}
class Ide implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareTo(o2.getIde());
    }
}

class AnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano =  o1.getAnoCriacao().compareTo(o2.getAnoCriacao());
        if(ano!=0) return ano;

        return o1.getNome().compareTo(o2.getNome());
    }
}


class NomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome =  o1.getNome().compareTo(o2.getNome());
        if(nome!=0) return nome;

        int ano =  o1.getAnoCriacao().compareTo(o2.getAnoCriacao());
        if(ano!=0) return ano;

        return o1.getIde().compareTo(o2.getIde());
    }
}

