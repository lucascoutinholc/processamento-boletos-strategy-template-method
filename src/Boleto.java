import java.time.LocalDate;
import java.time.LocalDateTime;

public class Boleto {
    private int id;
    private String codigoBanco;
    private LocalDateTime dataPagamento; //2021-03-14T21:20:30 - Data e hora
    private LocalDate dataVencimento; //2021-03-15 - Data
    private String cpfCliente;
    private double valor;
    private double multa;
    private double juros;
    private String agencia;
    private String contaBancaria;

    public Boleto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "id=" + id +
                ", codigoBanco='" + codigoBanco + '\'' +
                ", dataPagamento=" + dataPagamento +
                ", dataVencimento=" + dataVencimento +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", valor=" + valor +
                ", multa=" + multa +
                ", juros=" + juros +
                ", agencia='" + agencia + '\'' +
                ", contaBancaria='" + contaBancaria + '\'' +
                '}';
    }
}