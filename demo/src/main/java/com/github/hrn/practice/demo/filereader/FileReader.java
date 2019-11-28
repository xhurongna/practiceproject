package com.github.hrn.practice.demo.filereader;

import java.io.*;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class FileReader {

    public static void readTxtFile(String filePath) throws IOException {
        String encoding = "UTF-8";
        File file = new File(filePath);
        if (file.isFile() && file.exists()) {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), encoding);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String lineTxt = null;
            StringBuilder stringBuilder= new StringBuilder();
            while ((lineTxt = bufferedReader.readLine()) != null) {
                stringBuilder.append(lineTxt);
            }
            inputStreamReader.close();
            String buffer = stringBuilder.toString();
            System.out.println(buffer);
        } else {
            System.out.println("找不到文件");
        }
    }


    public static void main(String[] args) throws IOException {
        String filePath = "/Users/hurongna/IdeaProjectsBJ/practiceproject/src/main/resource/city-data.json";
        readTxtFile(filePath);
    }
}
