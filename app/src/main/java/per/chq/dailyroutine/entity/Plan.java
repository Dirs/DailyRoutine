package per.chq.dailyroutine.entity;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

public abstract class Plan {
    @Id
    public long id;
    public String name;
    public String description;

    @Backlink(to = "plans")
    public ToOne<Group> group;
    @Backlink(to = "plans")
    public ToMany<Label> labels;

    public int score;

    @Backlink(to ="plan")
    public ToOne<FinishStatus> finishStatus;

    /**
     * 是否存在配置周期
     */
    public ToOne<CyclePlanGroup> cycleGroup;

    public long createTime;

    /**
     * 计划时间
     */
    @Backlink(to = "plans")
    public ToOne<PlanDate> planDate;

    public long finishTIme;
}
