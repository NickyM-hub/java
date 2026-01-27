class Main {
    static void main() {

        Livro livro1 = new Livro("1984", "George Orwell");
            if (livro1.isDisponivel() == false && Livro.totalLivros == 0) {
                System.out.println("O livro não está disponível para empréstimo.");
            }

            else {
                System.out.println("O livro está disponível para empréstimo.");
                livro1.emprestar();
            };
        
            
        
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
            if (livro2.isDisponivel() == false) {
                System.out.println("O livro não está disponível para empréstimo.");
            }

            else {
                System.out.println("O livro está disponível para empréstimo.");
                livro2.emprestar();
            };

        System.out.println("Livros emprestados: " + Livro.livrosEmprestados);
        System.out.println("Total de livros: " + Livro.totalLivros);
    }
}
