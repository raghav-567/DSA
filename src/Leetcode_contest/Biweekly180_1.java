package Leetcode_contest;

public class Biweekly180_1 {
    public static void main(String[] args) {

    }
    public String trafficSignal(int timer) {
        String status = null;
        if(timer == 0){
            status = "Green";
            return status;
        } else if(timer == 30){
            status = "Orange";
            return status;
        } else if(timer > 30 && timer <= 90){
            status = "Red";
            return status;
        }
        status = "Invalid";
        return status;
    }
}
