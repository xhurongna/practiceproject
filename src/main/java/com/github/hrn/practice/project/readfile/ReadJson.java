package com.github.hrn.practice.project.readfile;

import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.Map;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class ReadJson {

    public void getCitys(String filePath) {
        try {
            String input = readTxtFile(filePath);
            JSONObject jsonObject = JSONObject.parseObject(input);
            System.out.println("解析json后的文件为");
            Map<Integer, JSONObject> map = (Map<Integer, JSONObject>) jsonObject.getJSONObject("data").get("city_list");
            System.out.println("insert into webCity(cityCode, cityName) values ");
            for (Map.Entry<Integer, JSONObject> entry : map.entrySet()) {
                System.out.println("('" + entry.getKey() + "'" + ", '" + map.get(entry.getKey()).getString("name") + "'),");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String readTxtFile(String filePath) throws IOException {
        String encoding = "UTF-8";
        File file = new File(filePath);
        String buffer = "";
        if (file.isFile() && file.exists()) {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), encoding);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String lineTxt = null;
            StringBuilder stringBuilder = new StringBuilder();
            while ((lineTxt = bufferedReader.readLine()) != null) {
                stringBuilder.append(lineTxt);
            }
            inputStreamReader.close();
            buffer = stringBuilder.toString();
            System.out.println("读取到当前文件为 ");
            System.out.println(buffer);
        } else {
            System.out.println("找不到文件");
        }
        return buffer;
    }

    public static void main(String[] args) {
        ReadJson readJson = new ReadJson();
        readJson.getCitys("/Users/hurongna/IdeaProjectsBJ/practiceproject/src/main/resource/city-data.json");
    }
}
