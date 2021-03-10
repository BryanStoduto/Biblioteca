public class Cliente {

    public String nome;
    public String endereco;
    public int idade;
    public String email;

    public Cliente() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String verificarIdade() {
        String respostaIdade;
        if (this.idade < 18) {
            respostaIdade = "menor de idade";
        } else {
            respostaIdade = "Maior de idade";
        }
        return respostaIdade;
    }

    public String toString() {
        return "\n Nome do Cliente: " + this.nome + "\n Endereço: " + this.endereco + "\n Idade: " + this.idade
                + verificarIdade() + "\n Email1: " + this.email;

    }

}
