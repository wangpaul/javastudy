package com.fkjava;

import java.io.File;
import java.io.IOException;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 11:24
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());

        File tmpFile = File.createTempFile("aaa", ".txt", file);
        tmpFile.deleteOnExit();
        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile对象是否存在：" + newFile.exists());
        newFile.createNewFile();
        newFile.mkdir();
        String[] fileList = file.list();
        System.out.println("===当前路径下所有文件和路径如下===");
        for (String fileName : fileList){
            System.out.println(fileName);
        }
        File[] roots = File.listRoots();
        System.out.println("===系统所有跟路径如下===");
        for (File root : roots){
            System.out.println(root);
        }
    }
}
