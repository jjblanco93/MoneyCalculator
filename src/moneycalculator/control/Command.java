package moneycalculator.control;

/**
 * @author julioblanco
 */
public interface Command {
    
    String name();
    void execute();
}
