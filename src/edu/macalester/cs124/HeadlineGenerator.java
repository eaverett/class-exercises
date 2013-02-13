package edu.macalester.cs124;

import java.awt.Font;
import java.util.Random;

import acm.program.ConsoleProgram;

public class HeadlineGenerator extends ConsoleProgram {
    private final Random rand = new Random();
    
    public void run() {
        setFont(new Font("Helvetica Neue", Font.BOLD, 24));
        
        println("Breaking news!!");
    }
}
