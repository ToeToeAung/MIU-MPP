package MPP_Week3_Day2_Lab_Prob4_Level3;

import java.util.*;
import java.util.stream.*;

public class ExamData {
    private String studentName;
    private double testScore;

    public ExamData(String name, double score) {
        studentName = name;
        testScore = score;
    }

    public double getTestScore() {
        return testScore;
    }

    public static void main(String[] args) {
        List<ExamData> data = new ArrayList<ExamData>() {{
            add(new ExamData("George", 91.3));
            add(new ExamData("Tom", 88.9));
            add(new ExamData("Rick", 80));
            add(new ExamData("Harold", 90.8));
            add(new ExamData("Ignatius", 60.9));
            add(new ExamData("Anna", 77));
            add(new ExamData("Susan", 87.3));
            add(new ExamData("Phil", 99.1));
            add(new ExamData("Alex", 84));
        }};
        // Use DoubleSummaryStatistics to summarize the test scores
        DoubleSummaryStatistics stats = data.stream()
                                             .mapToDouble(ExamData::getTestScore)
                                             .summaryStatistics();

        System.out.println("The top Test Score: " + stats.getMax());
        System.out.println("The lowest Test Score: " + stats.getMin());
        System.out.println("The average Test Score: " + stats.getAverage());
    }
}
