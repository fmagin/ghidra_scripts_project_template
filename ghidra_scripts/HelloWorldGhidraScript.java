import ghidra.app.script.GhidraScript;

public class HelloWorldGhidraScript extends GhidraScript {
    @Override
    protected void run() throws Exception {
        println("Hello, Ghidra!");
    }
}
