package com.TomasSandi.ds.chicagoanalysis.models;

public class ElasticWorkerArray {
    
    private Worker[] workerArray;
    private Worker[] auxiliaryWorkerArray;
    
    public ElasticWorkerArray() {

    }
    
    public void addWorker(Worker newWorker){
        if(this.workerArray == null){
            this.workerArray = new Worker[1];
            this.workerArray[0] = newWorker;
        }
        else{
            this.auxiliaryWorkerArray = new Worker[this.workerArray.length + 1];
            for(int index = 0; index < this.workerArray.length; ++index){
                this.auxiliaryWorkerArray[index] = this.workerArray[index];
            }
            this.auxiliaryWorkerArray[this.auxiliaryWorkerArray.length - 1] = newWorker;
            this.workerArray = this.auxiliaryWorkerArray;
        }
    }
    
    public Worker[] getWorkerArray() {
        return workerArray;
    }
    
}
