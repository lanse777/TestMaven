package com.lcb.test01;

public class Test01 {
	public static void main(String[] args) {
	    String json = "{\"username\":\"jack\",\"username\":\"aaa\",\"username\":\"bbb\"}";
        findName(json,"bbb");
        System.out.println("aaaaaaaaaa");
    }
    public static void findName(String json, String targetName) {
        // 去大括号
        String substring = json.substring(1, json.length() - 1);
        // 先按逗号拆分
        String[] split = substring.split(",");

        for (String s : split) {
            String strings = s.split(":")[1];

            if (strings.equals("\"" + targetName + "\"")){
                System.out.println(targetName);
                return;
            }
        }

    }
}
