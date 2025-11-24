class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new LinuxButton();
    }
}