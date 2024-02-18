package org.example.ddd.entry.scrum.data;

import org.example.ddd.entry.scrum.BacklogItemStatusType;

public class ClientMain {

    public static void main(String[] args) {
        BacklogItem backlogItem = mockGetItem();
        backlogItem.setSprintId("sprint-1");
        backlogItem.setStatus(BacklogItemStatusType.COMMITTED);
        // 其他操作
        System.out.printf("after task commit ---\n" +
                "task id: %s,task status: %s, sprint id: %s",
                backlogItem.getId(), backlogItem.getStatus().toString(), backlogItem.getSprintId());
    }

    /**
     * 模拟 获取 有状态的 BacklogItem
     * @return BacklogItem
     */
    static BacklogItem mockGetItem() {
        return new BacklogItem("item-1");
    }
}
