/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knowledge.utils;

import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author doro1
 */
public class MapHelper {
    public static String map2str(Map<Integer, String> map) {
        String result = "";
        for (Entry<Integer, String> entry : map.entrySet()) {
            result += String.valueOf(entry.getKey()) + " : " + 
                    entry.getValue() + "\n";
        }
        return result;
    }
}
