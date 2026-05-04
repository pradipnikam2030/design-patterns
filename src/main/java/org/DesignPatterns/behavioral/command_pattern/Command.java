package org.DesignPatterns.behavioral.command_pattern;


// command interface
public interface Command {
    void execute();
    void undo();
}

// Receivers
class Light{
    public void on()  {
        System.out.println("Light is ON");
    }
    public void off() {
        System.out.println("Light is OFF");
    }
}

class Fan{
    public void on()  {
        System.out.println("Fan is ON");
    }
    public void off() {
        System.out.println("Fan is OFF");
    }
}

// Concrete Command for Light
class LightCommand implements Command{
    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

class FanCommand implements Command{
    Fan fan;

    public FanCommand(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}


