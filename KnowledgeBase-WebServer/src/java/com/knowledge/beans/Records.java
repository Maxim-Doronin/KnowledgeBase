/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knowledge.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author doro1
 */
@Entity
public class Records implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    public String title;
    public String summary;
    private Set<Tag> tags;
    private Map<String, byte[]> files;
    
    public Records() {
        tags = new HashSet<>();
        files = new HashMap<>();
    }
    
    public Records(String title, String summary) {
        this.title = title;
        this.summary = summary;
        tags = new HashSet<>();
        files = new HashMap<>();
    }
    
    public void addTag(Tag tag) {
        tags.add(tag);
    }
    
    public Set<Tag> getTags() {
        return tags;
    }
    
    public void addFile(String fileName, byte[] fileData) {
        files.put(fileName, fileData);
    }
    
    public byte[] getFile(String fileName) {
        return files.get(fileName);
    }
    
    public void removeTag(Tag tag) {
        if (tags.contains(tag)) {
            tags.remove(tag);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Records)) {
            return false;
        }
        Records other = (Records) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.knowledge.beans.Records[ id=" + id + " ]";
    }
    
    
    
    
    
    
    
    
    
    
}
