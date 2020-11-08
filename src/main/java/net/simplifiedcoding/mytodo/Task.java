package net.simplifiedcoding.mytodo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Task implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    private String task;
    @ColumnInfo(name = "roll_num")
    private String desc;
    public int getId() {
        return id; }
    public void setId(int id) {
        this.id = id; }
    public String getTask() {
        return task; }
    public void setTask(String task) {
        this.task = task; }
    public String getDesc() {
        return desc; }
    public void setDesc(String desc) {
        this.desc = desc; }
}
