/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gs.nick.learngui;

/**
 *
 * @author nick fun
 */
public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.exec(args);
    }
    
    public void exec(String[] args) {
        System.out.println("Hello World");
        String file = getInputFilename(args);
        System.out.println("Input file is " + file);
        MainWindow w = new MainWindow();
        w.setTitle("GUI Learning Platform");
        w.clearLists();
        w.setVisible(true);
    }

    public String getInputFilename(String[] args) {
        if (args.length == 0) {
            return "input.json";
        }
        return args[0];
    }
    
}
