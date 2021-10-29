package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME( desc: "Home"),
    MOBILE( description: "Mobile"),
    COMMERCIAL(descriprion: "Commercial");

    private final String description;

}
