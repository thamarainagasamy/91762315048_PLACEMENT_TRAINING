public class problem_1518 {
public int numWaterBottles(int numBottles, int numExchange) {
        int n = 0;
        int num = numBottles;
        while(numBottles>=numExchange){
            n = numBottles/numExchange;
            num += n;
            n = n+numBottles%numExchange;
            numBottles = n;
        }
        return num;
    } 
}