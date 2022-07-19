public class opened extends state {
    private controller m_controller;
    private static opened m_instance ;


    private opened( controller c){
        this.m_controller =c;
        System.out.println("**gate is open**");
    };

    public static state enter(controller c){
        if(m_instance == null) m_instance = new opened(c);
        return m_instance;
    }
    public void close(){
        closed.enter(this.m_controller);
    }

    @Override
    public void combinationentered() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void errorentered() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void lock() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void open() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void startUnlock() {
        // TODO Auto-generated method stub
        
    }

}
