package Interfaces;

class HourlyStaff implements Staff{
    private int workTime;


    public int getWorkTime() {
        return workTime;
    }

    HourlyStaff(int workTime){
        this.workTime = workTime < 4 ? 0 : workTime > 10 ? 0 : workTime;
    }

    @Override
    public int calculateSalary(int salary) {
        return salary * workTime;
    }
}
