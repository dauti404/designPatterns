class AviaoComercial extends Aviao {
    public AviaoComercial(Mediator m, String n){ 
        super(m, n); 
    }
    
    @Override 
    public void enviar(String msg){ 
        mediator.enviarMensagem(msg, this);
    }
    
    @Override 
    public void receber(String msg){ 
        System.out.println(nome + " recebeu: " + msg); 
    }
}