package demo_java;

//Model to declare the type of data we will be processing
class Hotel {
	//Variables used
    private String name;
    private int rating;
    private int weekdayRegularRate;
    private int weekendRegularRate;
    private int weekdayRewardRate;
    private int weekendRewardRate;
//initialized according to requirement assuming weekdays to be 5 and weekend days to be 2 
    public Hotel(String name, int rating, int weekdayRegularRate, int weekendRegularRate, int weekdayRewardRate, int weekendRewardRate) {
        this.name = name;
        this.rating = rating;
        this.weekdayRegularRate = weekdayRegularRate * 5;
        this.weekendRegularRate = weekendRegularRate * 2;
        this.weekdayRewardRate = weekdayRewardRate * 5;
        this.weekendRewardRate = weekendRewardRate * 2;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
//Basic calculation to extract the overall cost of hotel
    public int calculateCost() {
        int cost = 0;
        cost = weekdayRegularRate + weekendRegularRate + weekdayRewardRate + weekendRewardRate;
        return cost;
    }
}

