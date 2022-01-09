public class Product {
    private String nome;
    private int qtde;

    public Product(){

    }

    public Product(String nome, int qtde){
        setNome(nome);
        setQtde(qtde);
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "[nome] - " + this.nome + " [qtde] - " + this.qtde;
    }

 

}
