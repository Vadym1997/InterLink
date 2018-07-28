package Person.consciousness;

import java.util.Objects;

public class Knowledge {
    int level;

    public Knowledge(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knowledge knowledge = (Knowledge) o;
        return level == knowledge.level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int hashCode() {

        return Objects.hash(level);
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "level=" + level +
                '}';
    }
}



