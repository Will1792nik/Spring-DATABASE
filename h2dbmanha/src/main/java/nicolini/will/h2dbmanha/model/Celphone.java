package nicolini.will.h2dbmanha.model;

import lombok.*;

/**
 * @author williamnicolini
 * @since 04/05/2020 18:30
 * @version Gradle/Lombok Celulares 2.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Celphone {
    @Getter @Setter
    private String model;
    @Getter @Setter
    private String mark;
    @Getter @Setter
    private String RAM;
    @Getter @Setter
    private String memory;
}
