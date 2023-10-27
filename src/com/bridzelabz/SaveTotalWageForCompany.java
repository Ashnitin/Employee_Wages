package com.bridzelabz;

public class SaveTotalWageForCompany {
    public static final int IS_PART_Time=1;
    public static final int IS_FULL_TIME=2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpEage;

    public SaveTotalWageForCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void computeEmpWage(){
        //Variable
        int empHrs=0, totalEmphrs=0, totalWorkingDays = 0;
        while(totalEmphrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays){
            totalWorkingDays++;
            int empCheck=(int) Math.floor(Math.random()*10)%3;
            switch (empCheck){
                case IS_PART_Time :
                    empHrs=4;
                    break;
                case  IS_FULL_TIME:
                    empHrs=8;
                    break;
                default:
                    empHrs=0;
            }
            totalEmphrs +=empHrs;
            System.out.println("Day: "+totalWorkingDays+" Emp Hr: "+empHrs);
        }
        totalEmpEage=totalEmphrs*empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total Emp wage For Company: " +company+ " is: "+totalEmpEage;
    }

    public static void main(String[] args) {
        SaveTotalWageForCompany Dmart=new SaveTotalWageForCompany("Dmart",20,20,100);
        SaveTotalWageForCompany reliance=new SaveTotalWageForCompany("Reliance",10,4,20);
        Dmart.computeEmpWage();
        System.out.println(Dmart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
