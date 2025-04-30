public class CombinedTable {
    private SingleTable one;
    private SingleTable two;

    public CombinedTable(SingleTable o, SingleTable t) {
        one = o;
        two = t;
    }

    public boolean canSeat(int num) {
        return (one.getNumSeats() + two.getNumSeats() - 2 >= num);
    }

    public double getDesirability(){
        if(one.getHeight() == two.getHeight()) return (one.viewQuality + two.viewQuality)/2;
        return ((one.viewQuality + two.viewQuality)/2) -10;
    }

    public double setViewQuality(int num){
        one.setViewQuality(num);
        return one.getViewQuality();
    }
}