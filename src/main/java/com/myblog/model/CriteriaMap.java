package com.myblog.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2018/2/10.
 */
public class CriteriaMap {
    private Map<String,Data> map = new HashMap<String, Data>();
    public void put(String key,Object value){
        map.put(key,new Data(value));
    }
    public Data get(String key){
        return map.get(key);
    }
    public void put(String key,Object value,Type type){
        map.put(key,new Data(value,type));
    }
    public enum Type{
        is,regex,gt,gte,lt,lte
    }
    public Set<String > keySet(){
        return map.keySet();
    }
    public class Data{
        private Type type;
        private Object object;
        Data(Object object){
            this.object=object;
            this.type=Type.is;
        }

        public Data( Object object,Type type) {
            this.type = type;
            this.object = object;
        }

        public Type getType() {
            return type;
        }

        public Object getObject() {
            return object;
        }
    }
}
