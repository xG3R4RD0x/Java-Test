public class awaitingCombination extends state {
    private controller m_controller;

    
    private static awaitingCombination m_instance;


    private awaitingCombination( controller c){
        this.m_controller= c;
        System.out.println("**Awaiting combination**");
    };

    public static state enter(controller c){
        if(m_instance==null) {
			m_instance= new awaitingCombination(c);
		}
		c.changeState(m_instance);
		return m_instance;
    }
    

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void combinationentered() {
        System.out.println("**combination entered**");
        System.out.println("**gate is unlocked**");
        closed.enter(this.m_controller);
        
    }

    @Override
    public void errorentered() {
        System.out.println("**Combination Error**");
        System.out.println("**could not unlock**");
        locked.enter(this.m_controller);
        
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