package home_work_6;

import java.io.*;
import java.util.Scanner;

public class BigAmountFiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите адрес папки, из которой мы будет считывать файлы: ");
        String directiryPath = in.nextLine();

        File dir = new File(directiryPath);
        if (!dir.exists() && !dir.isDirectory()) {
            System.out.println("Неверная директория.");
            return;
        }

        File resultFile = new File("result.txt");

        do {
            System.out.println("Список доступных файлов:");
            File[] files = dir.listFiles();
            if (files == null) {
                System.out.println("В директории нет файлов.");
                return;
            }

            for (File file : files) {
                System.out.println(file.getName());
            }
            System.out.println("Введите имя файла, с которым будете работать? (для выхода нажмите Enter)");
            String selectedFile = in.nextLine();
            if (selectedFile.isEmpty()) {
                break;
            }

            String pathToFile = directiryPath + "/" + selectedFile;
            File file = new File(pathToFile);
            StringBuilder builder = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                int read;
                while ((read = reader.read()) != -1) {
                    builder.append((char) read);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String textAsstring = builder.toString();

            do {
                System.out.println("Введите слово для поиска. (для выхода нажмите Enter)");

                String whatNeedToSearch = in.nextLine();
                if (whatNeedToSearch.isEmpty()) {
                    break;
                }

                ISearchEngine searchEngine = new EasySearch();

                String needToBeSaved = selectedFile + " - " + whatNeedToSearch + " - " +
                        searchEngine.search(textAsstring, whatNeedToSearch) + "\n";

                try (Writer writer = new FileWriter(resultFile, true)) {
                    char[] charArray = needToBeSaved.toCharArray();
                    for (char c : charArray) {
                        writer.write(c);
                    }
                    writer.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            } while (true);
        } while (true);

        if (resultFile.exists()) {
            System.out.println("Результат выполнения поиска сохранен в: " + resultFile.getAbsolutePath());
        }
    }
}
