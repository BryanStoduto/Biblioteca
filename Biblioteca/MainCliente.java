import java.util.Scanner;

public class MainCliente {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();
        Livro l1 = new Livro();

        System.out.println("(ง︡'-'︠)ง-------(ง︡'-'︠)ง");
        System.out.println("        DIGITE AS INFORMAÇÕES");

        System.out.println("Digite o nome do Cliente: ");
        c1.nome = ler.nextLine();

        System.out.println("Digite o seu Endereço: ");
        c1.endereco = ler.nextLine();

        System.out.println("Digite o seu email: ");
        c1.email = ler.nextLine();

        System.out.println("Digite a sua Idade: ");
        c1.idade = ler.nextInt();

        System.out.println(c1.verificarIdade());
        System.out.println("");

        System.out.println("(ง︡'-'︠)ง-------(ง︡'-'︠)ง");
        System.out.println("DIGITE AS INFORMAÇÕES DO LIVRO");

        System.out.println("Nome do Livro: ");
        l1.nomeLivro = ler.next();

        System.out.println("Nome do Autor: ");
        l1.autor = ler.next();

        System.out.println("Digite o Valor: ");
        l1.valor = ler.nextDouble();

        System.out.println(l1);
        System.out.println(l1.verificarPreco());

    }

}
