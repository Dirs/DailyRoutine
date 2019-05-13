package per.chq.dailyroutine.entity;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Unique;
import io.objectbox.relation.ToMany;

@Entity
public class PlanDate {
    @Id
    public long id;

    public int year;

    public int month;

    public int dayOfMonth;

    @Backlink(to = "planDate")
    public ToMany<Plan> plans;
}
