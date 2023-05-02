package java0502.template2;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLeveMessage();

    final public void go(int count) {
        run();
        for (int i=0; i<count; i++) {
            jump();
        }
        turn();
    }
}
