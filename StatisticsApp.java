

public class StatisticsApp{

public static int sumOfScores (int[] numbers){
    
    int sum = 0;
for(int value =0; value<numbers.length; value++){

sum+= numbers[value];
}
return sum;
}

public static double meanOfScores (int[] numbers){
double mean = (double) sumOfScores(numbers)/numbers.length;  
return mean;
}

public static double varianceOfScores (int[] numbers){
double mean = meanOfScores(numbers);
double sumOfMeanDifference = 0;
for(int value =0; value<numbers.length; value++){
    sumOfMeanDifference += numbers[value];
}

    return sumOfMeanDifference/numbers.length;
}

public static double standardDeviation (int[] numbers){

    double std = Math.sqrt(varianceOfScores(numbers));
    return std;


}
}
