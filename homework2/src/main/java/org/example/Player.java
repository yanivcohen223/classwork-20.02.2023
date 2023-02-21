package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Player implements IPlayer{

    protected String name;
    protected String favoriteGenre;





}
