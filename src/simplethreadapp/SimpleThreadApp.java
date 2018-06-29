/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplethreadapp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author Crazian
 */


public class SimpleThreadApp {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        //Fixing the size of the thread pool to 5 Assignmentthreads
        for (int i = 1; i < 11; i++) {
            // i starts at 0 but must be less then 10, adding 1 to i
            Runnable assignment = new AssignmentThread("" + i);
            executor.execute(assignment);
            //
          }
        executor.shutdown();
        //shutdown() method initiated an orderly shutdown. 
        //The Assignment threads that have been submitted will be executed but after it
        while (!executor.isTerminated()) {
        }
        //I use executor.isTerminated because I know all of tasks are completed because I use the shutdown()
        System.out.println("Finished all threads");
    }
}