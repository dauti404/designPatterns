// Objeto círculo que armazena os dados desejados pelo cliente
public class Circulo {
    // Cores do círculo
    private String cor;

    // Construtor que pega a cor do círculo 
    public Circulo(String cor){
        this.cor = cor;
    }
    
    // Método que desenha o círculo e sua posição
    // Pega atríbutos do círculo
    public void desenhar(int x, int y, int raio){
        System.out.println("Desenhando um Circulo: " + cor + " em (" + x + "," + y + ") com raio: " + raio);
    }
}