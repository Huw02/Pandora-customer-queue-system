package org.example.pandoracustomerqueuesystem.model;

import java.util.List;

public class Queue {
    List<User> queueList;

    public Queue(List<User> queueList) {
        this.queueList = queueList;
    }

    public List<User> getQueueList() {
        return queueList;
    }

    public void setQueueList(List<User> queueList) {
        this.queueList = queueList;
    }
}
