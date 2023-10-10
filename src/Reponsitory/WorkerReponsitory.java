/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import DataAccess.WorkerDao;
import java.util.ArrayList;
import java.util.List;
import model.History;
import model.Worker;

/**
 *
 * @author ASUS
 */
public class WorkerReponsitory implements IWorkerReponsitory{
    private List<Worker> lw;
    private List<History> lh;
    
    public WorkerReponsitory(){
        this.lw = new ArrayList();
        this.lh = new ArrayList();
    }

    @Override
    public void addWorker(ArrayList<Worker> lw) {
        WorkerDao.Instance().addWorker(lw);
    }

    @Override
    public void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        WorkerDao.Instance().changeSalary(lw,lh,status);
    }

    @Override
    public void printListHistory(ArrayList<History> lh) {
        WorkerDao.Instance().printListHistory(lh);
    }
    
}
