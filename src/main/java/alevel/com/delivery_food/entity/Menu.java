package alevel.com.delivery_food.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Menu {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "dish_id", unique = true)
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID dishID;

    @NonNull
    @OrderBy("firstName asc")
    @Column(name = "dish_name")
    private String dishName;

    @Column(name = "isAvailable")
    @org.hibernate.annotations.Type(type="yes_no")
    private boolean isAvailable;
}
