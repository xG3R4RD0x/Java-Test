import java.util.Scanner;


public class controller {
    
    
    private state m_state;



    controller(){
        this.m_state=closed.enter(this);

    }
    public void changeState(state s){
        this.m_state=s;
    }
    public void run(){

        Scanner sc = new Scanner(System.in);
        System.out.println("you take the controller of the door but it is "+m_state.getClass().getSimpleName());
        System.out.println("what do you want to do?");
        String s = sc.nextLine();

        switch(s){
            case "opened":
            this.changeState(opened.enter(this));
            this.run();
            case "closed":
            this.changeState(closed.enter(this));
            this.run();
            case "locked":
            this.changeState(locked.enter(this));
            this.run();
            case "unlock":
            this.m_state.startUnlock();
            this.run();
            case "enter combination":
            this.m_state.combinationentered();
            this.run();
            case "error":
            this.m_state.errorentered();
            default:
            System.out.println("try other word");
            this.run();
        };
        



    }
}
