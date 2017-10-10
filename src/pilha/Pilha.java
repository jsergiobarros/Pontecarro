package pilha;

public class Pilha {

    public Object[] pilha;

    public int posicaoPilha;

    public Pilha() {

        this.posicaoPilha = -1;

// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new Object[1000];

// criando uma pilha com 1000 posições
    }

    public boolean pilhaVazia() {

        return this.posicaoPilha == -1;

    }

    public int tamanho() {

//is
        if (this.pilhaVazia()) {

            return 0;

        }

        return this.posicaoPilha + 1;

    }

    public Object exibeUltimoValor() {

//top
        if (this.pilhaVazia()) {

            return null;

        }

        return this.pilha[this.posicaoPilha];

    }

    public Object desempilhar() {

//pop
        if (pilhaVazia()) {

            return null;

        }

        return this.pilha[this.posicaoPilha--];

    }

    public void empilhar(Object valor) {

// push
        if (this.posicaoPilha<this.pilha.length - 1){

this.pilha[++posicaoPilha] = valor;

        }

    }

    public static void main(String[] args) {

        Pilha p = new Pilha();

        p.empilhar("Correspondência 1");

        p.empilhar("Correspondência 2");

        p.empilhar("Correspondência 3");

        p.empilhar("Correspondência 4");

        p.empilhar("Correspondência 5");

        if (p.pilhaVazia() == false) {

            System.out.println(p.tamanho());

        } else 
        {
            System.out.println("Vazia");
        }

        while (p.pilhaVazia() == false) {

            System.out.println(p.desempilhar());

        }

        if (p.pilhaVazia() == false) {

            System.out.println(p.tamanho());

        } else {
            System.out.println("Vazia");
        }

    }
        }