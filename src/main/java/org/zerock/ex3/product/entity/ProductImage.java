package org.zerock.ex3.product.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable //해당객체를 엔티티가 아닌 다른 엔티티의 속성값으로 사용한다고 명시
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ProductImage implements Comparable<ProductImage> {

    private int idx;

    private String fileName;

    @Override
    public int compareTo(ProductImage o) {
        return this.idx - o.idx;
    }
}
