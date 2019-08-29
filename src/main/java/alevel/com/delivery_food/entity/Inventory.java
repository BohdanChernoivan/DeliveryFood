package alevel.com.delivery_food.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Inventory {

    @Id
//    @UniqueElements
    @Column(name = "nameDish", unique = true)
    private String nameDish;

    @Column(name = "available")
    private int available;
}
