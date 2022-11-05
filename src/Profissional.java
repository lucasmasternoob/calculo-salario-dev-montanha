public class Profissional {
    public String Nome;
    public double SalarioMensalDesejado;
    public double FHD = 7;
    public double diasUteisMensaisPadrao = 20;

    // Salário CLT
    // 1 Mês de férias + 1/3 abono de férias
    // FGTS = 8,33%
    // 13o Salário => 52 seanas no ano => 13 equivale a semana faltante
    // INSS -> 8%, 12%
    // VR -> R$25,00 cct

    public double CalculadoraHorasMensais() {
        return FHD * diasUteisMensaisPadrao;
    }

    public double CalculaValorHora() {
        return (SalarioMensalDesejado * 2) / CalculadoraHorasMensais(); // dobra o valor do salário para incrementar
                                                                        // todos os direitos que não serão pagos no caso
                                                                        // de não ser CLT e ser PJ
    }
}