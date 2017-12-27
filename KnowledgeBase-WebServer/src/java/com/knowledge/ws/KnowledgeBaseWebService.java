/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knowledge.ws;

import com.knowledge.session.KnowledgeBaseSession;
import com.knowledge.session.KnowledgeBaseSessionLocal;
import com.knowledge.utils.MapHelper;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;

/**
 *
 * @author doro1
 */
@WebService(serviceName = "KnowledgeBaseWebService")
public class KnowledgeBaseWebService {

    @EJB
    private KnowledgeBaseSessionLocal session;

    @WebMethod()
    public int addNewRecord(String title, String summary) {
        return  session.addNewRecord(title, summary);
    }
    
    @WebMethod()
    public void addTag(int recordId, List<Integer> tagIds) {
        session.addTag(recordId, tagIds);
    }
    
    @WebMethod()  
    public void addFile(int recordId, String fileName, byte[] fileData) {
        session.addFile(recordId, fileName, fileData);
    }
  
    @WebMethod()
    public int createTag(String tagName){
        return session.createTag(tagName);
    }
    
    @WebMethod()
    public byte[] getFile(int recordId, String fileName) {
        return session.getFile(recordId, fileName);
    }
    
    @WebMethod()
    public void removeTag(int tagId) {
        session.removeTag(tagId);
    }
    
    @WebMethod()
    public String getTagMap() {
        return MapHelper.map2str(session.getTagMap());
    }
    
    @WebMethod()
    public String getRecordMap() {
        return MapHelper.map2str(session.getRecordMap());
    }
    
    @WebMethod()
    public String getTaggedRecords(int tagId) {
        return MapHelper.map2str(session.getTaggedRecords(tagId));
    }
    
    @WebMethod()
    public String sayHello(String str) {
        return "hello" + str;
    } 
}
