package plants;

import lombok.Getter;

@Getter
public class Plants{


    private final int id = 15;
    private final int weigth = 1;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "\u2618";
    }
}
