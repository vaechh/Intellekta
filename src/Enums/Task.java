package Enums;

public class Task {
    enum Planes{
        BOEING(8000,10),

        IL90(5400,9),

        TU153(14000,15);

        public final int distance;

        public final int time;

        public int speed(){
            return (this.distance / this.time);
        }

        Planes(int distance_, int time_){
            distance = distance_;
            time = time_;
        }
    }
    int maxSpeed(){
        int result = 0;

        for(Planes elem : Planes.values())
            if(elem.speed() > result)
                result = elem.speed();

        return result;
    }
}
