package il.ac.bgu.se.bp.debugger.commands;

import il.ac.bgu.se.bp.debugger.DebuggerCommand;
import il.ac.bgu.se.bp.debugger.DebuggerEngine;

import java.util.concurrent.FutureTask;

public class Continue implements DebuggerCommand<FutureTask<String>, String> {
    @Override
    public FutureTask<String> applyCommand(DebuggerEngine<FutureTask<String>, String> debugger) {
        return new FutureTask<>(debugger::continueRun);
    }
}