
package controller;

import view.Menu;
import java.util.ArrayList;
import model.History;
import model.Worker;
import Reponsitory.IWorkerReponsitory;
import Reponsitory.WorkerReponsitory;

public class Manager extends Menu<String> {    
    static String[] mc = {"Add a Worker.","Increase salary for worker.", "Decrease for worker.",
        "Show adjusted salary worker information.","Exit"};
    
    private IWorkerReponsitory workerReponsitory;
            
    ArrayList <Worker> lw = new ArrayList<>();
    ArrayList <History> lh = new ArrayList<>();
    public Manager(){
        super("=============== PROGRAMMING ==============", mc);
        workerReponsitory = new WorkerReponsitory(); 
    
    }

    @Override
    public void execute(int n) {
       switch (n){
           case 1:
               workerReponsitory.addWorker(lw);
               break;
           case 2:
               workerReponsitory.changeSalary(lw,lh,1);
               break;
           case 3:
               workerReponsitory.changeSalary(lw,lh,2);
               break;
           case 4:
               workerReponsitory.printListHistory(lh);
               break;
           case 5: 
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
       } 
    }
    
    
}
