package Sem4.team;

import java.util.ArrayList;
import java.util.List;

import Sem4.warriors.DistanceAttacker;
import Sem4.warriors.Warrior;

public class Team<T extends Warrior> {

    private List<T> team = new ArrayList<>();
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public Team<T> addWarrior(T warrior) {
        team.add(warrior);
        return this;
    }

    public int getMaxDistance() {
        int distance = 0;
        for (T item : team) {
            if (!(item instanceof DistanceAttacker)) {
                continue;
            }
            DistanceAttacker temp = (DistanceAttacker) item;
            if (temp.getDistance() > distance) {
                distance = temp.getDistance();
            }
        }
        return distance;
    }

    public int getMinShield() {
        int minShield = 0;
        for (T item : team) {
            if (minShield < item.getMinShield() & item.getMinShield() > 0) {
                minShield = item.getMinShield();
            }
        }
        return minShield;
    }

    public int getTeamDamage() {
        int sum = 0;
        for (T item : team) {
            sum += item.getMaxDamage();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder teamB = new StringBuilder();
        for (T item : team) {
            teamB.append(item.toString() + "\n");
        }
        return String.format("TEAM '%s', MaxDistance: %d, MinShield: %d, MaxTeamDamage: %d, \n%s",
                name, getMaxDistance(), getMinShield(), getTeamDamage(), teamB);
    }
}
