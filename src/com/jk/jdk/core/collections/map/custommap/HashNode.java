/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.core.collections.map.custommap;

import java.util.LinkedList;

/**
 *
 * @author ic034480
 */
public class HashNode {
    Object key;
    Object value;
    LinkedList<Object> list;
    
    public void initList() {
        list = new LinkedList<Object>();
    }
}
