package com.TomasSandi.ds.chicagoanalysis.models;

public class Worker extends Person {
    
    protected String department;
    protected String jobTitle;
    protected boolean isPartTime;
    protected boolean isHourly;
    protected int typicalAmountOfHours;
    protected double annualSalary;
    protected double hourlyRate;
    protected double annualSalaryHourly;

    public Worker(final String name,
            final String lastname,
            final String jobTitle,
            final String deparment,
            final String isPartTime,
            final String isHourly,
            final String typicalAmountOfHours,
            final String annualSalary,
            final String hourlyRate) {
        super(name, lastname);
        
        this.jobTitle = jobTitle;
        this.department = deparment;
        this.isPartTime = this.parsePartTimeInput(isPartTime);
        this.isHourly = this.parseIsHourlyInput(isHourly);
        this.typicalAmountOfHours = this.parseTypicalAmountOfHoursInput(typicalAmountOfHours);
        this.annualSalary = this.parseAnnualSalaryInput(annualSalary);
        this.hourlyRate = this.parseHourlyRateInput(hourlyRate);
    }

    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", isPartTime=" + isPartTime +
                ", isHourly=" + isHourly +
                ", typicalAmountOfHours=" + typicalAmountOfHours +
                ", annualSalary=" + annualSalary +
                ", hourlyRate=" + hourlyRate + '}';
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
        
        if(!typicalAmountOfHoursColumnData.isEmpty()){
            try{
                typicalAmountOfHours = Integer.valueOf(typicalAmountOfHoursColumnData);
            } catch(NumberFormatException exc){
                System.out.println(typicalAmountOfHoursColumnData + " Is not a valid value");
                //exc.printStackTrace();
            }
        }else{
            typicalAmountOfHours = 0;
        }
        return typicalAmountOfHours;
    }
    
    private double parseAnnualSalaryInput(String annualSalaryColumnData){
        
        annualSalary = 0.0;
        if(!annualSalaryColumnData.isEmpty()){
            try{
                annualSalary = Double.parseDouble(annualSalaryColumnData);
            } catch(NumberFormatException exc){
                System.out.println(annualSalaryColumnData + " Is not a valid value");
                //exc.printStackTrace();
            }
        }
        return annualSalary;
    }
    
    private double parseHourlyRateInput(String hourlyRateColumnData){
        double hourlyRateInput = 0.0;
        if(!hourlyRateColumnData.isEmpty()){
            try {
                hourlyRateInput = Double.parseDouble(hourlyRateColumnData);
            }
            catch (NumberFormatException exc){
                System.out.println(hourlyRateColumnData + " is not a valid value");
                //exc.printStackTrace();
            }
        }
        return hourlyRateInput;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public boolean getIsPartTime() {
        return isPartTime;
    }

    public boolean getIsHourly() {
        return isHourly;
    }

    public int getTypicalAmountOfHours() {
        return typicalAmountOfHours;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
