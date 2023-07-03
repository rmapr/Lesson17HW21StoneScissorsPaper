package game.entity;

import lombok.Data;

import java.util.List;

@Data
public class Computer {
    private List<Subj> hand = List.of(Subj.values());
}
