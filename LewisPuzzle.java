import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class LewisPuzzle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finished = false;
        String textInput;
        do {
            System.out.println("Enter a comma separated list of words (or an empty list to quit):");
            textInput = scanner.nextLine();
            if (textInput.isEmpty())
            {
                System.out.println("Thank You for playing the game ");
                finished = true;
            }
            else if(isWordChain(readWordList(textInput)))
            {
                System.out.println("Valid chain of words from Lewis Carroll's word-links game.");
            } else  {
                System.out.println("Not a valid chain of words from Lewis Carroll's word-links game.");
            }
        }while(!finished);
        scanner.close();
    }


    public static ArrayList<String> readDictionary() {
        File file = new File("words.txt");
        Scanner input;
        input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            assert input != null;
            if (!input.hasNextLine())
                break;
            list.add(input.nextLine());
        }

        return list;
    }

    public static ArrayList<String> readWordList(String commaSeparatedList) {
        var words = commaSeparatedList.split(",\\s*");
        ArrayList<String> text = new ArrayList<String>();
        Collections.addAll(text, words);

        return text;
    }

    static boolean isUniqueList(ArrayList<String> list) {
        if (list != null) {
            for (int n = 0; n < list.size() - 1; n++) {
                for (int m = n + 1; m < list.size(); m++) {
                    if (list.get(n).equals(list.get(m))) {
                        return false;
                    }
                }
            }
        }

            return true;
        }


    static boolean isEnglishWord(String englishWord) {
        return Arrays.binarySearch(readDictionary().toArray(), englishWord) >= 0;
    }


    public static boolean isDifferentByOne(String wordOne, String wordTwo) {
        if (wordOne.length() != wordTwo.length()) {
            return false;
        }
        int index = 0;
        for (int g = 0; g < wordOne.length(); g++) {
            if (wordOne.charAt(g) != wordTwo.charAt(g)) {
                index++;
            }
        }


        return index == 1;
    }

    static boolean isWordChain(ArrayList<String> list) {
        if (!isUniqueList(list)) {
            return false;
        }

        for (int i = 0, listSize = list.size(); i < listSize; i++) {
            String englishWord = list.get(i);
            if (!isEnglishWord(englishWord)) {
                return false;
            }
        }

        int count = 0;

        while (count < list.size() - 1 && isDifferentByOne(list.get(count), list.get(count + 1))) {
            count++;
        }
        return count == list.size() - 1;
    }


}