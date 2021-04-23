public class Main {
    public static void main(String[] args) {
        ProcessaBoleto processador = new ProcessaBoleto(new BancoBradesco());
        String nomeDoArquivo = "boletos-bradesco-1.txt";
        processador.processar(nomeDoArquivo);
    }
}
