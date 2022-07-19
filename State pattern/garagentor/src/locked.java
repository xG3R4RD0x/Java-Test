public class locked extends state{

    private controller m_controller;
    private static locked m_instance;


    private locked(controller c){
        this.m_controller =c;
        System.out.println("**gate is locked**");

    };

    public static state enter(controller c){
        if(m_instance == null) m_instance = new locked(c);
        return m_instance;
    }
    public void startUnlock(){
        awaitingCombination.enter(this.m_controller);
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
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



}
