public class Livro {

    public String nomeLivro;
    public String autor;
    public double preco;
    public double desconto;
    public double valor;

    public Livro() {
    }

    public String getNomeLivro() {
        return this.nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String verificarPreco() {
        String respostaPreco;
        if (this.valor > 70) {
            respostaPreco = "Desconto inserido no produto";
        } else {
            respostaPreco = "Desconto nao inserido";
        }
        return respostaPreco;
    }

    public double calcularDesconto() {
        double valorDesconto;

        if (this.valor > 70) {
            valorDesconto = this.valor = 0.15;
        } else {
            valorDesconto = 0.15;

        }
        return valorDesconto;
    }

    public String toString() {
        return "\nNome do livro: " + this.nomeLivro + "\nAutor: " + this.autor + "\nvalor: " + this.valor;

    }

}
