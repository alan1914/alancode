package com.alan.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    private List<Command> commandList = new ArrayList<>();


    public void addCommand(Command command) {
        command.execute();
    }

    public void executeCommand() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }


}
