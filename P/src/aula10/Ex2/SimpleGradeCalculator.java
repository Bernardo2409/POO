package aula10.Ex2;

import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator {

    @Override
        public double calculate(List<Double> grades) {
            if (grades == null || grades.isEmpty()) {
                return 0.0; 
            }
            double total = 0.0;
            for (double grade : grades) {
                total += grade; 
            }
            return total / grades.size(); 
        }
}
    

