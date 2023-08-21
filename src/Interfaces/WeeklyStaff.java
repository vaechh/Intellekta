package Interfaces;

class WeeklyStaff extends MonthlyStaff{
    private int workWeeks;

    public int getWorkWeeks() {
        return workWeeks;
    }

    WeeklyStaff(int workDays, int premium, int workWeeks){
        super(workDays, premium);
        this.workWeeks = workWeeks < 2 ? 0 : workWeeks > 4 ? 0 : workWeeks;
    }
    @Override
    public int calculateSalary(int salary){
        return workWeeks * salary;
    }
    void printYearSalary(int salary){
        System.out.println(calculateSalary(salary) * 26);
    }
}