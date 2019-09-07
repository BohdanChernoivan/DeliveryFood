package alevel.com.delivery_food.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Order {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "order_id", unique = true)
    private UUID orderId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "order_food", nullable = false)
    private String orderFood;
}

//    @OneToOne(cascade = CascadeType.ALL, targetEntity = Order.class)
//    cascade=CascadeType.ALL, orphanRemoval = true, unique = true
//    @OneToOne(mappedBy = "address", targetEntity = Order.class, cascade=CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "address_customer")

//    @OneToOne(mappedBy = "customerId", targetEntity = User.class)

//    @MapsId
//    @OneToOne(targetEntity = User.class)
//    @JoinColumn(name = "address")
//    private String address;