package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {


    @Test
    public void test1(){
        //   /Users/staner/IdeaProjects/EU3TestNGSelenium2/src/test/resources/textfile.txt
        //   /Users/staner/IdeaProjects/EU3TestNGSelenium2
        //     src/test/resources/textfile.txt

        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/textfile.txt";

        String fullPath = projectPath + "/" + filePath;

        System.out.println(fullPath);

    }
}
