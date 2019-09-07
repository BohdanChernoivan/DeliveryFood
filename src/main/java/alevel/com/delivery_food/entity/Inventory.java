package alevel.com.delivery_food.entity;

import lombok.*;

import javax.persistence.*;


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
    @Column(name = "nameDish", unique = true)
    private String nameDish;

    @Column(name = "available")
    private int available;
}
