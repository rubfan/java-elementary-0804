package command;

import java.util.HashMap;

public class CarRemoteControl {
    private final HashMap<String, Command> commandMap = new HashMap<>();

    public void setCommandName(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        Command command = commandMap.get(commandName);
        if (command != null) {
            command.execute();
        } else
            throw new IllegalStateException("Such command has illegal name");
    }
}
