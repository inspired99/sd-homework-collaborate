package ru.itmo.simplecli.executor;

import java.util.List;

public abstract class Command implements Executable {
    protected EndStatus status;
    protected List<String> args;
    protected String output = null;
    protected EnvironmentManager environment;

    public Command(List<String> args, EnvironmentManager environment) {
        this.args = args;
        this.environment = environment;
    }

    public String getOutput() {
        return output;
    }

    @Override
    public EndStatus getEndStatus() {
        return status;
    }
    @Override
    public abstract void execute(String input);

}