class Application{
    private Button button;
    
    public Application(GUIFactory factory){
        button = factory.createButton();
    }
    
    public void buttonUI(){
        button.button();
    }
}