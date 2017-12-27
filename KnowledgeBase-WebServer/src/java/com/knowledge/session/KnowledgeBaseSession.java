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
import javax.ejb.Stateless;

/**
 *
 * @author doro1
 */
@Stateless
public class KnowledgeBaseSession implements KnowledgeBaseSessionLocal {
    private Map<Integer, Records> mRecords;
    private Map<Integer, Tag> mTags;
    private int mLastRecordId;
    private int mLastTagId;
    
    public KnowledgeBaseSession() {
        mRecords = new HashMap<>();
        mTags = new HashMap<>();
        mLastRecordId = -1;
        mLastTagId = -1;
    }
    
    @Override
    public int addNewRecord(String title, String summary) {
        do {
            mLastRecordId++;
        } while (mRecords.containsKey(mLastRecordId));
        Records newRecord = new Records(title, summary);
        newRecord.setId(mLastRecordId);
        mRecords.put(newRecord.getId(), newRecord);
        return newRecord.getId();
    }
    
    @Override
    public void addTag(int recordId, List<Integer> tagIds) {
        Records record = mRecords.get(recordId);
        if (record == null) {
            return;
        }
        for (Integer tagId : tagIds) {
            Tag tag = mTags.get(tagId);
            if (tag == null) {
                continue;
            }
            record.addTag(tag);
        }
    }
    
    @Override
    public void addFile(int recordId, String fileName, byte[] fileData) {
        Records record = mRecords.get(recordId);
        record.addFile(fileName, fileData);
    }
  
    @Override
    public int createTag(String tagName){
        do {
                mLastTagId++;
        } while (mTags.containsKey(mLastTagId));
        Tag newTag = new Tag(tagName);
        newTag.setId(mLastTagId);
        mTags.put(newTag.getId(), newTag);
        return newTag.getId();
    }
    
    @Override
    public byte[] getFile(int recordId, String fileName) {
        Records record = mRecords.get(recordId);
        return record.getFile(fileName);
    }
    
    @Override
    public void removeTag(int tagId) {
        Tag tag = mTags.get(tagId);
        for (Records record : mRecords.values()) {
            record.removeTag(tag);
        }
        mTags.remove(tag.getId());
    }
    
    @Override
    public Map<Integer, String> getTagMap() {
        Map<Integer, String> result = new HashMap<>();
        for (Integer tagId : mTags.keySet()) {
            result.put(tagId, mTags.get(tagId).getName());
        }
        return result;
    }
    
    @Override
    public Map<Integer, String> getRecordMap() {
        Map<Integer, String> result = new HashMap<>();
        for (Integer recordId : mRecords.keySet()) {
            result.put(recordId, mRecords.get(recordId).title);
        }
        return result;
    }
    
    @Override
    public Map<Integer, String> getTaggedRecords(int tagId) {
        Tag tag = mTags.get(tagId);
        Map<Integer, String> result = new HashMap<>();
        for (Records record : mRecords.values()) {
            if (record.getTags().contains(tag)) {
                result.put(record.getId(), record.title);
            }
        }
        return result;
    }
}
