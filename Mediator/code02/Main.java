public class Main {
    public static void main(String[] args) {
        TorreControle torre = new TorreControle();

        Aviao boeing = new AviaoComercial(torre, "Boeing 747");
        Aviao airbus = new AviaoComercial(torre, "Airbus A380");

        torre.adicionarAviao(boeing);
        torre.adicionarAviao(airbus);

        boeing.enviar("Solicitando pouso.");
        airbus.enviar("Pista livre.");
    }
}
