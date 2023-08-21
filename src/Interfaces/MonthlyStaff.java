package Interfaces;

class MonthlyStaff implements Staff{
    private int workDays;

    public int getWorkDays() {
        return workDays;
    }

    private int premium;

    public int getPremium() {
        return premium;
    }

    MonthlyStaff(int workDays, int premium){
        this.workDays = workDays < 0 ? 0 : workDays > 30 ? 0 : workDays;
        this.premium = premium < 0 ? 0 : premium > 10000 ? 0 : premium;
    }

    @Override
    public int calculateSalary(int salary) {
        return salary * workDays + premium;
    }
}
