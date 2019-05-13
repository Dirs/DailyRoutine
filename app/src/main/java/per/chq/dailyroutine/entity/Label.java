package per.chq.dailyroutine.entity;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Index;
import io.objectbox.annotation.Unique;
import io.objectbox.relation.ToMany;

@Entity
public class Label {

    @Id
    public long id;

    @Unique
    public String name;

    @Backlink(to = "labels")
    public ToMany<Plan> plans;
}
