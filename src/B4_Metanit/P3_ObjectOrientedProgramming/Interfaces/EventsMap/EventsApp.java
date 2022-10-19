package B4_Metanit.P3_ObjectOrientedProgramming.Interfaces.EventsMap;

public class EventsApp {
    public static void main(String[] args) {

        Button button = new Button(new ButtonClickHandler());
        Button tvButton = new Button(new EventHandler() {
            private boolean on = false;
            public void execute() {
                if (on) {
                    System.out.println("TV switched off");
                    on = false;
                }
                else {
                    System.out.println("TV switched on");
                    on = true;
                }
            }
        });
        Button printButton = new Button(new EventHandler(){
            public void execute() {
                System.out.println("printing");
            }
        });

        button.click();
        button.click();
        button.click();
        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}

interface EventHandler{
    void execute();
}
class Button{
    EventHandler handler;
    Button(EventHandler action) {
        this.handler = action;
    }
    public void click() {
        handler.execute();
    }
}
class ButtonClickHandler implements EventHandler {
    public void execute() {
        System.out.println("Pressed");
    }
}