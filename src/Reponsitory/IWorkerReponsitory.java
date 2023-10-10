/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import java.util.ArrayList;
import model.History;
import model.Worker;

/**
 *
 * @author ASUS
 */
public interface IWorkerReponsitory {
    void addWorker(ArrayList<Worker> lw);
    void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status);
    void printListHistory(ArrayList<History> lh);
}
