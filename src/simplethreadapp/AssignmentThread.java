/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplethreadapp;

/**
 *
 * @author Crazian
 */
public class AssignmentThread implements Runnable {
  // implementable the Runnable interface on our AssignmentThreadClass
    private String thrNum;
    
    public AssignmentThread(String t){
        this.thrNum = t;
        //constructor
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Thread = "+thrNum);
        //When we run print the current thread in the pool and it's name. Then we pring
        //pool-1-thread-2 Start. Command = 2
        processThread();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processThread() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.thrNum;
    }
}