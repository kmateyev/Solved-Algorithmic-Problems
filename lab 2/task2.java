class Solution {
    public double average(int[] salary) {
        double max = 0;
        double min = salary[0];
        double avg = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
            if (salary[i] < min) {
                min = salary[i];
            }
            avg += salary[i];
        }
        return (avg - min - max) / (salary.length - 2); 
    }
}
