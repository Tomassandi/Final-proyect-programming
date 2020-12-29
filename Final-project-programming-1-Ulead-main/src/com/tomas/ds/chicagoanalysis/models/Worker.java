package com.tomas.ds.chicagoanalysis.models;

public class Worker extends Person {
    
    protected String department;
    protected String jobTitle;
    protected boolean isPartTime;
    protected boolean isHourly;
    protected int typicalAmountOfHours;
    protected double annualSalary;
    protected double hourlyRate;

    public Worker(final String name,
            final String lastname,
            final String jobTitle,
            final String deparment,
            final String isPartTime,
            final String isHourly,
            final String typicalAmountOfHours) {
        super(name, lastname);
        
        this.jobTitle = jobTitle;
        this.department = deparment;
        this.isPartTime = this.parsePartTimeInput(isPartTime);
        this.isHourly = this.parseIsHourlyInput(isHourly);
        this.typicalAmountOfHours = this.parseTypicalAmountOfHoursInput(typicalAmountOfHours);
    }

    public String toString(){
        return "Name: " + this.name + " Last Name: " + this.lastname + 
                " Job title:" + this.jobTitle + " Department:" + this.department
                + " isPartTime:" + this.isPartTime + 
                " isHourly:" + this.isHourly + " typicalAmountOfHours: " + this.typicalAmountOfHours;
    }
    
    private boolean parsePartTimeInput(String partTimeColumnData){
        isPartTime = false;
        if(partTimeColumnData.compareTo("P") == 0){
            isPartTime = true;
        }
        return isPartTime;
    }
    
    private boolean parseIsHourlyInput(String isHourlyColumnData){
        
       isHourly = false;
       if(isHourlyColumnData.compareTo("Hourly") == 0){
           isHourly = true;
       }
        return isHourly;
    }
    
    private int parseTypicalAmountOfHoursInput(String typicalAmountOfHoursColumnData){
        
        if (typicalAmountOfHoursColumnData.compareTo("Annual Salary") == 0 || typicalAmountOfHoursColumnData.compareTo("") == 0){
            typicalAmountOfHoursColumnData = "0";
        }
        
        typicalAmountOfHours = Integer.valueOf(typicalAmountOfHoursColumnData);
        
        return typicalAmountOfHours;
    }
}
