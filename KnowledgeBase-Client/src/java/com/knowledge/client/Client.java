/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knowledge.client;

import com.knowledge.ws.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author doro1
 */
public class Client {
    
    private static void  printMenu() {
        System.out.println("\n==================\n    Knowedge Database");
        System.out.println("1. Create new record");
        System.out.println("2. Create new tag");
        System.out.println("3. Connect record and tag");
        System.out.println("4. Add file to record");
        System.out.println("5. Get file");
        System.out.println("6. Get list of records");
        System.out.println("7. Get list of tags");
        System.out.println("8. Get tagged records");
        System.out.println("9. Delete tag");
    }
    
    public static void main(String[] args) {
        KnowledgeBaseWebService_Service serviceHolder = 
                new KnowledgeBaseWebService_Service();
        KnowledgeBaseWebService service = 
                serviceHolder.getKnowledgeBaseWebServicePort();
        Scanner in = new Scanner(System.in);
        
        while (true) {
            printMenu();
            int operation = in.nextInt();
            
            switch (operation) {
                case 1: {
                    in.nextLine();
                    System.out.println("Enter record title");
                    String title = in.nextLine();
                    
                    System.out.println("Enter record summary");
                    String summary = in.nextLine();
                    
                    System.out.println("Record created with id: " + 
                            String.valueOf(service.addNewRecord(
                                    title, summary)));
                    break;
                }
                case 2: {
                    in.nextLine();
                    System.out.println("Enter tag name");
                    String name = in.nextLine();
                    
                    System.out.println("Tag created with id: " + 
                            String.valueOf(service.createTag(name)));
                    break;
                }
                case 3: {
                    in.nextLine();
                    System.out.println("Enter record id");
                    int recordId = in.nextInt();
                    
                    System.out.println("Enter tag id");
                    int tagId = in.nextInt();
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(tagId);
                    
                    service.addTag(recordId, list);
                    System.out.println("Tag added");
                    break;
                }
                case 4: {
                    in.nextLine();
                    System.out.println("Enter record id");
                    int recordId = in.nextInt();
                    
                    System.out.println("Enter full filepath");
                    in.nextLine();
                    String fullpathname = in.nextLine();
                    String filename = "";
                    
                    try {
                        File file = new File(fullpathname);
                        filename = file.getName();
                        byte[] bytefile = new byte[(int)file.length()];
                        FileInputStream fileInputStream = new FileInputStream(file);
                        fileInputStream.read(bytefile);
                        service.addFile(recordId, filename, bytefile);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("File " + filename + " added");
                    break;
                }
                case 5: {
                    in.nextLine();
                    System.out.println("Enter record id");
                    int recordId = in.nextInt();
                    
                    System.out.println("Enter filename, what you needed");
                    in.nextLine();
                    String filename = in.nextLine();
                    String fullpath = "";
                    try {
                        fullpath = "C:\\dev\\" + filename;
                        FileOutputStream fos = new FileOutputStream(fullpath);
                        fos.write(service.getFile(recordId, filename));
                        fos.close();
                        System.out.println("File downloaded to " +
                            (new File(fullpath)).getAbsolutePath());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                    break;
                }               
                case 6: {
                    System.out.println("List of records:\n" + 
                            service.getRecordMap());
                    break;
                }
                case 7: {
                    System.out.println("List of tags:\n" + 
                            service.getTagMap());
                    break;
                }
                case 8: {
                    in.nextLine();
                    System.out.println("Enter tag id");
                    int id = in.nextInt();
                    
                    System.out.println("List of tagged records:\n" + 
                            service.getTaggedRecords(id));
                    break;
                }
                case 9: {
                    in.nextLine();
                    System.out.println("Enter tag id");
                    int id = in.nextInt();
                    
                    service.removeTag(id);
                    System.out.println("Tag removed");
                    break;
                }
            }
        }
    }
}
