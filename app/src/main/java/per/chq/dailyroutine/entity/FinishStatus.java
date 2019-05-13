package per.chq.dailyroutine.entity;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class FinishStatus {
    /**
     * 按完成按钮即完成
     */
    public static final int TYPE_CONFIRM = 0;
    /**
     * 按完成按钮时需要选择已完成的次数
     */
    public static final int TYPE_TIMES = 1;
    /**
     * 按完成按钮时需要选择已完成的时长
     */
    public static final int TYPE_DURATION = 2;

    @Id
    public long id;

    @Backlink(to = "finishStatus")
    public ToOne<Plan> plan;

    public int type = TYPE_CONFIRM;

    public boolean isConfirm;

    public int totalTimes;

    public int finishTime;

    public long totalDuration;

    public long finishDuration;
}
