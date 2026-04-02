import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_70 {

    private static class QuestionData {
        String asker;
        String displaySets;
        BigInteger correctAnswer;
    }

    private static BigInteger gcd(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }

    private static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.divide(gcd(a, b)).multiply(b);
    }

    private static QuestionData parseQuestion(String line) {
        String[] parts = line.trim().split("\\s+");
        if (parts.length != 2) {
            return null;
        }

        String asker = parts[0];
        String[] rawNums = parts[1].split(",");
        if (rawNums.length < 2 || rawNums.length > 7) {
            return null;
        }

        BigInteger currentLcm = BigInteger.ONE;
        StringBuilder display = new StringBuilder();

        for (int i = 0; i < rawNums.length; i++) {
            String token = rawNums[i].trim();
            if (!token.matches("\\d+")) {
                return null;
            }

            int value;
            try {
                value = Integer.parseInt(token);
            } catch (NumberFormatException ex) {
                return null;
            }

            if (value < 1 || value > 100) {
                return null;
            }

            if (i > 0) {
                display.append(",");
            }
            display.append(value);

            currentLcm = lcm(currentLcm, BigInteger.valueOf(value));
        }

        QuestionData data = new QuestionData();
        data.asker = asker;
        data.displaySets = display.toString();
        data.correctAnswer = currentLcm;
        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            if (!scanner.hasNextLine()) {
                System.out.println("Invalid Input");
                return;
            }

            String firstLine = scanner.nextLine().trim();
            if (!firstLine.matches("\\d+")) {
                System.out.println("Invalid Input");
                return;
            }

            int n = Integer.parseInt(firstLine);
            if (n <= 0 || n > 10 || n % 2 != 0) {
                System.out.println("Invalid Input");
                return;
            }

            Map<String, Integer> points = new HashMap<>();
            String firstQuestionPlayer = null;
            String firstAnswerPlayer = null;

            for (int i = 0; i < n / 2; i++) {
                if (!scanner.hasNextLine()) {
                    System.out.println("Invalid Input");
                    return;
                }
                String questionLine = scanner.nextLine();
                QuestionData q = parseQuestion(questionLine);
                if (q == null) {
                    System.out.println("Invalid Input");
                    return;
                }

                if (!scanner.hasNextLine()) {
                    System.out.println("Invalid Input");
                    return;
                }
                String answerLine = scanner.nextLine().trim();
                String[] answerParts = answerLine.isEmpty() ? new String[0] : answerLine.split("\\s+");

                if (answerParts.length < 2 || answerParts.length > 3 || !"A".equals(answerParts[0])) {
                    System.out.println("Invalid Input");
                    return;
                }

                String answerPlayer = answerParts[1];

                if (firstQuestionPlayer == null) {
                    firstQuestionPlayer = q.asker;
                    firstAnswerPlayer = answerPlayer;
                }

                points.putIfAbsent(q.asker, 0);
                points.putIfAbsent(answerPlayer, 0);

                System.out.println(q.asker + "'s question is: " + q.displaySets);

                boolean isPass = false;
                boolean isCorrect = false;

                // Sample coverage: if answer token is omitted, treat as correct answer.
                if (answerParts.length == 2) {
                    isCorrect = true;
                } else if ("PASS".equals(answerParts[2])) {
                    isPass = true;
                } else if (answerParts[2].matches("-?\\d+")) {
                    BigInteger given = new BigInteger(answerParts[2]);
                    isCorrect = given.equals(q.correctAnswer);
                } else {
                    System.out.println("Invalid Input");
                    return;
                }

                if (isPass) {
                    System.out.println("Question is PASSed");
                    System.out.println("Answer is: " + q.correctAnswer);
                    System.out.println(answerPlayer + ": 0points");
                } else if (isCorrect) {
                    points.put(answerPlayer, points.get(answerPlayer) + 10);
                    System.out.println("Correct Answer");
                    System.out.println(answerPlayer + ": " + points.get(answerPlayer) + "points");
                } else {
                    System.out.println("Incorrect Answer");
                    System.out.println(answerPlayer + ": " + points.get(answerPlayer) + "points");
                }
            }

            System.out.println("Total Points:");
            int p1 = points.getOrDefault(firstQuestionPlayer, 0);
            int p2 = points.getOrDefault(firstAnswerPlayer, 0);

            System.out.println(firstQuestionPlayer + ": " + p1 + "points");
            System.out.println(firstAnswerPlayer + ": " + p2 + "points");

            if (p1 > p2) {
                System.out.println("Game Result: " + firstQuestionPlayer + " is winner");
            } else if (p2 > p1) {
                System.out.println("Game Result: " + firstAnswerPlayer + " is winner");
            } else {
                System.out.println("Game Result: Draw");
            }

        } catch (Exception ex) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }
}