package com.kate;

/**
 * Created by 016006 on 2/26/2019.
 */
public class ToDo {
    private String title;
    private String description;
    private int priority;

    public ToDo(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Todo Task" +
                "Title: '" + title + ' ' +
                ", Description: '" + description + ' ' +
                ", Priority: " + priority;
    }
}
