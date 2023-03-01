package cnLabs.cache_demo.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee implements Serializable {  // In order for an object to be serialized and stored in the cache, it must implement this class. You'll also find that a serialVersionUID field has been added. This field is used to verify that the loaded class and the serialized object are compatible.

    private static final long serialVersionUID = 3147927200505443659L;

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

}