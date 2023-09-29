package main.test;

import javax.lang.model.SourceVersion;
import java.io.File;

/*
새로 저장하려는 파일의 이름이 “20200309_최종_확정2.png”이라고 할 때, 기존의 파일과 중복되므로 해당 파일의 이름은 “20200309_최종_확정2(1).png”로 변경되어야 한다.

 */
public class DuplFile {

    public static String generateUniquedFileName(String basePath, String desireFileName){
        File file = new File(basePath, desireFileName);

        if(!file.exists()){
            ///원하는 파일명이 중복되지 않은 경우
            return desireFileName;
        }else{
            //파일명이 중복되는 경우
            int counter = 1;
            String fileNameWithoutExt = desireFileName.substring(0, desireFileName.lastIndexOf(".")); //확장명 제외한 이름 추출
            String fileExt = desireFileName.substring(desireFileName.lastIndexOf("."));

            System.out.println(fileNameWithoutExt + "fileNameWithoutExt");
            System.out.println("fileExt" + fileExt);

            while(true){
                String newFileName = String.format("%s(%d)%s", fileNameWithoutExt, counter, fileExt);
                file = new File(basePath, newFileName);

                if(!file.exists()){
                    return newFileName;
                }
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        String basePath = "/path/to/your/directory"; //기존 파일 저장된 경로
        String desiredFileName = "20200309_최종_확정2.png"; //새로 저장하려는 파일명

        String uniquedFileName = generateUniquedFileName(basePath, desiredFileName);
        System.out.println("uniquedFileName = " + uniquedFileName);
    }
}
