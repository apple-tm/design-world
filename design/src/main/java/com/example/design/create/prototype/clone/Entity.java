package com.example.design.create.prototype.clone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Entity implements Cloneable, Serializable {

    private Integer id = 1;

    private List<String> list = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    /**
     * 克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅克隆
//        return super.clone();

        // 深克隆
        return this.deepClone();
    }

    /**
     * 采用序列化反序列化克隆，实现深克隆
     *
     * @return
     */
    public Entity deepClone() {
        Entity entity = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            entity = (Entity) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entity;
    }
}
