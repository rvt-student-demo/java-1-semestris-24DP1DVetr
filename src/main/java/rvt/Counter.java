package rvt;

public class Counter {
    private int value;
    
    public Counter(){
        value = 0;
    }
    public Counter(int startValue){
        value = startValue;
    }

    public int value(){
        return value;
    }
    public void increase(){
        value += 1;
    }
    public void increase(int increaseBy){
        value += increaseBy;
    }

    public void decrease(){
        value -= 1;
    }
    public void decrease(int decreaseBy){
        value -= decreaseBy;
    }
}
