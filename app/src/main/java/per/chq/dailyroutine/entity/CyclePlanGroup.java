package per.chq.dailyroutine.entity;

import java.util.List;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class CyclePlanGroup {
    @Id
    public long id;

    public ToOne<Plan> basePlan;

    /**
     * 需要重复的周期数
     */
    public int totalTimes;

    /**
     * 当前所在的周期数，初始为1
     */
    public int curentTime = 1;

    /**
     * 单个周期的长度
     */
    public int totalInterval;

    /**
     * 单个周期内各个计划的偏移位置
     */
    public List<Integer> intervalList;

    /**
     * 当前的偏移列表的索引
     */
    public int curentIntervalIndex;

}
