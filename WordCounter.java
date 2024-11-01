import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter 
{

    public static void main(String[] args) {
        String filePath = "file1.txt";

        try {
            WordStatistics stats = calculateWordStatistics(filePath);
            System.out.println("Number of words: " + stats.getWordCount());
            System.out.println("Average word size: " + stats.getAverageWordSize());
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static WordStatistics calculateWordStatistics(String filePath) throws IOException {
        int wordCount = 0;
        int totalWordLength = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] words = line.split("\\s+");
                wordCount += words.length;
                for (String word : words) 
                {
                    totalWordLength += word.length();
                }
            }
        }

        double averageWordSize = (wordCount > 0) ? (double) totalWordLength / wordCount : 0;
        return new WordStatistics(wordCount, averageWordSize);
    }
}

class WordStatistics {
    private int wordCount;
    private double averageWordSize;

    public WordStatistics(int wordCount, double averageWordSize) {
        this.wordCount = wordCount;
        this.averageWordSize = averageWordSize;
    }

    public int getWordCount() 
    {
        return wordCount;
    }

    public double getAverageWordSize() {
        return averageWordSize;
    }
}