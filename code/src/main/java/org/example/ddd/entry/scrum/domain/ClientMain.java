package org.example.ddd.entry.scrum.domain;


public class ClientMain {

    public static void main(String[] args) {
        mockGetItem().commitTo("sprint-1");
    }

    /**
     * 模拟 获取 有状态的 BacklogItem
     * @return BacklogItem
     */
    static BacklogItem mockGetItem() {
        return new BacklogItem("item-1");
    }
}
