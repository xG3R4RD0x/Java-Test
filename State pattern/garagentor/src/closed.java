public class closed extends state{

    private controller m_controller;
    private static closed m_instance;


    private closed( controller c){
        this.m_controller =c;
        System.out.println("**gate is closed**");
        
    };

    public static state enter(controller c){
        if(m_instance == null) m_instance = new closed(c);
        return m_instance;

    }
    public void lock(){
            locked.enter(this.m_controller);
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
    public void open() {
        opened.enter(this.m_controller);
        
    }

    @Override
    public void startUnlock() {
        System.out.println("start unlocking");
        awaitingCombination.enter(this.m_controller);
        
    }

}
