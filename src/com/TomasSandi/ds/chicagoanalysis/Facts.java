package com.TomasSandi.ds.chicagoanalysis;
import com.TomasSandi.ds.chicagoanalysis.models.Worker;

public class Facts {
    
    private Worker[] workers;
    
    public Facts(Worker[] workers) {
        this.workers = workers;
        
        //Objetivo 1 y 5
        System.out.println("");
        this.getMostExpensiveDepartment();
        System.out.println("");
        //objetivo 2
        this.getFiveHigherPaidWorker();
        System.out.println("");
        //objetivo 4
        this.getHigerPaidHalfTimePosition();
        System.out.println("");
    }
    
    public void getHigerPaidHalfTimePosition(){
        Worker higherPaid = null;
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getIsPartTime() && (higherPaid == null || this.workers[index].getAnnualSalary() > higherPaid.getAnnualSalary())){
                higherPaid = this.workers[index];
            }
        }
        System.out.println("El empleado que trabaja medio tiempo con el salario más alto es:");
        System.out.println(higherPaid.toString());
    }
    
    public void getFiveHigherPaidWorker(){
        Worker higherPaid1 = workers[0]; Worker higherPaid2 = workers[0]; Worker higherPaid3 = workers[0];
        Worker higherPaid4 = workers[0]; Worker higherPaid5 = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > higherPaid1.getAnnualSalary()){
                higherPaid1 = this.workers[index];
            }else if(this.workers[index].getAnnualSalary() > higherPaid2.getAnnualSalary()){
                higherPaid2 = this.workers[index];
            }else if(this.workers[index].getAnnualSalary() > higherPaid3.getAnnualSalary()){
                higherPaid3 = this.workers[index];
            }else if(this.workers[index].getAnnualSalary() > higherPaid4.getAnnualSalary()){
                higherPaid4 = this.workers[index];
            }else if(this.workers[index].getAnnualSalary() > higherPaid5.getAnnualSalary()){
                higherPaid5 = this.workers[index];
            }
        }
        System.out.println("Los empleados de medio tiempo con los salarios más altos son:");
        System.out.println(higherPaid1.toString());
        System.out.println(higherPaid2.toString());
        System.out.println(higherPaid3.toString());
        System.out.println(higherPaid4.toString());
        System.out.println(higherPaid5.toString());
    }
    
    public void getMostExpensiveDepartment(){
        
        double adminHearngBudget = 0; double animalContrlBudget = 0; double aviationBudget = 0;
        double boardOfElectionBudget = 0; double boardOfEthicsBudget = 0; double budgetandMgmtBudget = 0;
        double buildingsBudget = 0; double businessAffairsBudget = 0; double cityClerkBudget = 0;
        double cityCouncilBudget = 0; double copaBudget = 0; double culturalAffairsBudget = 0;
        double daisBudget = 0; double disabilitiesBudget = 0; double familyAndSupportBudget = 0;
        double financeBudget = 0; double fireBudget = 0; double healthBudget = 0; double housingBudget = 0;
        double housingAndEconDevBudget = 0; double humanRelationsBudget = 0; double humanResourcesBudget = 0;
        double inspectorGenBudget = 0; double lawBudget = 0; double mayorsOfficeBudget = 0;
        double oemcBudget = 0; double policeBudget = 0; double policeBoardBudget = 0;
        double procurementBudget = 0; double publicLibraryBudget = 0; double publicSafetyAdminBudget = 0;
        double streetsAndSanBudget = 0; double transportnBudget = 0; double treasurerBudget = 0;
        double waterMgmntBudget = 0;
        
        for (int i = 0; i < this.workers.length; i++) {
            if (this.workers[i].getDepartment().compareTo("ADMIN HEARNG") == 0) {
                adminHearngBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("ANIMAL CONTRL") == 0) {
                animalContrlBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("AVIATION") == 0) {
                aviationBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("BOARD OF ELECTION") == 0) {
                boardOfElectionBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("BOARD OF ETHICS") == 0) {
                boardOfEthicsBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("BUDGET & MGMT") == 0) {
                budgetandMgmtBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("BUILDINGS") == 0) {
                buildingsBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("BUSINESS AFFAIRS") == 0) {
                businessAffairsBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("CITY CLERK") == 0) {
                cityClerkBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("CITY COUNCIL") == 0) {
                cityCouncilBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("COPA") == 0) {
                copaBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("CULTURAL AFFAIRS") == 0) {
                copaBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("DAIS") == 0) {
                daisBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("DISABILITIES") == 0) {
                disabilitiesBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("FAMILY & SUPPORT") == 0) {
                familyAndSupportBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("FINANCE") == 0) {
                financeBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("FIRE") == 0) {
                fireBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("HEALTH") == 0) {
                healthBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("HOUSING") == 0) {
                housingBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("HOUSING & ECON DEV") == 0) {
                housingAndEconDevBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("HUMAN RELATIONS") == 0) {
                humanRelationsBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("HUMAN RESOURCES") == 0) {
                humanResourcesBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("INSPECTOR GEN") == 0) {
                inspectorGenBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("LAW") == 0) {
                lawBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("MAYOR'S OFFICE") == 0) {
                mayorsOfficeBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("OEMC") == 0) {
                oemcBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("POLICE") == 0) {
                policeBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("POLICE BOARD") == 0) {
                policeBoardBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("PROCUREMENT") == 0) {
                procurementBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("PUBLIC LIBRARY") == 0) {
                publicLibraryBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("PUBLIC SAFETY ADMIN") == 0) {
                publicSafetyAdminBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("STREETS & SAN") == 0) {
                streetsAndSanBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("TRANSPORTN") == 0) {
                transportnBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("TREASURER") == 0) {
                treasurerBudget += this.workers[i].getAnnualSalary();
            }else if (this.workers[i].getDepartment().compareTo("WATER MGMNT") == 0) {
                waterMgmntBudget += this.workers[i].getAnnualSalary();
            }
        }
        double[] budgets = {adminHearngBudget, animalContrlBudget, aviationBudget, 
            boardOfElectionBudget, boardOfEthicsBudget, budgetandMgmtBudget, 
            buildingsBudget,businessAffairsBudget, cityClerkBudget, cityCouncilBudget, 
            copaBudget, daisBudget, disabilitiesBudget, familyAndSupportBudget, 
            financeBudget, fireBudget, healthBudget, housingBudget, housingAndEconDevBudget, 
            humanRelationsBudget, humanResourcesBudget, inspectorGenBudget, lawBudget, 
            mayorsOfficeBudget, oemcBudget, policeBudget, policeBoardBudget, 
            procurementBudget, publicLibraryBudget, publicSafetyAdminBudget, 
            streetsAndSanBudget, transportnBudget, treasurerBudget, waterMgmntBudget};
        
        String[] deparmentName = {"adminHearng", "animalContrl", "aviation", 
            "boardOfElection", "boardOfEthics", "budgetandMgmt", 
            "buildings", "businessAffairs", "cityClerk", "cityCouncil", 
            "copa", "dais", "disabilities", "familyAndSupport", 
            "finance", "fire", "health", "housing", "housingAndEconDev", 
            "humanRelations", "humanResources", "inspectorGen", "law", 
            "mayorsOffice", "oemc", "police", "policeBoard", 
            "procurement", "publicLibrary", "publicSafetyAdmin", 
            "streetsAndSan", "transportn", "treasurer", "waterMgmnt"};
        
        double toCompare = budgets[0];
        int aux = 0;
        for(int j =0; j < budgets.length; j++){
            if(budgets[j] > toCompare){
                toCompare = budgets[j];
                aux = j;
            }
        }
        
        double CheapestDepartment1 = budgets[0]; int position1 = 0; double CheapestDepartment2 = budgets[0]; int position2 = 0;
        double CheapestDepartment3 = budgets[0]; int position3 = 0; double CheapestDepartment4 = budgets[0]; int position4 = 0;
        double CheapestDepartment5 = budgets[0]; int position5 = 0;
        
        for(int k = 0; k < budgets.length; k++){
            if(budgets[k] < CheapestDepartment1){
                CheapestDepartment1 = budgets[k];
                position1 = k;
            }else if(budgets[k] < CheapestDepartment2){
                CheapestDepartment2 = budgets[k];
                position2 = k;
            }else if(budgets[k] < CheapestDepartment3){
                CheapestDepartment3 = budgets[k];
                position3 = k;
            }else if(budgets[k] < CheapestDepartment4){
                CheapestDepartment4 = budgets[k];
                position4 = k;
            }else if(budgets[k] < CheapestDepartment5){
                CheapestDepartment5 = budgets[k];
                position5 = k;
            }
        }
        
        System.out.println("El departamento más caro es el: " + deparmentName[aux]);
        System.out.println("");
        System.out.println("Los 5 departamentos más baratos son: " + deparmentName[position1] + ", " + deparmentName[position2] + ", " +
                deparmentName[position3] + ", " + deparmentName[position4] + ", " + deparmentName[position5]);
    }
}
