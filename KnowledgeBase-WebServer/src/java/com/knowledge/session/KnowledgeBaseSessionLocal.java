/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knowledge.session;

import com.knowledge.beans.Records;
import com.knowledge.beans.Tag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;

/**
 *
 * @author doro1
 */
@Local
public interface KnowledgeBaseSessionLocal {

    int addNewRecord(String title, String summary);
    
    void addTag(int recordId, List<Integer> tagIds);
     
    void addFile(int recordId, String fileName, byte[] fileData);
  
    int createTag(String tagName);
    
    byte[] getFile(int recordId, String fileName);
    
    void removeTag(int tagId);
    
    Map<Integer, String> getTagMap();
    
    Map<Integer, String> getRecordMap();
    
    Map<Integer, String> getTaggedRecords(int tagId);
    
}
