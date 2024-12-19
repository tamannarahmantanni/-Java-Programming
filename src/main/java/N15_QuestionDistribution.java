public class N15_QuestionDistribution {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        for (int fiveMarkQuestions = 0; fiveMarkQuestions <= totalQuestions; fiveMarkQuestions++) {
            int tenMarkQuestions = totalQuestions - fiveMarkQuestions;
            int total = (fiveMarkQuestions * 5) + (tenMarkQuestions * 10);

            if (total == totalMarks) {
                System.out.println("5 marks question is " + fiveMarkQuestions);
                System.out.println("10 marks question is " + tenMarkQuestions);
                break;
            }
        }
    }
}
