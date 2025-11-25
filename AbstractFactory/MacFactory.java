// Fábrica concreta implementando um produto abstrato específico
class MacFactory implements GUIFactory{
    // Sobrescrevendo o método da fábrica abstrata do produto
    @Override
    // Método com composição que retorna uma instância dessa mesma classe - um objeto específico
    public Button createButton(){
        return new MacButton();
    }
}