package com.example.to_donotes;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

    @Entity(tableName = "my_notes")
public class Note {
    private String title;
    private String dips;

  @PrimaryKey(autoGenerate= true)
    private int id;

        public Note(String title, String dips) {
        this.title = title;
        this.dips = dips;
    }

    public void setId(int id) { this.id = id; }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDips() {
        return dips;
    }

    public void setDips(String dips) {
        this.dips = dips;
    }
}
