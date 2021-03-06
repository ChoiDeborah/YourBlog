package blog.api.tag.model.entity;

import blog.common.model.entity.BasicColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tag extends BasicColumn {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long no;

  // 이름
  private String name;
}
