package model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	private int hiddenValue;
    private int leftBorder;
    private int rightBorder;
    private List<Integer> statistics;
    
    
    public Model(int leftBorder,int rightBorder){
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        hiddenValue=rand(leftBorder,rightBorder);
        statistics = new ArrayList<>();
    }
    
    /**
     * @param min
     * @param max
     * @return random value from min to max
     */
    public int rand(int min, int max) {
        min+=1;
        max-=1;
        return (int) (Math.random() * (max - min) + min+1);
    }
    
    /**
     * in this method hiddenValue is compared with input value
     *
     * @param value
     * @return 0 if this.value equals with input value, -1 if input value > this.value and 1 if input value < this.value
     */
    public int compareWithValue(int value) {
        statistics.add(value);
        if (value == hiddenValue) {
            return 0;
        } else {
            if (value < hiddenValue) {
                leftBorder = value+1;
                return -1;
            } else {
                rightBorder = value-1;
                return 1;
            }
        }
    }

	public int getLeftBorder() {
		return leftBorder;
	}

	public void setLeftBorder(int leftBorder) {
		this.leftBorder = leftBorder;
	}

	public int getRightBorder() {
		return rightBorder;
	}

	public void setRightBorder(int rightBorder) {
		this.rightBorder = rightBorder;
	}

	public List<Integer> getStatistics() {
		return statistics;
	}

 
    
}
