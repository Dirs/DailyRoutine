package per.chq.dailyroutine.entity;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Index;
import io.objectbox.annotation.Unique;
import io.objectbox.relation.ToMany;

@Entity
public class Group {
    @Id
    public long id;

    @Unique
    public String name;

    public String description;

    @Backlink(to = "group")
    public ToMany<Plan> plans;
}
